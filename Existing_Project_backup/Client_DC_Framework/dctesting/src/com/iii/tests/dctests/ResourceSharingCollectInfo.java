package com.iii.tests.dctests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class ResourceSharingCollectInfo {
	
	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	
	static String fileName1 = "C:\\DC\\dcfiles\\ResourceSharingItemType.txt";
	static String fileName2 = "C:\\DC\\dcfiles\\ResourceSharingPatronType.txt";
	static String fileName3 = "C:\\DC\\dcfiles\\ResourceSharingPostalCodes.txt";
	static String fileName4 = "C:\\DC\\dcfiles\\ResourceSharingTransactionLocation.txt";
	static String fileName5 = "C:\\DC\\dcfiles\\StatisticsGroupByHour.txt";
	static String fileName6 = "C:\\DC\\dcfiles\\StatisticsGroupByItemType.txt";
	static String fileName7 = "C:\\DC\\dcfiles\\StatisticsGroupByPatronType.txt";
	static String fileName8 = "C:\\DC\\dcfiles\\StatisticsGroupByShelfLocation.txt";
	static String fileName9 = "C:\\DC\\dcfiles\\StatisticsGroupByTransactionType.txt";
	

	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		// start Resource Sharing - Item Type collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[10]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Resource Sharing - Item Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName1, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Resource Sharing 1 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Resource Sharing - Item Type and starting collect info Resource Sharing - Patron Type \n");
		
		// start Resource Sharing - Patron Type collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[10]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Resource Sharing - Patron Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName2, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Resource Sharing 2 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Resource Sharing - Patron Type and starting collect info Resource Sharing - Postal Codes \n");
		
		// start Resource Sharing - Postal Codes collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[10]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Resource Sharing - Postal Codes")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName3, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Resource Sharing 3 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Resource Sharing - Postal Codes and starting collect info Resource Sharing - Transaction Location \n");
		
		// start Resource Sharing - Transaction Location collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[10]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Resource Sharing - Transaction Location")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName4, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Resource Sharing 4 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Resource Sharing - Transaction Location and starting collect info Statistics Group by Hour\n");
		
		
		
		// start Statistics Group by Hour collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[11]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Statistics Group by Hour")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName5, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Postal Code 5 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Statistics Group by Hour and starting collect info Statistics Group by Item Type \n");
		
		// start Statistics Group by Item Type collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[11]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Statistics Group by Item Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName6, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Postal Code 6 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Statistics Group by Item Type and starting collect info Statistics Group by Patron Type \n");
		
		// start Postal Code by pcode2 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[11]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Statistics Group by Patron Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName7, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Postal Code 7 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Statistics Group by Patron Type and starting collect info Statistics Group by Shelf Location \n");
		
		// start Statistics Group by Shelf Location collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[11]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Statistics Group by Shelf Location")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName8, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Postal Code 8 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Statistics Group by Shelf Location and starting collect info Statistics Group by Transaction Type \n");
		
		// start Statistics Group by Transaction Type collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[11]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Statistics Group by Transaction Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName9, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Postal Code 9 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Statistics Group by Transaction Type \n");
		
		
		
		return ret;
	}

}
