package com.iii.tests.dctests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.iii.tests.common.UtilityTools;

@SuppressWarnings("unused")

public class ReporterVerification {
	
	
	boolean testFailed = false;
	static long sleepTime = 10000;
	static String testResult = "";
	static String nameFile = "C:\\DC\\dcfiles\\tmpReport.txt";
	boolean createReport;
	static WebDriver driver;
	
	@Test
	public void test() {
		
		UtilityTools.deleteInfoFile(nameFile);
		
		System.out.print("\nStart verification info of the Reporter - start time: "+UtilityTools.getDateTime()+"\n");
		createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | Start Full Decision Center | Start \n"), nameFile);
		
		// Start verify Acquisitions reports
		
		boolean acquisitionsVerifyInfo = AcquisitionsVerification.ReportVerification(driver);
		if (acquisitionsVerifyInfo){
			System.out.println("\nPass verification of Acquisitions reports");
			testResult = testResult + "\nverification of Acquisitions reports -  Pass\n";
		} else {
			System.out.println("\tunable to verify Acquisitions reports");
			testResult = testResult + "\nverification of Acquisitions reports -  Failed\n";
			testFailed = true;
		}
		
		// Start verify Circulation reports
		
		boolean circulationVerifyInfo = CirculationVerification.ReportVerification(driver);
		if (circulationVerifyInfo){
			System.out.println("\nPass verification of Circulation reports");
			testResult = testResult + "\nverification of Circulation reports -  Pass\n";
		} else {
			System.out.println("\tunable to verify Circulation reports");
			testResult = testResult + "\nverification of Circulation reports -  Failed\n";
			testFailed = true;
		}
		
		// Start verify Collection reports
		
		boolean collectionVerifyInfo = CollectionVerification.ReportVerification();
		if (collectionVerifyInfo){
			System.out.println("\nPass verification of Collection reports");
			testResult = testResult + "\nverification of Collection reports -  Pass\n";
		} else {
			System.out.println("\tunable to verify Collection reports");
			testResult = testResult + "\nverification of Collection reports -  Failed\n";
			testFailed = true;
		}
		
		
		// Start verify Encore reports
		
		boolean encoreVerifyInfo = EncoreVerification.ReportVerification();
		if (encoreVerifyInfo){
			System.out.println("\nPass verification of Encore reports");
			testResult = testResult + "\nverification of Encore reports -  Pass\n";
		} else {
			System.out.println("\tunable to verify Encore reports");
			testResult = testResult + "\nverification of Encore reports -  Failed\n";
			testFailed = true;
		}
		
		
		System.out.print("\nFinish verification info of the Reporter - end time: "+UtilityTools.getDateTime()+"\n");
		createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+"| Finish Full Decision Center | End\n"), nameFile);
		
		
	}
		
}
