package com.iii.tests.dctests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class HourlyActivityCollectInfo {

	
	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	
	static String fileName1 = "C:\\DC\\dcfiles\\HourlyCirculationByDayOfTheWeek.txt";
	static String fileName2 = "C:\\DC\\dcfiles\\HourlyCirculationByPatronType.txt";
	static String fileName3 = "C:\\DC\\dcfiles\\HourlyCirculationByTransactionLocation.txt";
	static String fileName4 = "C:\\DC\\dcfiles\\HourlyCirculationTrends.txt";

	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		// start Hourly Circulation by Day of the Week collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[5]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Hourly Circulation by Day of the Week")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName1, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 1 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Hourly Circulation by Day of the Week and starting collect info Hourly Circulation by Patron Type \n");
		
		// start Hourly Circulation by Patron Type collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[5]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Hourly Circulation by Patron Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName2, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 2 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Hourly Circulation by Patron Type and starting collect info Hourly Circulation by Transaction Location \n");
		
		// start Hourly Circulation by Transaction Location collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[5]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Hourly Circulation by Transaction Location")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName3, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 3 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Hourly Circulation by Transaction Location and starting collect info Hourly Circulation Trends \n");
		
		// start Hourly Circulation Trends collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[5]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Hourly Circulation Trends")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName4, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 4 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Hourly Circulation Trends \n");
		

		
		return ret;
	}

}
