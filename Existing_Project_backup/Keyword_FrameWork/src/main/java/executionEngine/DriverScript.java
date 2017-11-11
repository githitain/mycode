package executionEngine;
 
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;

import config.ActionKeywords;
import utility.ExcelUtils;
import utility.ExcelUtils_Example;
import utility.Log;
import config.Constants;
 
public class DriverScript 
{
	public static Properties OR;
	public static ActionKeywords actionKeywords;
	public static String sActionKeyword;
	public static String sPageObject;
	public static String sORSheetName;
	public static String sTestData;
	public static Method method[];
	public static int iTestStep;
	public static int iTestLastStep;
	public static String sTestCaseID;
	public static String sRunMode;
	public static boolean bResult;
	
	public DriverScript() throws NoSuchMethodException, SecurityException
	{
		actionKeywords = new ActionKeywords();
		method = actionKeywords.getClass().getMethods();
	}
 
	//The main script is divided in to three parts now
	//First is main[] method, execution starts from here
    public static void main(String[] args) throws Exception  
    {
 
    	DriverScript b1 = new DriverScript();
    	ExcelUtils.setExcelFile(Constants.Path_TestData);
    	//This is to start the Log4j logging in the test case
    	DOMConfigurator.configure("log4j.xml");
    	String Path_OR = Constants.Path_OR; 
    	System.out.println(Path_OR);
    	FileInputStream fs = new FileInputStream(Path_OR);
    	OR=new Properties(System.getProperties());
    	OR.load(fs);
    	b1.execute_TestCase();
     }
    

	//Second method, this is to figure out the test cases execution one by one
	//And to figure out test step execution one by one
    private void execute_TestCase() throws Exception 
    {
    	int iTotalTestCases = ExcelUtils.getRowCount(Constants.Sheet_TestCases);
    	System.out.println("iTotalTestCases number:"+ iTotalTestCases);
    	for(int iTestcase=1;iTestcase<=iTotalTestCases;iTestcase++)
    	{	//Setting the value of bResult variable to 'true' before starting every test case
    		bResult=true;
			sTestCaseID = ExcelUtils.getCellData(iTestcase, Constants.Col_TestCaseID, Constants.Sheet_TestCases);
			System.out.println("sTestCaseID :"+ sTestCaseID);
			sRunMode = ExcelUtils.getCellData(iTestcase, Constants.Col_RunMode,Constants.Sheet_TestCases);
			System.out.println("sRunMode :"+ sRunMode+ "=" + sRunMode);
			if(sRunMode.equals("Yes"))
			{
				iTestStep = ExcelUtils.getRowContains(sTestCaseID, Constants.Col_TestCaseID, sTestCaseID);
				System.out.println("execute_TestCase-iTestStep :"+ iTestStep);
				iTestLastStep = ExcelUtils.getTestStepsCount(sTestCaseID, sTestCaseID, iTestStep);
				System.out.println("execute_TestCase-iTestLastStep :"+ iTestLastStep);
				Log.startTestCase(sTestCaseID);
				//Setting the value of bResult variable to 'true' before starting every test step
				bResult=true;
				for (;iTestStep<=iTestLastStep;iTestStep++)
				{
					sActionKeyword = ExcelUtils.getCellData(iTestStep, Constants.Col_ActionKeyword,sTestCaseID);
		    		sPageObject = ExcelUtils.getCellData(iTestStep, Constants.Col_PageObject, sTestCaseID);
		    		sORSheetName = ExcelUtils.getCellData(iTestStep, Constants.Col_ORSheetName, sTestCaseID);
		    		sTestData = ExcelUtils.getCellData(iTestStep, Constants.Col_TestData, sTestCaseID);
		    		System.out.println("sActionKeyword + sPageObject+sORSheetName+sTestData=:"+ sActionKeyword+"+"+sORSheetName+"+"+sPageObject+"+"+sTestData);
		    		execute_Actions();
		    		if(bResult==false)
		    		{
		    			ExcelUtils.setCellData(Constants.KEYWORD_FAIL, iTestcase, Constants.Col_Result, Constants.Sheet_TestCases);
		    			Log.endTestCase(sTestCaseID);
		    			break;
		    		}
				}
				if(bResult==true)
				{
					ExcelUtils.setCellData(Constants.KEYWORD_PASS, iTestcase, Constants.Col_Result, Constants.Sheet_TestCases);
					Log.endTestCase(sTestCaseID);
				}
			}
		}
    }
	
	private static void execute_Actions() throws Exception 
    {
		for(int i = 0;i <method.length;i++)
		{
			if(method[i].getName().equals(sActionKeyword))
			{
				System.out.println(sActionKeyword);
				System.out.println(sORSheetName);
				System.out.println(sPageObject);
				System.out.println(sTestData);
				System.out.println(sTestCaseID);
				method[i].invoke(actionKeywords,sORSheetName,sPageObject,sTestData);
				//This code block will execute after every test step
				if(bResult==true)
				{
					ExcelUtils.setCellData(Constants.KEYWORD_PASS, iTestStep, Constants.Col_TestStepResult, sTestCaseID);
					break;
				}
				else
				{
					//If the executed test step value is false, Fail the test step in Excel sheet
					ExcelUtils.setCellData(Constants.KEYWORD_FAIL, iTestStep,Constants.Col_TestStepResult,sTestCaseID);
					ActionKeywords.closeBrowser(sORSheetName,sPageObject,sTestData);
					break;
				}
			}
			}
		}
	}
 