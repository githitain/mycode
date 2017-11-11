package com.iii.tests.dctests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class TurnoverSummaryCollectInfo {

	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	
	static String fileName1 = "C:\\DC\\dcfiles\\TurnoverByBranch.txt";
	static String fileName2 = "C:\\DC\\dcfiles\\TurnoverByMaterialType.txt";
	static String fileName3 = "C:\\DC\\dcfiles\\OwningLocationByItemType.txt";
	static String fileName4 = "C:\\DC\\dcfiles\\TurnoverByShelfLocation.txt";
	static String fileName5 = "C:\\DC\\dcfiles\\TurnoverByTransactionLocationAndItemType.txt";
	static String fileName6 = "C:\\DC\\dcfiles\\TurnoverByTransactionLocationAndMaterialType.txt";
	static String fileName7 = "C:\\DC\\dcfiles\\CurrentTitlesByCallNumberRangeAndMaterialType.txt";
	static String fileName8 = "C:\\DC\\dcfiles\\ValueByMaterialType.txt";
	static String fileName9 = "C:\\DC\\dcfiles\\CurrentItemValueByLocation.txt";
	

	

	

	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		// start Turnover by Branch collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[17]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Turnover by Branch")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName1, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Turnover 1 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Turnover by Branch and starting collect info Turnover by Material Type \n");
		
		// start Turnover by Material Type collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[17]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Turnover by Material Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName2, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Turnover 2 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Turnover by Material Type and starting collect info Owning Location by Item Type \n");
		
		// start Owning Location by Item Type collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[17]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location by Item Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName3, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Turnover 3 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Owning Location by Item Type and starting collect info Turnover by Shelf Location \n");
		
		// start Turnover by Shelf Location collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[17]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Turnover by Shelf Location")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName4, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Turnover 4 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Turnover by Shelf Location and starting collect info Turnover by Transaction Location and Item Type \n");
		
		
		
		// start Bib Location - Added Titles collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[17]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Turnover by Transaction Location and Item Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName5, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Turnover 5 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Turnover by Transaction Location and Item Type and starting collect info Turnover by Transaction Location and Material Type \n");
		
		// start Turnover by Transaction Location and Material Type collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[17]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Turnover by Transaction Location and Material Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName6, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Turnover 6 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Turnover by Transaction Location and Material Type and starting collect info Current Titles by Call Number Range and Material Type \n");
		
		// start Current Titles by Call Number Range and Material Type collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[18]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Current Titles by Call Number Range and Material Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName7, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Summary 7 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Current Titles by Call Number Range and Material Type and starting collect info Value By Material Type \n");
		
		// start Value By Material Type collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[18]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Value By Material Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName8, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Summary 8 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect infoValue By Material Type and starting collect info Current Item Value By Location \n");
		
		// start Current Item Value By Location collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[18]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Current Item Value By Location")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName9, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Summary 9 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Current Item Value By Location \n");
		
				

		
		return ret;
	}

}
