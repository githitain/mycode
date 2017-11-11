package com.iii.tests.dctests;
/**

 * @version $Id: DecisionCenterVerification.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.iii.tests.common.DriverSelector;
import com.iii.tests.common.UtilityTools;
import com.iii.tests.common.Notify;

@SuppressWarnings("unused")

public class DecisionCenterVerification {
	
	static WebDriver driver;
	static String targetBrowser;
	static String username;
	static String password;
	static String site;
	boolean testFailed = false;
	static String testResult = "";
	static long sleepTime = 10000;
	File logDirName= new File("C:\\DC\\dcfiles");
	static String envDoc = "C:\\DC\\dcfiles\\Decision_Center.xml";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList node = document.getElementsByTagName("dc");
			 
			 Node nNode = node.item(0);
			 Element eElement = (Element) nNode;
			 
			 targetBrowser = getTagValue("targetBrowser", eElement);
			 site = getTagValue("site", eElement);
			 username = getTagValue("username", eElement);
			 password = getTagValue("password", eElement);
			 
			 
			 
			 driver = DriverSelector.selectWebDriver(targetBrowser);
			 driver.get(site);
			 
			 WebElement usernameField = driver.findElement(By.name("j_username"));
				usernameField.sendKeys(username);
			 WebElement passwordField = driver.findElement(By.name("j_password"));
				passwordField.sendKeys(password);
			 driver.findElement(By.id("submit")).click();
			 

		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		 driver.quit();
	}

	@Test
	public void test() {
		System.out.print("\nStart verification info of the Decision Center- start time: "+UtilityTools.getDateTime()+"\n");
		testResult = testResult + "Start verification info of the Decision Center- start time: "+UtilityTools.getDateTime()+"\n";
	
		// Start verify Budget info
			boolean budgetVerifyInfo = BudgetVerification.ReportVerification(driver);
			if (budgetVerifyInfo){
				System.out.println("\nPass verification of Budget reports");
				testResult = testResult + " Pass verification of Budget reports\n";
			} else {
				System.out.println("\tunable to verify Budget reports");
				testResult = testResult + "\tunable to verify Budget reports\n";
				testFailed = true;
			}
			
		// Start verify Development info
			//driver.findElement(By.id("development")).click();
			boolean devVerifyInfo = DevelopmentVerification.ReportVerification(driver);
			if (devVerifyInfo){
				System.out.println("\nPass verification of Development reports");
				testResult = testResult + " Pass verification of Development reports\n";
			} else {
				System.out.println("\tunable to verify Development reports");
				testResult = testResult + "\tunable to verify Development reports\n";
				testFailed = true;
			}
			

			// Start verify Balancing info
			boolean balancVerifyInfo = BalancingVerification.ReportVerification(driver);
			if (balancVerifyInfo){
				System.out.println("\nPass verification of Balancing reports");
				testResult = testResult + " Pass verification of Balancing reports\n";
			} else {
				System.out.println("\tunable to verify Balancing reports");
				testResult = testResult + "\tunable to verify Balancing reports\n";
				testFailed = true;
			}
			
						
			// Start verify Maintenance info
			boolean MaintenanceVerifyInfo = MaintenanceVerification.ReportVerification(driver);
			if (MaintenanceVerifyInfo){
				System.out.println("\nPass verification of Maintenance reports");
				testResult = testResult + " Pass verification of Maintenance reports\n";
			} else {
				System.out.println("\tunable to verify Maintenance reports");
				testResult = testResult + "\tunable to verify Maintenance reports\n";
				testFailed = true;
			}
						
			System.out.print("\nFinish verification info of the Decision Center- start time: "+UtilityTools.getDateTime()+"\n");
			testResult = testResult + " Finish verification info of the Decision Center- start time: "+UtilityTools.getDateTime()+"\n";
			Notify.sendReport(testResult);
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
	 
	        Node nValue = nlList.item(0);
	 
		return nValue.getNodeValue();
	}
	
}
