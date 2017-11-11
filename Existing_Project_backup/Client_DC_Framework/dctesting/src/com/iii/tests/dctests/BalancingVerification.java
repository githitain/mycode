package com.iii.tests.dctests;
/**

 * @version $Id: BalancingVerification.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class BalancingVerification {
	
	static long sleepTime = 1000;
	//static WebDriver driver;
    static String fileName1 = "C:\\DC\\dcfiles\\SubjectUse.txt";
    static String fileName2 = "C:\\DC\\dcfiles\\SubjectUseByLocation.txt";
    static String fileName3 = "C:\\DC\\dcfiles\\CollectionUse.txt";
    static String fileName4 = "C:\\DC\\dcfiles\\CollectionUseByLocation.txt";
    static String tableName = "reportTable reportTableBody";

	@Test
	public static boolean ReportVerification(WebDriver driver) {
		boolean ret = true;
		
		//driver=UtilityTools.MyRelogin(driver);
		//driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='balancing']/img")).click();		
		UtilityTools.MySleep(sleepTime);
	
		// start verify Subject Use info
			
		try {
				
			driver.findElement(By.linkText("Subject Use")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
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
			}
				
			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			System.out.println("\n Start Verification of Subject Use Report \n");
			   
		    String textFromFile = UtilityTools.readFileToString(fileName1);
		   String textFromReport=UtilityTools.readReportBody(tableName, driver);
		    
		    System.out.println("Text From File: " + textFromFile);
		    System.out.println("Text From Report: " +  textFromReport);
				
				
			try {
				System.out.println("\nComparing both Files \n");
			    assertEquals(textFromFile, textFromReport);
			    System.out.println("\nComparision Passed \n");
			    	   
			 } catch (Exception e) {
				System.out.println("\nText Comparision failed for Subject Use report\n");
				e.printStackTrace();
				ret = false;

			 }
			
			UtilityTools.sortingTest(driver);
			
			} catch (Exception e) {
				System.out.println("\tunable to verify info Subject Use");
				e.printStackTrace();
				ret = false;
			}
			
		System.out.println("\tfinish Verification of Subject Use \n");
		System.out.println("\t ******************************************************* \n");
			
		// start verify Subject Use By Location info
			
		 driver.findElement(By.linkText("Collection Tools")).click();

		 driver.findElement(By.xpath(".//*[@id='balancing']/img")).click();
		 UtilityTools.MySleep(sleepTime);
		try {
			
			driver.findElement(By.linkText("Subject Use By Location")).click();
			List<WebElement> editLink = driver.findElements(By.className("openDialogLink"));
			Thread.sleep(3000);
			List<WebElement> addAll = driver.findElements(By.className("addAll"));
			Thread.sleep(3000);
			List<WebElement> OKbutton = driver.findElements(By.className("ui-dialog-ok-button"));
			Thread.sleep(3000);
			// System.out.println("\nNumber of links " + editLink.size() + "|" + addAll.size() + "|" + OKbutton.size() + "\n");;
			for(int i=0; i<editLink.size(); i++){
				editLink.get(i).click();
				Thread.sleep(3000);
				addAll.get(i).click();
				Thread.sleep(3000);
				OKbutton.get(i).click();
				Thread.sleep(3000);
			}
				
			driver.findElement(By.id("submit")).click();
			
			System.out.println("\n Start Verification of Subject Use By Location Report \n");
			
			UtilityTools.MySleep(sleepTime);
				
				String textFromFile = UtilityTools.readFileToString(fileName2);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				
				System.out.println("Text From File: " + textFromFile);
			    System.out.println("Text From Report: " +  textFromReport);
			    
			       try {
			    	   System.out.println("\nComparing both Files \n");
			       assertEquals(textFromFile, textFromReport);
			    	   System.out.println("\nComparision Passed \n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext Comparision failed for SUBJECT USE BY Location report\n");
						e.printStackTrace();
						ret = false;

			       }
			       
			 UtilityTools.sortingTest(driver);
			       
			} catch (Exception e) {
				System.out.println("\tunable to collect info");
				e.printStackTrace();
				ret = false;

			}
		
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish Verification Subject Use By Location \n");
		System.out.println("\t ******************************************************* \n");

		
		// start verify Collection Use info
		
		driver.findElement(By.linkText("Collection Tools")).click();
		
		try {
			driver.findElement(By.xpath(".//*[@id='balancing']/img")).click();
			UtilityTools.MySleep(sleepTime);			
			driver.findElement(By.linkText("Collection Use")).click();
			UtilityTools.MySleep(sleepTime);

			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			System.out.println("\n Start Verification of Collection Use Report \n");
			
		String textFromFile = UtilityTools.readFileToString(fileName3);
		String textFromReport=UtilityTools.readReportBody(tableName, driver);
			
			 System.out.println("Text From File: " + textFromFile);
		   System.out.println("Text From Report: " +  textFromReport);
		    
		       try {
		    	   System.out.println("\nComparing both Files \n");
		   	   assertEquals(textFromFile, textFromReport);
		    	   System.out.println("\nComparision Passed \n");
		    	   
		       } catch (Exception e) {
					System.out.println("\ntext Comparision failed for Collection Use report\n");
					e.printStackTrace();
					ret = false;

		       }
		       
	       UtilityTools.sortingTest(driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to verify Collection Use info");
			e.printStackTrace();
			ret = false;

		}
		
		System.out.println("\tfinish Verification of Collection Use \n");
		System.out.println("\t ******************************************************* \n");

		
		UtilityTools.MySleep(sleepTime);
		System.out.println("\tfinish verify info Collection Use and starting verify info Collection Use by Location \n");
		
		
		// start verify Collection Use by Location info
		
		driver.findElement(By.linkText("Collection Tools")).click();

		
		try {
			driver.findElement(By.xpath(".//*[@id='balancing']/img")).click();
			UtilityTools.MySleep(sleepTime);			
			driver.findElement(By.linkText("Collection Use by Location")).click();
			UtilityTools.MySleep(sleepTime);

			driver.findElement(By.id("submit")).click();
			
			UtilityTools.MySleep(sleepTime);
			
			System.out.println("\n Start Verification of Collection Use by Location Report \n");
			
			String textFromFile = UtilityTools.readFileToString(fileName4);
			String textFromReport=UtilityTools.readReportBody(tableName, driver);
			
			System.out.println("Text From File: " + textFromFile);
		    System.out.println("Text From Report: " +  textFromReport);
		    
			try {
				   System.out.println("\nComparing both Files \n");
		    	   assertEquals(textFromFile, textFromReport);
		    	   System.out.println("\nComparision Passed \n");
		    	   
		       } catch (Exception e) {
					System.out.println("\ntext Comparision failed for Collection Use by Location report\n");
					e.printStackTrace();
					ret = false;

		       }
		UtilityTools.sortingTest(driver);
			
		} catch (Exception e) {
			System.out.println("\tunable to verify Collection Use by Location info");
			e.printStackTrace();
			ret = false;

		}
		
		
		System.out.println("\tfinish Verification of Collection Use by Location \n");
		System.out.println("\t ******************************************************* \n");
		
		driver.findElement(By.linkText("Collection Tools")).click();
		UtilityTools.MySleep(sleepTime);
			
			return ret;
	}

}
