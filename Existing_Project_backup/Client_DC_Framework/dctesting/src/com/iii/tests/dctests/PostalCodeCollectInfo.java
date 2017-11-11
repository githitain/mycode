package com.iii.tests.dctests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class PostalCodeCollectInfo {

	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	
	static String fileName1 = "C:\\DC\\dcfiles\\PostalCodeByItemType.txt";
	static String fileName2 = "C:\\DC\\dcfiles\\PostalCodeByIcode1.txt";
	static String fileName3 = "C:\\DC\\dcfiles\\PostalCodeByIcode2.txt";
	static String fileName4 = "C:\\DC\\dcfiles\\PostalCodeByPatronActivity.txt";
	static String fileName5 = "C:\\DC\\dcfiles\\PostalCodeByPatronType.txt";
	static String fileName6 = "C:\\DC\\dcfiles\\PostalCodeByPcode1.txt";
	static String fileName7 = "C:\\DC\\dcfiles\\PostalCodeByPcode2.txt";
	static String fileName8 = "C:\\DC\\dcfiles\\PostalCodeByPcode3.txt";
	static String fileName9 = "C:\\DC\\dcfiles\\PostalCodeByPcode4.txt";
	static String fileName10 = "C:\\DC\\dcfiles\\PostalCodeByTransactionType.txt";
	static String fileName11 = "C:\\DC\\dcfiles\\PostalCodeTrends.txt";
	
	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		// start Postal Code by Item Type collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Postal Code by Item Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName1, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Postal Code 1 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Postal Code by Item Type and starting collect info Postal Code by icode1 \n");
		
		// start Postal Code by icode1 collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Postal Code by icode1")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName2, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Postal Code 2 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Postal Code by icode1 and starting collect info Postal Code by icode2 \n");
		
		// start Postal Code by icode2 collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Postal Code by icode2")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName3, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Postal Code 3 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Postal Code by icode2 and starting collect info Postal Code by Patron Activity \n");
		
		// start Postal Code by Patron Activity collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Postal Code by Patron Activity")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName4, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Postal Code 4 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Postal Code by Patron Activity and starting collect info Postal Code by Patron Type \n");
		
		// start Postal Code by Patron Type collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Postal Code by Patron Type")).click();
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
		System.out.println("\tfinish collect info Postal Code by Patron Type and starting collect info Postal Code by pcode1 \n");
		
		// start Postal Code by pcode1 collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Postal Code by pcode1")).click();
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
		System.out.println("\tfinish collect info Postal Code by pcode1 and starting collect info Postal Code by pcode2 \n");
		
		// start Postal Code by pcode2 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Postal Code by pcode2")).click();
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
		System.out.println("\tfinish collect info Postal Code by pcode2 and starting collect info Postal Code by pcode3 \n");
		
		// start Postal Code by pcode3 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Postal Code by pcode3")).click();
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
		System.out.println("\tfinish collect info Postal Code by pcode3 and starting collect info Postal Code by pcode4 \n");
		
		// start Postal Code by pcode4 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Postal Code by pcode4")).click();
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
		System.out.println("\tfinish collect info Postal Code by pcode4 and starting collect info Postal Code by Transaction Type \n");
		
		// start Postal Code by Transaction Type collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Postal Code by Transaction Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName10, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Postal Code 10 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Postal Code by Transaction Type and starting collect info Postal Code Trends \n");
		
		// start Postal Code Trends collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Postal Code Trends")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName11, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Postal Code 11 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Postal Code Trends \n");
		

		
		return ret;
	}

}
