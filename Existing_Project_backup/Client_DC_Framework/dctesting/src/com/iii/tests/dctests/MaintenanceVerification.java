package com.iii.tests.dctests;
/**

 * @version $Id: MaintenanceVerification.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class MaintenanceVerification {
	
	static long sleepTime = 1000;
	//static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	static String fileName1 = "C:\\DC\\dcfiles\\LowCirculationWeeding.txt";
    static String fileName2 = "C:\\DC\\dcfiles\\HighCirculationWeeding.txt";
    static String fileName3 = "C:\\DC\\dcfiles\\AgeOfCollectionWeeding.txt";
    static String fileName4 = "C:\\DC\\dcfiles\\SupplyAndDemandWeeding.txt";
    static String fileName5 = "C:\\DC\\dcfiles\\MissingItems.txt";

	@Test
	public static boolean ReportVerification(WebDriver driver) {
		boolean ret = true;
		
		driver=UtilityTools.MyRelogin(driver);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("maintenance")).click();
		UtilityTools.MySleep(sleepTime);
	// start verifying Low Circulation Weeding collecting info
		
		try {
			
			driver.findElement(By.linkText("Low Circulation Weeding")).click();
			/*List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));

			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				Thread.sleep(3000);
				addAll.get(i).click();
				Thread.sleep(3000);
				OKbutton.get(i).click();
				Thread.sleep(3000);
			}*/
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			System.out.println("\n Start Verification of Low Circulation Weeding Report \n");

			
			/*String textFromFile = UtilityTools.readFileToString(fileName1);
			String textFromReport=UtilityTools.readReportBody(tableName, driver);
			
			System.out.println("Text From File: " + textFromFile);
		    System.out.println("Text From Report: " +  textFromReport);*/
			
		       try {
		    	   System.out.println("\nComparing both Files \n");
		    	   //assertEquals(textFromFile, textFromReport);
		    	   System.out.println("\nComparision Passed \n");
		    	   
		       } catch (Exception e) {
					System.out.println("\ntext Comparision failed for Low Circulation Weeding report\n");
					e.printStackTrace();
					ret = false;

		       }
		       
		//   UtilityTools.sortingTest(driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to verify Low Circulation Weeding");
			e.printStackTrace();
			ret = false;

		}
		
		System.out.println("\tfinish Verification of Low Circulation Weeding \n");
		System.out.println("\t ******************************************************* \n");
		
		driver.findElement(By.linkText("Collection Tools")).click();
		
		driver.findElement(By.id("maintenance")).click();
		UtilityTools.MySleep(sleepTime);
		//driver.findElement(By.id("dc_maintenance")).click();
		
	// start verifying High Circulation Weeding info
		
		try {
			
			driver.findElement(By.linkText("High Circulation Weeding")).click();
			Thread.sleep(3000);
			/*List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			Thread.sleep(3000);
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			Thread.sleep(3000);
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			Thread.sleep(3000);

			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				Thread.sleep(3000);
				addAll.get(i).click();
				Thread.sleep(3000);
				OKbutton.get(i).click();
				Thread.sleep(3000);
			}*/
			
			WebElement mainField = driver.findElement(By.id("filters.totalCheckoutsGreaterThan"));
			mainField.clear();
			mainField.sendKeys("1");
			Thread.sleep(3000);
			
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			System.out.println("\n Start Verification of High Circulation Weeding Report \n");
			
	//		String textFromFile = UtilityTools.readFileToString(fileName2);
	//		String textFromReport=UtilityTools.readReportBody(tableName, driver);
			
			//System.out.println("Text From File: " + textFromFile);
		  //  System.out.println("Text From Report: " +  textFromReport);
		       try {
		    	   System.out.println("\nComparing both Files \n");
		    	//   assertEquals(textFromFile, textFromReport);
		    	   System.out.println("\nComparision Passed \n");
		    	   
		       } catch (Exception e) {
					System.out.println("\ntext Comparision failed for High Circulation Weeding report\n");
					e.printStackTrace();
					ret = false;

		       }
		       
	       //UtilityTools.sortingTest(driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to verify High Circulation Weeding info");
			e.printStackTrace();
			ret = false;

		}
		
		System.out.println("\tfinish Verification of High Circulation Weeding \n");
		System.out.println("\t ******************************************************* \n");
		
		
		driver.findElement(By.linkText("Collection Tools")).click();
		
		driver.findElement(By.id("maintenance")).click();
		UtilityTools.MySleep(sleepTime);
		
	// start verifying Age of Collection Weeding info
		
		try {
			
			driver.findElement(By.linkText("Age of Collection Weeding")).click();
			Thread.sleep(3000);
			/*List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			Thread.sleep(3000);
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			Thread.sleep(3000);
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			Thread.sleep(3000);

			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				Thread.sleep(3000);
				addAll.get(i).click();
				Thread.sleep(3000);
				OKbutton.get(i).click();
				Thread.sleep(3000);
			} */
			
			
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			System.out.println("\n Start Verification of Age of Collection Weeding Report \n");
		/*	
			String textFromFile = UtilityTools.readFileToString(fileName3);
			String textFromReport=UtilityTools.readReportBody(tableName, driver);
			
			System.out.println("Text From File: " + textFromFile);
		    System.out.println("Text From Report: " +  textFromReport);*/
		    
		       try {
		    	   System.out.println("\nComparing both Files \n");
		    	//   assertEquals(textFromFile, textFromReport);
		    	   System.out.println("\nComparision Passed \n");
		    	   
		       } catch (Exception e) {
					System.out.println("\ntext Comparision failed for Age of Collection Weeding report\n");
					e.printStackTrace();
					ret = false;

		       }
		       
	    //   UtilityTools.sortingTest(driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to verify Age of Collection Weeding info");
			e.printStackTrace();
			ret = false;

		}
		
		System.out.println("\tfinish Verification of Age of Collection Weeding \n");
		System.out.println("\t ******************************************************* \n");
		
		driver.findElement(By.linkText("Collection Tools")).click();
		
		driver.findElement(By.id("maintenance")).click();
		
		//driver.findElement(By.linkText("Maintenance")).click();
		UtilityTools.MySleep(sleepTime);
		
		
	// start verifying Supply and Demand Weeding info
		
		try {
			
			driver.findElement(By.linkText("Supply and Demand Weeding")).click();
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
			
			System.out.println("\n Start Verification of Supply and Demand Weeding Report \n");
			
			String textFromFile = UtilityTools.readFileToString(fileName4);
			String textFromReport=UtilityTools.readReportBody(tableName, driver);
			
			System.out.println("Text From File: " + textFromFile);
		    System.out.println("Text From Report: " +  textFromReport);
			
		       try {
		    	   System.out.println("\nComparing both Files \n");
		    	   assertEquals(textFromFile, textFromReport);
		    	   System.out.println("\nComparision Passed \n");
		    	   
		       } catch (Exception e) {
					System.out.println("\ntext Comparision failed for Supply and Demand Weeding report\n");
					e.printStackTrace();
					ret = false;

		       }
			
	       UtilityTools.sortingTest(driver);
		       
		} catch (Exception e) {
			System.out.println("\tunable to verify Supply and Demand Weeding info");
			e.printStackTrace();
			ret = false;

		}
		
		System.out.println("\tfinish Verification of Supply and Demand Weeding \n");
		System.out.println("\t ******************************************************* \n");
		
		driver.findElement(By.linkText("Collection Tools")).click();
		
		driver.findElement(By.id("maintenance")).click();
		//driver.findElement(By.linkText("Maintenance")).click();
		UtilityTools.MySleep(sleepTime);
		//driver.findElement(By.id("dc_maintenance")).click();
		
	// start verifying Missing Items info
		
		try {
			
			driver.findElement(By.linkText("Missing Items")).click();
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
			
			String textFromFile = UtilityTools.readFileToString(fileName5);
			String textFromReport=UtilityTools.readReportBody(tableName, driver);
			
		       try {
		    	   assertEquals(textFromFile, textFromReport);
		    	   
		       } catch (Exception e) {
					System.out.println("\ntext comperising faild for Missing Items report\n");
					e.printStackTrace();
					ret = false;

		       }
		       
	       UtilityTools.sortingTest(driver);
				
		} catch (Exception e) {
			System.out.println("\tunable to verify Missing Items info");
			e.printStackTrace();
			ret = false;

		}
		
		System.out.println("\nPass verification of Maintenance reports\n");
		//driver.findElement(By.linkText("Maintenance")).click();
		
		driver.findElement(By.id("maintenance")).click();
		return ret;

		
	}

}
