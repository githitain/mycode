package com.iii.tests.dctests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")


public class TitleTrendsCollectInfo {

	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	
	static String fileName1 = "C:\\DC\\dcfiles\\BibLevelAddedTitles.txt";
	static String fileName2 = "C:\\DC\\dcfiles\\BibLevelCurrentTitles.txt";
	static String fileName3 = "C:\\DC\\dcfiles\\LanguageAddedTitles.txt";
	static String fileName4 = "C:\\DC\\dcfiles\\LanguageCurrentTitles.txt";
	static String fileName5 = "C:\\DC\\dcfiles\\BibLocationAddedTitles.txt";
	static String fileName6 = "C:\\DC\\dcfiles\\BibLocationCurrentTitles.txt";
	static String fileName7 = "C:\\DC\\dcfiles\\MaterialTypeAddedTitles.txt";
	static String fileName8 = "C:\\DC\\dcfiles\\MaterialTypeCurrentTitles.txt";
	static String fileName9 = "C:\\DC\\dcfiles\\MaterialTypeCataloged.txt";
	static String fileName10 = "C:\\DC\\dcfiles\\CallNumberRangeCurrentTitles.txt";
	static String fileName11 = "C:\\DC\\dcfiles\\DeletedTitles.txt";
	

	

	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		// start Bib Level - Added Titles collecting info
		try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Bib Level - Added Titles")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName1, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Title Trends 1 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Bib Level - Added Titles and starting collect info Bib Level - Current Titles \n");
		
		// start Bib Level - Current Titles collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Bib Level - Current Titles")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName2, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Title Trends 2 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Bib Level - Current Titles and starting collect info Language - Added Titles \n");
		
		// start Language - Added Titles collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Language - Added Titles")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName3, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Title Trends 3 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Language - Added Titles and starting collect info Language - Current Titles \n");
		
		// start Language - Current Titles collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Language - Current Titles")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName4, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Title Trends 4 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Language - Current Titles and starting collect info Bib Location - Added Titles \n");
		
		
		
		// start Bib Location - Added Titles collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Bib Location - Added Titles")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName5, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Title Trends 5 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Bib Location - Added Titles and starting collect info Bib Location - Current Titles \n");
		
		// start Bib Location - Current Titles collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Bib Location - Current Titles")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName6, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Title Trends 6 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Bib Location - Current Titles and starting collect info Material Type - Added Titles \n");
		
		// start Material Type - Added Titles collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Material Type - Added Titles")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName7, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Title Trends 7 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Material Type - Added Titles and starting collect info Material Type - Current Titles \n");
		
		// start Material Type - Current Titles collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Material Type - Current Titles")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName8, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Title Trends 8 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Material Type - Current Titles and starting collect info Material Type - Cataloged \n");
		
		// start Material Type - Cataloged collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Material Type - Cataloged")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName9, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Title Trends 9 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Material Type - Cataloged and starting collect info Call Number Range - Current Titles \n");
		
		// start Call Number Range - Current Titles collecting info
		
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Call Number Range - Current Titles")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName10, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Title Trends 10 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Call Number Range - Current Titles and starting collect info Deleted Titles \n");
		
		// start Deleted Titles collecting info
		try {
			
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Deleted Titles")).click();
			UtilityTools.MySleep(sleepTime);
			
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName11, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Title Trends 11 info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Deleted Titles \n");
		
		return ret;
	}

}
