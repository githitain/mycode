package com.iii.tests.dctests;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.iii.tests.common.UtilityTools;
@SuppressWarnings("unused")

public class BudgetVerification {
	
	static long sleepTime = 1000;
	static WebDriver driver;
    static String fileName1 = "C:\\DC\\dcfiles\\BudgetProjectionByFund.txt";
    static String fileName2 = "C:\\DC\\dcfiles\\BudgetProjectionByCollection.txt";
    static String fileName3 = "C:\\DC\\dcfiles\\BudgetProjectionBySubject.txt";
    static String tableName = "reportTable reportTableBody";

	@Test
	public static boolean ReportVerification(WebDriver driver) {
		boolean ret = true;
		driver.findElement(By.id("development")).click();
	// start Budget Projection by Subject verification
		
		try {
			
			UtilityTools.MySleep(sleepTime);
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.linkText("Budget Projection by Fund")).click();
			UtilityTools.MySleep(sleepTime);
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
			
			String textFromFile = UtilityTools.readFileToString(fileName1);
			String textFromReport=UtilityTools.readReportBody(tableName, driver);
			
		       try {
		    	   if (textFromFile.equals(textFromReport)){
		    			System.out.println("Budget Projection by Subject report info verification PASS \n");
		    		} else {
		    			System.out.println("Budget Projection by Subject report info verification Failed \n");
		    		}
		    	   
		       } catch (Exception e) {
					System.out.println("\ntext comperising faild for Budget Projection by Fund report\n");
					e.printStackTrace();
					ret = false;

		       }
		       
			UtilityTools.sortingTest(driver);

			
		} catch (Exception e) {
			System.out.println("\tunable to collect info Budget Projection by Fund");
			e.printStackTrace();
			ret = false;

		}

		System.out.println("\tfinish verify info Budget Projection by Fund and starting verification info Budget Projection by Collection \n");
		driver.findElement(By.linkText("Development")).click();
		//driver.findElement(By.id("development")).click();
	// start FUND BUDGET PROJECTION collecting info
		try {
			UtilityTools.MySleep(sleepTime);
			UtilityTools.MyRelogin(driver);
			driver.findElement(By.linkText("Budget Projection by Collection")).click();
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
			
			String textFromFile = UtilityTools.readFileToString(fileName2);
			String textFromReport=UtilityTools.readReportBody(tableName, driver);
			
		       try {
		    	   if (textFromFile.equals(textFromReport)){
		    			System.out.println("FUND BUDGET PROJECTION report info verification PASS \n");
		    		} else {
		    			System.out.println("FUND BUDGET PROJECTION report info verification Failed \n");
		    		}
		    	   
		       } catch (Exception e) {
					System.out.println("\ntext comperising faild for Budget Projection by Collection report\n");
					e.printStackTrace();
					ret = false;

		       }
		       
		    UtilityTools.sortingTest(driver);
		} catch (Exception e) {
			System.out.println("\tunable to collect info Budget Projection by Collection");
			e.printStackTrace();
			ret = false;

		}

		System.out.println("\tfinish verify info Projection by Collection and starting verification info Budget Projection by Subject \n");
		driver.findElement(By.linkText("Development")).click();
		//driver.findElement(By.id("development")).click();
	// start BUDGET PROJECTION BY COLLECTION collecting info
		
		try {
			UtilityTools.MySleep(sleepTime);
			UtilityTools.MyRelogin(driver);
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
			
			String textFromFile = UtilityTools.readFileToString(fileName3);
			String textFromReport=UtilityTools.readReportBody(tableName, driver);
			
		       try {
		    	   if (textFromFile.equals(textFromReport)){
		    			System.out.println("BUDGET PROJECTION BY COLLECTION report info verification PASS \n");
		    		} else {
		    			System.out.println("BUDGET PROJECTION BY COLLECTION report info verification Failed \n");
		    		}
		    	   
		       } catch (Exception e) {
					System.out.println("\ntext comperising faild for Budget Projection by Subject report\n");
					e.printStackTrace();
					ret = false;

		       }
			
		       UtilityTools.sortingTest(driver);
		       
		} catch (Exception e) {
			System.out.println("\tunable to collect info Budget Projection by Subject");
			e.printStackTrace();
			ret = false;

		}
		
		System.out.println("\tfinish verify info Budget Projection by Subject \n");
		driver.findElement(By.linkText("Development")).click();





		return ret;

	}

}
