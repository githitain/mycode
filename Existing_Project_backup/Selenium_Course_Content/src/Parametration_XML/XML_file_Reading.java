package Parametration_XML;

/**

 * @version $Id: UtilityTools.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Parametation_Propetiese_File.Properties_File_reading;
@SuppressWarnings("unused")

public class XML_file_Reading 
{
	/*static WebDriver driver;
	static String targetBrowser1;
	static String username;
	static String password;
	static String site;
	static long sleepTime = 10000;
	File logDirName= new File("C:\\DC\\dcfiles");
	//static String envDoc = "C:\\DC\\dcfiles\\Decision_Center.xml";*/
	
	public static void main(String args[]) throws Exception
	//public static WebDriver LoginMeIn () 
	{
		
	/*	try 
		{
				String sTag="targetBrowser";
				String bTag="dc";
				String envDoc = "C:\\DC\\dcfiles\\Decision_Center.xml";
				//String targetBrowser;
			
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList node = document.getElementsByTagName(bTag);
			 Node nNode = node.item(0);
			 Element eElement = (Element) nNode;
			 NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
			 Node nValue = (Node) nlList.item(0);
			 System.out.println(nValue.getNodeValue());

		} 
		catch (Exception e) 
		{
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}*/
		//getXMLTagValue("D://Workspace_2//Selenium_Course_Content//bin//Resources//TestData.xml","dc","targetBrowser");
		getXMLTagValue("dc","Skills");
		getXMLTagValue("dc","Location");
		getXMLTagValue("dc","textToSelect");
	}
	
	public static String getXMLTagValue(String bTag, String sTag) throws Exception 
	{
		 File file = new File(Properties_File_reading.getTD("TD"));
		 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		 DocumentBuilder db = dbf.newDocumentBuilder();
		 Document document = db.parse(file);
		 document.getDocumentElement().normalize();
		 NodeList node = document.getElementsByTagName(bTag);
		 Node nNode = node.item(0);
		 Element eElement = (Element) nNode;
		 NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		 Node nValue = (Node) nlList.item(0);
		 System.out.println(nValue.getNodeValue());
		 return nValue.getNodeValue();
		 
		 
	}
	
	
	public static String getTagValue(String sTag, Element eElement) 
	{
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0);
		
	 	return nValue.getNodeValue();
	}
	

	public static void deleteInfoFile (String fileName) {
		File fileTemp = new File(fileName);
		if (fileTemp.exists()){
			fileTemp.delete();
		}
	}

}
