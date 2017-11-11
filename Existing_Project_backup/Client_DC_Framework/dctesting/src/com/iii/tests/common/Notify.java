package com.iii.tests.common;

/**

 * @version $Id: Notify.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */

import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Notify {

	public static void sendReport(String TestResults) {
		String smtpServer = "exchange.iii.com";
		String from = "sergeii@iii.com";    
		String to = "sergeii@iii.com";   
		String subject = "Test Resul";      
		String bodyText = TestResults;  

		Properties properties = new Properties();        
		properties.put("mail.smtp.host", smtpServer);        
		properties.put("mail.smtp.port", "25"); 
		properties.put("mail.smtp.auth", false);
        Session session = Session.getDefaultInstance(properties, null); 
		session.setDebug(true);
		try {            
			Message message = new MimeMessage(session);          
			message.setFrom(new InternetAddress(from));           
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));            
			message.setSubject(subject);          
			message.setText(bodyText);            
			Transport.send(message);       
		} catch (MessagingException e) {           
			e.printStackTrace();        
		}  
		System.out.println("\temail sent"); 
	}

	public static void sendChart(String htmlBody, Map<String, String> mapInlineImages) throws AddressException, MessagingException {
		String smtpServer = "exchange.iii.com";
		String from = "sergeii@iii.com";    
		String to = "sergeii@iii.com";   
		String subject = "Decision Center Test Result";
		// sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", smtpServer);        
		properties.put("mail.smtp.port", "25");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.auth", false);
 
        // creates a new session with an authenticator
        Session session = Session.getDefaultInstance(properties, null);
 
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
 
        msg.setFrom(new InternetAddress(from));
        InternetAddress[] toAddresses = { new InternetAddress(to) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
 
        // creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(htmlBody, "text/html");
 
        // creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
 
        // adds inline image attachments
        if (mapInlineImages != null && mapInlineImages.size() > 0) {
            Set<String> setImageID = mapInlineImages.keySet();
             
            for (String contentId : setImageID) {
                MimeBodyPart imagePart = new MimeBodyPart();
                imagePart.setHeader("Content-ID", "<" + contentId + ">");
                imagePart.setDisposition(Part.INLINE);
                 
                String imageFilePath = mapInlineImages.get(contentId);
                try {
                    imagePart.attachFile(imageFilePath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
 
                multipart.addBodyPart(imagePart);
            }
        }
 
        msg.setContent(multipart);
 
        Transport.send(msg);
    }
	
	public static void sendHtmlMail(String TestResults) {
		String smtpServer = "exchange.iii.com";
		String from = "sergeii@iii.com";    
		String to = "sergeii@iii.com";   
		String subject = "Decision Center Test Result";      
		String bodyText = TestResults;  

		Properties properties = new Properties();        
		properties.put("mail.smtp.host", smtpServer);        
		properties.put("mail.smtp.port", "25"); 
		properties.put("mail.smtp.auth", false);
		Session session = Session.getDefaultInstance(properties); 
        
		
		try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject(subject);

	         // Send the actual HTML message, as big as you like
	         message.setContent(bodyText, "text/html" );

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	}
}