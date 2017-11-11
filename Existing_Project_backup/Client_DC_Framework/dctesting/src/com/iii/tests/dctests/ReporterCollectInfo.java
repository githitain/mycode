package com.iii.tests.dctests;
/**

 * @version $Id: ReporterCollectInfo.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */
import org.junit.Test;

import com.iii.tests.common.UtilityTools;

public class ReporterCollectInfo {
	
	boolean testFailed = false;
	static long sleepTime = 10000;
	static String testResult = "";
	static String nameFile = "C:\\DC\\dcfiles\\tmpReport.txt";
	boolean createReport;

	
	@Test
	public void test() {
		
		System.out.print("\nStart collect info of the Reporter - start time: "+UtilityTools.getDateTime()+"\n");
		

	// Start collect Acquisitions reports
		
		boolean acquisitionsCollectInfo = AcquisitionsCollectInfo.CollectInfo();
		if (acquisitionsCollectInfo){
			System.out.println("\nPass collect of Acquisitions reports");
			
		} else {
			System.out.println("\tunable to collect Acquisitions reports");
			testFailed = true;
		}
		
	// Start collect Circulation reports
		
		boolean circulationCollectInfo = CirculationCollectInfo.CollectInfo();
		if (circulationCollectInfo){
			System.out.println("\nPass collect of Circulation reports");
		} else {
			System.out.println("\tunable to collect Circulation reports");
			testFailed = true;
		}
		
	// Start collect Collection reports
		
		boolean collectionCollectInfo = CollectionCollectInfo.CollectInfo();
		if (collectionCollectInfo){
			System.out.println("\nPass collect of Collection reports");
		} else {
			System.out.println("\tunable to collect Collection reports");
			testFailed = true;
		}
		
		
	// Start collect Encore reports
		
		boolean encoreCollectInfo = EncoreCollectInfo.CollectInfo();
		if (encoreCollectInfo){
			System.out.println("\nPass collect of Encore reports");
		} else {
			System.out.println("\tunable to collect Encore reports");
			testFailed = true;
		}
		
		
		System.out.print("\nFinish collect info of the Reporter - end time: "+UtilityTools.getDateTime()+"\n");
	}

}
