package com.iii.tests;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.iii.tests.common.UtilityTools;
import com.iii.tests.dctests.AcquisitionsVerification;
import com.iii.tests.dctests.BalancingVerification;
import com.iii.tests.dctests.CirculationVerification;
import com.iii.tests.dctests.CollectionVerification;
import com.iii.tests.dctests.DevelopmentVerification;
import com.iii.tests.dctests.EncoreVerification;
import com.iii.tests.dctests.MaintenanceVerification;

 

public class FullDecisionCenterTest {
 
 static WebDriver driver;
 static long sleepTime = 10000;
 static String nameFile = "C:\\DC\\dcfiles\\tmpReport.txt";
 static String textFromFile;
 boolean createReport;
 
 @Test
    public void startWebDriver() throws IOException{
  
   UtilityTools.deleteInfoFile(nameFile);

  try {
   FileOutputStream writer = new FileOutputStream(nameFile);
   writer.close();
  } catch (FileNotFoundException e1) {
   System.out.println(e1.toString()+"\n");
   e1.printStackTrace();
  }
  
  createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | Start Full Decision Center | Start \n"), nameFile);
  
    // Start verify Development info
 /*   
boolean developmentVerifyInfo = DevelopmentVerification.ReportVerification(driver);
  if (developmentVerifyInfo){
   System.out.println("\nPass verification of Development reports");
  } else {
   System.out.println("\tunable to verify Development reports");
  }
*/
  
  
 // Start verify Balancing info
  /*boolean balancingVerifyInfo = BalancingVerification.ReportVerification(driver);
  if (balancingVerifyInfo){
   System.out.println("\nPass verification of Balancing reports");
  } else {
   System.out.println("\tunable to verify Balancing reports");
  }*/
  
  
 // Start verify Maintenance info
 /* boolean maintenanceVerifyInfo = MaintenanceVerification.ReportVerification(driver);
  if (maintenanceVerifyInfo){
   System.out.println("\nPass verification of Maintenance reports");
  } else {
   System.out.println("\tunable to verify Maintenance reports");
  }*/
  
 // Start verify Acquisitions info
  
  /*boolean acquisitionsVerifyInfo = AcquisitionsVerification.ReportVerification(driver);
  if (acquisitionsVerifyInfo){
   System.out.println("\nPass verification of Acquisitions reports");
  } else {
    System.out.println("\tunable to verify Acquisitions reports");
  }*/
   
 // Start verify Circulation reports
   
  boolean circulationVerifyInfo = CirculationVerification.ReportVerification(driver);
  if (circulationVerifyInfo){
   System.out.println("\nPass verification of Circulation reports");
    
  } else {
   System.out.println("\tunable to verify Circulation reports");
    
  }
   
 // Start verify Collection reports
   
  boolean collectionVerifyInfo = CollectionVerification.ReportVerification();
  if (collectionVerifyInfo){
   System.out.println("\nPass verification of Collection reports");
    
  } else {
   System.out.println("\tunable to verify Collection reports");
    
  }
 // Start verify Encore reports
   
  boolean encoreVerifyInfo = EncoreVerification.ReportVerification();
  if (encoreVerifyInfo){
   System.out.println("\nPass verification of Encore reports");
    
  } else {
   System.out.println("\tunable to verify Encore reports");
    
  }
  
  createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+"| Finish Full Decision Center | End\n"), nameFile);
  
    }

}

 