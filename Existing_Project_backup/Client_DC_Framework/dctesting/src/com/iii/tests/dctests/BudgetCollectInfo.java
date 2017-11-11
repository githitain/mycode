package com.iii.tests.dctests;
/**

 * @version $Id: BudgetCollectInfo.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class BudgetCollectInfo {
	
	static long sleepTime = 1000;
	static WebDriver driver;
    static String fileName1 = "C:\\DC\\dcfiles\\BudgetProjectionByFund.txt";
    static String fileName2 = "C:\\DC\\dcfiles\\BudgetProjectionByCollection.txt";
    static String fileName3 = "C:\\DC\\dcfiles\\BudgetProjectionBySubject.txt";
    static String tableName = "reportTable reportTableBody";

	@Test
	public static boolean CollectInfo(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("development")).click();
	// start Budget Projection by Subject collecting info
		
		try {
			UtilityTools.deleteInfoFile(fileName1);
			driver.findElement(By.linkText("Budget Projection by Fund")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			// System.out.println("\nNumber of links " + editLink.size() + "|" + addAll.size() + "|" + OKbutton.size() + "\n");;
			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				addAll.get(i).click();
				OKbutton.get(i).click();
			}
			
			WebElement budgetField = driver.findElement(By.id("filters.nextYearBudget"));
			budgetField.clear();
			budgetField.sendKeys("100000");
				
			WebElement lastFiscalYearField = driver.findElement(By.id("filters.lastFiscalYear"));
			lastFiscalYearField.clear();
			lastFiscalYearField.sendKeys("2012");
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName1, driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to collect info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Collection Tools")).click();
		driver.findElement(By.id("development")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Budget Projection by Fund and starting collect info Budget Projection by Collection \n");
	// start FUND BUDGET PROJECTION collecting info
		
		try {
			UtilityTools.deleteInfoFile(fileName2);
			driver.findElement(By.linkText("Budget Projection by Collection")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			// System.out.println("\nNumber of links " + editLink.size() + "|" + addAll.size() + "|" + OKbutton.size() + "\n");;
			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				addAll.get(i).click();
				OKbutton.get(i).click();
			}
			
			WebElement budgetField = driver.findElement(By.id("filters.nextYearBudget"));
			budgetField.clear();
			budgetField.sendKeys("100000");
				
			WebElement lastFiscalYearField = driver.findElement(By.id("filters.lastFiscalYear"));
			lastFiscalYearField.clear();
			lastFiscalYearField.sendKeys("2012");
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName2, driver);
			
		
		} catch (Exception e) {
			System.out.println("\tunable to collect info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Collection Tools")).click();
		driver.findElement(By.id("development")).click();
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish collect info Budget Projection by Collection and starting collect info Budget Projection by Subject \n");
	// start Budget Projection by Subject collecting info
		
		try {
			
			UtilityTools.deleteInfoFile(fileName3);
			driver.findElement(By.linkText("Budget Projection by Subject")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));

			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				addAll.get(i).click();
				OKbutton.get(i).click();
			}
			
			WebElement budgetField = driver.findElement(By.id("filters.nextYearBudget"));
			budgetField.clear();
			budgetField.sendKeys("100000");
				
			WebElement lastFiscalYearField = driver.findElement(By.id("filters.lastFiscalYear"));
			lastFiscalYearField.clear();
			lastFiscalYearField.sendKeys("2012");
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			ret = UtilityTools.CreateReportInfo(tableName, fileName3, driver);
			
			
		} catch (Exception e) {
			System.out.println("\tunable to collect info");
			e.printStackTrace();
			ret = false;

		}
		
		driver.findElement(By.linkText("Development")).click();
		
		return ret;
	}

}
