package com.iii.tests.dctests;
/**

 * @version $Id: BalancingCollectInfo.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class BalancingCollectInfo {
	
	static long sleepTime = 1000;
	static WebDriver driver;
    static String fileName1 = "C:\\DC\\dcfiles\\SubjectUse.txt";
    static String fileName2 = "C:\\DC\\dcfiles\\SubjectUseByLocation.txt";
    static String fileName3 = "C:\\DC\\dcfiles\\CollectionUse.txt";
    static String fileName4 = "C:\\DC\\dcfiles\\CollectionUseByLocation.txt";
    static String tableName = "reportTable reportTableBody";

	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("balancing")).click();
		UtilityTools.MySleep(sleepTime);
		UtilityTools.deleteInfoFile(fileName1);
		UtilityTools.deleteInfoFile(fileName2);
		UtilityTools.deleteInfoFile(fileName3);
		UtilityTools.deleteInfoFile(fileName4);
	// start Subject Use collecting info
		
		try {
			
			driver.findElement(By.linkText("Subject Use")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));

			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				addAll.get(i).click();
				OKbutton.get(i).click();
			}
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName1, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to SUBJECT USE collect info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Balancing")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Subject Use and starting collect info Subject Use By Location \n");
		
	// start Subject Use By Location collecting info
		
		try {
			
			driver.findElement(By.linkText("Subject Use By Location")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				addAll.get(i).click();
				OKbutton.get(i).click();
			}
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName2, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Subject Use By Location collect info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Balancing")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Subject Use By Location and starting collect info Collection Use \n");
		
		// start Collection Use collecting info
		try {
			
			driver.findElement(By.linkText("Collection Use")).click();
			UtilityTools.MySleep(sleepTime);

			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName3, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Collection Use collect info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Balancing")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Collection Use and starting collect info Collection Use by Location \n");
		
		// start Collection Use by Location collecting info
		try {
			
			driver.findElement(By.linkText("Collection Use by Location")).click();
			UtilityTools.MySleep(sleepTime);

			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName4, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to Collection Use by Location collect info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Balancing")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Collection Use by Location \n");
		
		
		return ret;
	}
	
}
