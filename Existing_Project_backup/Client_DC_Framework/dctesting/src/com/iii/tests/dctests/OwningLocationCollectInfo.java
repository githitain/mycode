package com.iii.tests.dctests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class OwningLocationCollectInfo {

	
	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	
	static String fileName1 = "C:\\DC\\dcfiles\\OwningLocationByHomeLibrary.txt";
	static String fileName2 = "C:\\DC\\dcfiles\\OwningLocationByItemType.txt";
	static String fileName3 = "C:\\DC\\dcfiles\\OwningLocationByIcode1.txt";
	static String fileName4 = "C:\\DC\\dcfiles\\OwningLocationByIcode2.txt";
	static String fileName5 = "C:\\DC\\dcfiles\\OwningLocationByPatronType.txt";
	static String fileName6 = "C:\\DC\\dcfiles\\OwningLocationByPcode1.txt";
	static String fileName7 = "C:\\DC\\dcfiles\\OwningLocationByPcode2.txt";
	static String fileName8 = "C:\\DC\\dcfiles\\OwningLocationByPcode3.txt";
	static String fileName9 = "C:\\DC\\dcfiles\\OwningLocationByPcode4.txt";
	static String fileName10 = "C:\\DC\\dcfiles\\OwningLocationByTransactionType.txt";
	static String fileName11 = "C:\\DC\\dcfiles\\OwningLocationTrends.txt";
	
	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		// start Owning Location by Home Library collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location by Home Library")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName1, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Owning Location 1 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Owning Location by Home Library and starting collect info Owning Location by Item Type \n");
		
		// start Owning Location by Item Type collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location by Item Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName2, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Owning Location 2 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Owning Location by Item Type and starting collect info Owning Location by icode1 \n");
		
		// start Owning Location by icode1 collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location by icode1")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName3, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Owning Location 3 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Owning Location by icode1 and starting collect info Owning Location by icode2 \n");
		
		// start Owning Location by icode2 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location by icode2")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName4, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Owning Location 4 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Owning Location by icode2 and starting collect info Owning Location by Patron Type \n");
		
		// start Owning Location by Patron Type collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location by Patron Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName5, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Owning Location 5 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Owning Location by Patron Type and starting collect info Owning Location by pcode1 \n");
		
		// start Owning Location by pcode1 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location by pcode1")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName6, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Owning Location 6 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Owning Location by pcode1 and starting collect info Owning Location by pcode2 \n");
		
		// start Owning Location by pcode2 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location by pcode2")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName7, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Owning Location 7 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect infoOwning Location by pcode2 and starting collect info Owning Location by pcode3 \n");
		
		// start Owning Location by pcode3 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location by pcode3")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName8, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Owning Location 8 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Owning Location by pcode3 and starting collect info Owning Location by pcode4 \n");
		
		// start Owning Location by pcode4 collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location by pcode4")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName9, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Owning Location 9 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Owning Location by pcode4 and starting collect info Owning Location by Transaction Type \n");
		
		// start Owning Location by Transaction Type collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location by Transaction Type")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName10, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Owning Location 10 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Owning Location by Transaction Type and starting collect info Owning Location Trends \n");
		
		// start Owning Location Trends collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Owning Location Trends")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName11, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Owning Location 11 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Owning Location Trends \n");
		

		
		
		return ret;
	}

}
