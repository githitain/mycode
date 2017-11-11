package com.iii.tests.dctests;
/**

 * @version $Id: MaintenanceCollectInfo.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class MaintenanceCollectInfo {
	
	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	static String fileName1 = "C:\\DC\\dcfiles\\LowCirculationWeeding.txt";
    static String fileName2 = "C:\\DC\\dcfiles\\HighCirculationWeeding.txt";
    static String fileName3 = "C:\\DC\\dcfiles\\AgeOfCollectionWeeding.txt";
    static String fileName4 = "C:\\DC\\dcfiles\\SupplyAndDemandWeeding.txt";
    static String fileName5 = "C:\\DC\\dcfiles\\MissingItems.txt";
    

	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("maintenance")).click();
		UtilityTools.MySleep(sleepTime);
		UtilityTools.deleteInfoFile(fileName1);
		UtilityTools.deleteInfoFile(fileName2);
		UtilityTools.deleteInfoFile(fileName3);
		UtilityTools.deleteInfoFile(fileName4);
		UtilityTools.deleteInfoFile(fileName5);
	// start LOW CIRCULATION WEEDING collecting info
		
		try {
			
			driver.findElement(By.linkText("Low Circulation Weeding")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			// System.out.println("\nNumber of links " + editLink.size() + "|" + addAll.size() + "|" + OKbutton.size() + "\n");;
			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				addAll.get(i).click();
				OKbutton.get(i).click();
			}
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName1, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect LOW CIRCULATION WEEDING info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Maintenance")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Low Circulation Weeding and starting collect info High Circulation Weeding \n");
		
	// start HIGH CIRCULATION WEEDING collecting info
		
		try {
			
			driver.findElement(By.linkText("High Circulation Weeding")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			// System.out.println("\nNumber of links " + editLink.size() + "|" + addAll.size() + "|" + OKbutton.size() + "\n");;
			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				addAll.get(i).click();
				OKbutton.get(i).click();
			}
			
			WebElement mainField = driver.findElement(By.id("filters.totalCheckoutsGreaterThan"));
			mainField.clear();
			mainField.sendKeys("1");
			
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName2, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect HIGH CIRCULATION WEEDING info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Maintenance")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info High Circulation Weeding and starting collect info Age of Collection Weeding \n");
		
	// start AGE OF COLLECTION WEEDING collecting info
		
		try {
			
			driver.findElement(By.linkText("Age of Collection Weeding")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			// System.out.println("\nNumber of links " + editLink.size() + "|" + addAll.size() + "|" + OKbutton.size() + "\n");;
			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				addAll.get(i).click();
				OKbutton.get(i).click();
			}
			

			
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName3, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect AGE OF COLLECTION WEEDING info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Maintenance")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Age of Collection Weeding and starting collect info Supply and Demand Weeding \n");
		
	// start SUPPLY AND DEMAND WEEDING collecting info
		
		try {
			
			driver.findElement(By.linkText("Supply and Demand Weeding")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			// System.out.println("\nNumber of links " + editLink.size() + "|" + addAll.size() + "|" + OKbutton.size() + "\n");;
			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				addAll.get(i).click();
				OKbutton.get(i).click();
			}
			

			
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName4, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect SUPPLY AND DEMAND WEEDING info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Maintenance")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Supply and Demand Weeding and starting collect info Missing Items \n");
		
	// start MISSING ITEMS collecting info
		
		try {
			
			driver.findElement(By.linkText("Missing Items")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			// System.out.println("\nNumber of links " + editLink.size() + "|" + addAll.size() + "|" + OKbutton.size() + "\n");;
			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				addAll.get(i).click();
				OKbutton.get(i).click();
			}
			

			
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName5, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect MISSING ITEMS info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Maintenance")).click();
		
		return ret;
	}

}
