package com.iii.tests.dctests;
/**

 * @version $Id: DevelopmentCollectInfo.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class DevelopmentCollectInfo {
	
	static long sleepTime = 1000;
	static WebDriver driver;
    static String fileName1 = "C:\\DC\\dcfiles\\SupplyAndDemandBuying.txt";
    static String fileName2 = "C:\\DC\\dcfiles\\HoldToItemRatioBuying.txt";
    static String tableName = "reportTable reportTableBody";
    

	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("development")).click();
	// start SUPPLY AND DEMAND BUYING collecting info
		
		try {
			UtilityTools.deleteInfoFile(fileName1);
			driver.findElement(By.linkText("Supply and Demand Buying")).click();
			UtilityTools.MySleep(sleepTime);
			
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName1, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Development")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Supply and Demand Buying and starting collect info Hold-to-Item Ratio Buying \n");
		
	// start HOLD-TO-ITEM RATIO BUYING collecting info	
		
		try {
			UtilityTools.deleteInfoFile(fileName2);
			driver.findElement(By.linkText("Hold-to-Item Ratio Buying")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			// System.out.println("\nNumber of links " + editLink.size() + "|" + addAll.size() + "|" + OKbutton.size() + "\n");;
			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				addAll.get(i).click();
				OKbutton.get(i).click();
			}
			
			WebElement devField = driver.findElement(By.id("filters.holdToItemRatioGreaterThan"));
			devField.clear();
			devField.sendKeys("1.0");
			
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName2, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Collection Tools")).click();	
		
		return ret;
	}

}
