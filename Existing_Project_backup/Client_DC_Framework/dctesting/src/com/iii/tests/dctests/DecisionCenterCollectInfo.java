package com.iii.tests.dctests;
/**

 * @version $Id: DecisionCenterCollectInfo.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

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

@SuppressWarnings("unused")

public class DecisionCenterCollectInfo {
	
	static WebDriver driver;
	static String targetBrowser;
	static String username;
	static String password;
	static String site;
	boolean testFailed = false;
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
		
		// driver.quit();
	}

	@Test
	public void test() {
		/* boolean cleanDir = UtilityTools.cleanDir(logDirName);
		if (!cleanDir){
			System.out.println("Deletion failed.");
			// System.exit(0);
		}else{
			System.out.println("Files deleted.");
		} 
		*/
		System.out.print("\nStart collecting info of the Decision Center- start time: "+UtilityTools.getDateTime()+"\n");
		
	// Start collecting Budget info
		boolean budgetCollectInfo = BudgetCollectInfo.CollectInfo(driver);
		if (budgetCollectInfo){
			System.out.println("\nFinish creating Budget Files\n");
		} else {
			System.out.println("\tunable to creat Budget Files");
			testFailed = true;
		}
		
 	// Start collecting development info
		boolean developmentCollectInfo = DevelopmentCollectInfo.CollectInfo(driver);
		if (developmentCollectInfo){
			System.out.println("\nFinish creating Development Files\n");
		} else {
			System.out.println("\tunable to creat Development Files");
			testFailed = true;
		}
		
	// Start collecting Balancing info
		boolean balancCollectInfo = BalancingCollectInfo.CollectInfo(driver);
		if (balancCollectInfo){
			System.out.println("\nFinish creating Balancing Files\n");
		} else {
			System.out.println("\tunable to creat Balancing Files");
			testFailed = true;
		}
		
	// Start collecting Maintenance info
		boolean mainCollectInfo = MaintenanceCollectInfo.CollectInfo(driver);
		if (mainCollectInfo){
			System.out.println("\nFinish creating Maintenance Files\n");
		} else {
			System.out.println("\tunable to creat Maintenance Files");
			testFailed = true;
		}
		

		System.out.print("\nResult of collecting ifo: "+testFailed+"\n");
		System.out.print("\nFinish collecting info of the Decision Center- end time: "+UtilityTools.getDateTime()+"\n");
	} 

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
	 
	        Node nValue = nlList.item(0);
	 
		return nValue.getNodeValue();
	}

}
