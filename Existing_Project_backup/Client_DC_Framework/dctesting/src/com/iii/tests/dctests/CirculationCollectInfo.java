package com.iii.tests.dctests;
/**

 * @version $Id: CirculationCollectInfo.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class CirculationCollectInfo {
	
	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	static String envDoc = "C:\\DC\\regressionDecisionCenter\\src\\test\\resources\\ReporterSelection.xml";
	static String envSite ="dc"; // dev for erdev of dc for erqa
	
	@Test
	public static boolean CollectInfo() {
		boolean ret = true;
		String[ ] linkNames;
		String[ ] fileNames;
		
		// Start verify Agency reports info
		
		driver = UtilityTools.LoginTo(envSite);
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("Agency");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[3]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				
				ret = UtilityTools.CreateReportInfo(tableName, nameFile, driver);
				
				driver.findElement(By.linkText("Evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}	
		
		System.out.print("\nAgency reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		
		// Start verify Call Number Range reports info
		driver = UtilityTools.LoginTo(envSite);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("CallNumberRange");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[4]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				ret = UtilityTools.CreateReportInfo(tableName, nameFile, driver);
				
				driver.findElement(By.linkText("Evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}	
		
		System.out.print("\nCall Number Range reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Hourly Activity reports info
		
		driver = UtilityTools.LoginTo(envSite);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("HourlyActivity");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[5]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				ret = UtilityTools.CreateReportInfo(tableName, nameFile, driver);
				
				
				driver.findElement(By.linkText("Evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}	
		
		System.out.print("\nHourly Activity reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Items reports info
		
		driver = UtilityTools.LoginTo(envSite);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("Items");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[6]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				ret = UtilityTools.CreateReportInfo(tableName, nameFile, driver);				
				
				driver.findElement(By.linkText("Evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}	
		
		System.out.print("\nItems reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Owning Location reports info
		
		driver = UtilityTools.LoginTo(envSite);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("OwningLocation");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				ret = UtilityTools.CreateReportInfo(tableName, nameFile, driver);				
				
				driver.findElement(By.linkText("Evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}	
		
		System.out.print("\nOwning Location reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Patrons reports info
		driver = UtilityTools.LoginTo(envSite);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("Patrons");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[8]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				ret = UtilityTools.CreateReportInfo(tableName, nameFile, driver);				
				
				driver.findElement(By.linkText("Evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Patrons env info");
			e.printStackTrace();

		}	
		
		System.out.print("\nPatrons reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		
		
		// Start verify Postal Code reports info
		driver = UtilityTools.LoginTo(envSite);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("PostalCode");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				ret = UtilityTools.CreateReportInfo(tableName, nameFile, driver);				
				
				driver.findElement(By.linkText("Evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Postal Code env info");
			e.printStackTrace();

		}	
		
		
		System.out.print("\nPostal Code reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Resource Sharing (Local, ILL, INN-Reach)  reports info 
		
		driver = UtilityTools.LoginTo(envSite);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("ResourceSharing");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[10]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				ret = UtilityTools.CreateReportInfo(tableName, nameFile, driver);				
				
				driver.findElement(By.linkText("Evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Resource Sharing env info");
			e.printStackTrace();

		}	
		
		
		System.out.print("\nResource Sharing reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Statistics Group reports info
		
		driver = UtilityTools.LoginTo(envSite);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("StatisticsGroup");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[11]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				ret = UtilityTools.CreateReportInfo(tableName, nameFile, driver);				
				
				driver.findElement(By.linkText("Evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Statistics Group env info");
			e.printStackTrace();

		}	
		
		
		System.out.print("\nStatistics Group reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Transaction Location reports info
		driver = UtilityTools.LoginTo(envSite);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("TransactionLocation");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				ret = UtilityTools.CreateReportInfo(tableName, nameFile, driver);				
				
				driver.findElement(By.linkText("Evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Transaction Location env info");
			e.printStackTrace();

		}	
		
		
		System.out.print("\nTransaction Location reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Transaction Type reports info 
		driver = UtilityTools.LoginTo(envSite);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("TransactionType");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[14]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				ret = UtilityTools.CreateReportInfo(tableName, nameFile, driver);				
				
				driver.findElement(By.linkText("Evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Transaction Type env info");
			e.printStackTrace();

		}	
		
		
		System.out.print("\nTransaction Type reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		
		
		return ret;
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
	 
	        Node nValue = nlList.item(0);
	 
		return nValue.getNodeValue();
	}

}
