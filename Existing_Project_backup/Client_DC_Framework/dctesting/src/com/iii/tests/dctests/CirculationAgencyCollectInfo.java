package com.iii.tests.dctests;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")


public class CirculationAgencyCollectInfo {
	
	
	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	
	static String fileName1 = "C:\\DC\\dcfiles\\AgencyCirculationByPatron.txt";
	static String fileName2 = "C:\\DC\\dcfiles\\AgencyCirculationByItemType.txt";
	static String fileName3 = "C:\\DC\\dcfiles\\AgencyCirculationTrends.txt";

	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		// start Agency Circulation by Patron collecting info
		
		try {
					
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[3]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Agency Circulation by Patron")).click();
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
		System.out.println("\tfinish collect info Agency Circulation by Patron and starting collect info Agency Circulation by Item Type \n");
		
		// start Agency Circulation by Item Type collecting info
		
try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[3]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Agency Circulation by Item Type")).click();
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
		System.out.println("\tfinish collect info Agency Circulation by Item Type and starting collect info Agency Circulation Trends \n");
		
		// start Agency Circulation Trends collecting info
try {
			
			
			driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[3]")).click();
			UtilityTools.MySleep(sleepTime);
			driver.findElement(By.linkText("Agency Circulation Trends")).click();
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
		System.out.println("\tfinish collect info Agency Circulation Trends \n");
		
		return ret;
	}

}
