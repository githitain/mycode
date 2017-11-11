package com.iii.tests.dctests;

/**

 * @version $Id: AcquisitionsCollectInfo.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

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


public class AcquisitionsCollectInfo {
	
	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	static String repNameList = "C:\\DC\\regressionDecisionCenter\\src\\test\\resources\\ReporterSelection.xml";
	static String envSite ="dc"; // dev for erdev of dc for erqa
	
	@Test
	public static boolean CollectInfo() {
		boolean ret = true;
		boolean createReport = true;
		String[ ] linkNames;
		String[ ] fileNames;
		
		driver = UtilityTools.LoginMeIn();
		UtilityTools.MySleep(sleepTime);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		// Start verify Expenditures reports info
		try {
			 File file = new File(repNameList);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("Expenditures");
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
			    driver.findElement(By.cssSelector("span.innoText.innoTextParent")).click();
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
		
		System.out.print("\nExpenditures reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Expenditure Trends reports info
		driver = UtilityTools.LoginMeIn();
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		
		try {
			 File file = new File(repNameList);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("ExpenditureTrends");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];
			 
			 // System.out.print("\nNumber of reports:" + totalReports + "\n");

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	        // System.out.print("\nStart verify Expenditure Trends reports info \n");
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    UtilityTools.deleteInfoFile(nameFile);
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);
			    
			    // System.out.print("\nReport: " + nameLink +" - file location: " + nameFile + "\n");

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
		
		System.out.print("\nExpenditure Trends reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		 driver.quit();

		
			
		return ret;
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
	 
	        Node nValue = nlList.item(0);
	 
		return nValue.getNodeValue();
	}
}
