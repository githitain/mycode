package com.iii.tests.dctests;
/**

 * @version $Id: DevelopmentVerification.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class DevelopmentVerification {

 static long sleepTime = 1000;
 static long sleepTime2 = 1000;
 //static WebDriver driver;
    static String fileName1 = "C:\\DC\\dcfiles\\SupplyAndDemandBuying.txt";
    static String fileName2 = "C:\\DC\\dcfiles\\HoldToItemRatioBuying.txt";
    static String tableName = "reportTable reportTableBody";

 @Test
 public static boolean ReportVerification(WebDriver driver) {
  boolean ret = true;
  UtilityTools.MySleep(sleepTime);
 // start Supply and Demand Buying verify info
  
  // Commented by Nancy
 
  try {
   
   driver =UtilityTools.MyRelogin(driver);
   driver.manage().window().maximize();
   
   UtilityTools.MySleep(sleepTime2);
   driver.findElement(By.xpath(".//*[@id='development']/img")).click();
   driver.findElement(By.linkText("Supply and Demand Buying")).click();
   UtilityTools.MySleep(sleepTime);
   
   driver.findElement(By.id("submit")).click();
   UtilityTools.MySleep(sleepTime);
   
   System.out.println("\n Start Verification of Supply and Demand Buying Report \n");
   
    String textFromFile = UtilityTools.readFileToString(fileName1);
    String textFromReport=UtilityTools.readReportBody(tableName, driver);
    
    System.out.println("Text From File: " + textFromFile);
    System.out.println("Text From Report: " +  textFromReport);
    
         try {
             System.out.println("\nComparing both Files \n");
        assertEquals(textFromFile, textFromReport);
          System.out.println("\nComparision Passed \n");
          
         } catch (Exception e) {
     System.out.println("\nText Comparision failed for Supply and Demand Buying report\n");
     e.printStackTrace();
     ret = false;

         }
     
     UtilityTools.sortingTest(driver);
    
         
  } catch (Exception e) {
   System.out.println("\t Unable to verify info Supply and Demand Buying");
   e.printStackTrace();
   ret = false;

  }  
 System.out.println("\t Finish Verification of Supply and Demand Buying Report \n");
 System.out.println("\t ******************************************************* \n");

  
 //Till here Commented by Nancy
  
 // start HOLD-TO-ITEM RATIO BUYING collecting info 
 
 driver.findElement(By.linkText("Collection Tools")).click();
  
 try {   
   //driver=UtilityTools.MyRelogin(driver);
   //driver.manage().window().maximize();
   driver.findElement(By.xpath(".//*[@id='development']/img")).click();
   UtilityTools.MySleep(sleepTime2);
   driver.findElement(By.linkText("Hold-to-Item Ratio Buying")).click();
   //driver.findElement(By.linkText("Current Holdings")).click();
   UtilityTools.MySleep(sleepTime2);
   Thread.sleep(3000);
   driver.findElement(By.xpath(".//*[@value='dc_hold_to_item_ratio_buying']")).click();
   //driver.findElement(By.id("id")).click();
   
   driver.findElement(By.xpath(".//*[@id='submit']")).click();
   Thread.sleep(3000);
   
   System.out.println("\n Start Verification of Hold to Item Ratio Buying -> Current Holdings \n");
   
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
   
   WebElement devField = driver.findElement(By.id("filters.holdToItemRatioGreaterThan"));
   Thread.sleep(3000);
   devField.clear();
   Thread.sleep(3000);
   devField.sendKeys("1.0");
   Thread.sleep(3000);
   
   driver.findElement(By.id("submit")).click();
   
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
     System.out.println("\nText Comparision failed for Hold-to-Item Ratio Buying report\n");
     e.printStackTrace();
     ret = false;

         }
         UtilityTools.sortingTest(driver);
         
  } catch (Exception e) {
   System.out.println("\t unable to verify info Hold-to-Item Ratio Buying");
   e.printStackTrace();
   ret = false;

  }
  System.out.println("\t finish verification of Hold-to-Item Ratio Buying \n");
  driver.findElement(By.linkText("Collection Tools")).click();
 
    
  return ret;
 }

}