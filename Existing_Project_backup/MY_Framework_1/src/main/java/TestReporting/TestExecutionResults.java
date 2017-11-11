package TestReporting;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import POM.*;
import TestSuites.*;


public class TestExecutionResults 
{
	final static Logger logger = Logger.getLogger(TestSuite_1.class);
	TestSuite_1 ob1 = new TestSuite_1(); 
	
	
	@Test
	public void TesSuite_1() throws Exception 
	{
		try
		{

		ob1.TC1_SearchTerm();
		logger.info("TesSuite_1 is passed");
		}
		catch(Exception ee)
		{
		logger.error("TesSuite_1 is failed");
		ee.printStackTrace();
		}
	}
	public void TesSuite_2() throws Exception 
	{
		logger.info("Total Number of Test cases count ="+ MainPage.TCcount);
		logger.info("Total Passed count ="+ MainPage.passcount);
		logger.info("Total Failed count ="+ MainPage.failcount);
		
	}

}
