package com.iii.tests.dctests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class TransactionCollectInfo {

	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	
	static String fileName1 = "C:\\DC\\dcfiles\\TransactionLocationByHomeLibrary.txt";
	static String fileName2 = "C:\\DC\\dcfiles\\TransactionLocationByItemType.txt";
	static String fileName3 = "C:\\DC\\dcfiles\\TransactionLocationByIcode1.txt";
	static String fileName4 = "C:\\DC\\dcfiles\\TransactionLocationByIcode2.txt";
	static String fileName5 = "C:\\DC\\dcfiles\\TransactionLocationByOwningLocation.txt";
	static String fileName6 = "C:\\DC\\dcfiles\\TransactionLocationByPatronType.txt";
	static String fileName7 = "C:\\DC\\dcfiles\\TransactionLocationByPcode1.txt";
	static String fileName8 = "C:\\DC\\dcfiles\\TransactionLocationByPcode2.txt";
	static String fileName9 = "C:\\DC\\dcfiles\\TransactionLocationByPcode3.txt";
	static String fileName10 = "C:\\DC\\dcfiles\\TransactionLocationByPcode4.txt";
	static String fileName11 = "C:\\DC\\dcfiles\\TransactionLocationByTransactionType.txt";
	static String fileName12 = "C:\\DC\\dcfiles\\TransactionLocationTrends.txt";
	static String fileName13 = "C:\\DC\\dcfiles\\TransactionTypeByPatronType.txt";
	static String fileName14 = "C:\\DC\\dcfiles\\TransactionTypeTrends.txt";

	

	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		// startTransaction Location by Home Library collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location by Home Library")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName1, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 1 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location by Home Library and starting collect info Transaction Location by Item Type \n");
		
		// start Transaction Location by Item Type collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location by Item Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName2, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 2 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location by Item Type and starting collect info Transaction Location by icode1 \n");
		
		// startTransaction Location by icode1 collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location by icode1")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName3, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 3 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location by icode1 and starting collect info Transaction Location by icode2 \n");
		
		// start Transaction Location by icode2 collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location by icode2")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName4, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 4 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location by icode2 and starting collect info Transaction Location by Owning Location\n");
		
		
		
		// start Transaction Location by Owning Location collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location by Owning Location")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName5, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 5 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location by Owning Location and starting collect info Transaction Location by Patron Type \n");
		
		// start Transaction Location by Patron Type collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location by Patron Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName6, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 6 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location by Patron Type and starting collect info Transaction Location by pcode1 \n");
		
		// start Transaction Location by pcode1 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location by pcode1")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName7, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 7 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location by pcode1 and starting collect info Transaction Location by pcode2 \n");
		
		// start Transaction Location by pcode2 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location by pcode2")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName8, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 8 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location by pcode2 and starting collect info Transaction Location by pcode3 \n");
		
		// start Transaction Location by pcode3 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location by pcode3")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName9, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 9 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location by pcode3 and starting collect info Transaction Location by pcode4 \n");
		
		// start Transaction Location by pcode4 collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location by pcode4")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName10, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 10 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location by pcode4 and starting collect info Transaction Location by Transaction Type \n");
		
		// start Transaction Location by Transaction Type collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location by Transaction Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName11, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 11 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location by Transaction Type and starting collect info Transaction Location Trends \n");
		
		// start Transaction Location Trends collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Location Trends")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName12, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Location 12 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Location Trends and starting collect info Transaction Type by Patron Type \n");
		
		// start Transaction Type by Patron Type collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[14]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Type by Patron Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName13, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Type 13 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Type by Patron Type and starting collect info Transaction Type Trends \n");
		
		// start Transaction Type Trends collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[14]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Transaction Type Trends")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName14, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Transaction Type 14 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Transaction Type TrendsTransaction Type Trends \n");
		
		
		
		
		
		return ret;
	}

}
