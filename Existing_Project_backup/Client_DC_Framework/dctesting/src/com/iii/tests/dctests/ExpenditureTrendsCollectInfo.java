package com.iii.tests.dctests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class ExpenditureTrendsCollectInfo {
	
	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	static String fileName1 = "C:\\DC\\dcfiles\\ExpenditureTrendsByBibLevel.txt";
	static String fileName2 = "C:\\DC\\dcfiles\\ExpenditureTrendsByCallNumberRange.txt";
	static String fileName3 = "C:\\DC\\dcfiles\\ExpenditureTrendsByFormat.txt";
	static String fileName4 = "C:\\DC\\dcfiles\\ExpenditureTrendsByFunds.txt";
	static String fileName5 = "C:\\DC\\dcfiles\\ExpenditureTrendsByLanguage.txt";
	static String fileName6 = "C:\\DC\\dcfiles\\ExpenditureTrendsByOrderLocations.txt";
	static String fileName7 = "C:\\DC\\dcfiles\\ExpenditureTrendsByOrderType.txt";
	static String fileName8 = "C:\\DC\\dcfiles\\ExpenditureTrendsByVendors.txt";
	static String fileName9 = "C:\\DC\\dcfiles\\ExpenditureTrendsByOcode1.txt";
	static String fileName10 = "C:\\DC\\dcfiles\\ExpenditureTrendsByOcode2.txt";
	static String fileName11 = "C:\\DC\\dcfiles\\ExpenditureTrendsByOcode3.txt";
	static String fileName12 = "C:\\DC\\dcfiles\\ExpenditureTrendsByOcode4.txt";

	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		// start Expenditure Trends by Bib Level collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by Bib Level")).click();
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
		System.out.println("\tfinish collect info Expenditure Trends by Bib Level and starting collect info Expenditure Trends by Call Number Range \n");
		
		// start Expenditure Trends by Call Number Range collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by Call Number Range")).click();
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
		System.out.println("\tfinish collect info Expenditure Trends by Call Number Range and starting collect info Expenditure Trends by Format \n");
		
		// start Expenditure Trends by Format collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by Format")).click();
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
		System.out.println("\tfinish collect info Expenditure Trends by Format and starting collect info Expenditure Trends by Funds \n");
		
		// start Expenditure Trends by Funds collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by Funds")).click();
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
		System.out.println("\tfinish collect info Expenditure Trends by Funds and starting collect info Expenditure Trends by Language \n");
		
		// start Expenditure Trends by Language collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by Language")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName5, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 5 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Expenditure Trends by Language and starting collect info Expenditure Trends by Order Locations \n");
		
		// start Expenditure Trends by Order Locations collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by Order Locations")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName6, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 6 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Expenditure Trends by Order Locations and starting collect info Expenditure Trends by Order Type \n");
		
		// start Expenditure Trends by Order Type collecting info
try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by Order Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName7, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 7 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Expenditure Trends by Order Type and starting collect info Expenditure Trends by Vendors \n");
		
		// start Expenditure Trends by Vendors collecting info
try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by Vendors")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName8, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 8 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Expenditure Trends by Vendors and starting collect info Expenditure Trends by ocode1 \n");
		
		// start Expenditure Trends by ocode1 collecting info
try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by ocode1")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName9, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 9 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Expenditure Trends by ocode1 and starting collect info Expenditure Trends by ocode2 \n");
		
		// start Expenditure Trends by ocode2 collecting info
try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by ocode2")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName10, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 10 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Expenditure Trends by ocode2 and starting collect info Expenditure Trends by ocode3 \n");
		
		// start Expenditure Trends by ocode3 collecting info
try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by ocode3")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName11, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 11 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Expenditure Trends by ocode3 and starting collect info Expenditure Trends by ocode4 \n");
		
		// start Expenditure Trends by ocode4 collecting info
try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[2]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Expenditure Trends by ocode4")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName12, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect Expenditure Trends 12 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Expenditure Trends by ocode4 \n");
		
		
		
		return ret;
	}

}
