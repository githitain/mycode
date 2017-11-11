package executionEngine;
 
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import config.ActionKeywords;
import utility.ExcelUtils;
import config.Constants;
 
public class DriverScript 
{
	public static Properties OR;
	public static ActionKeywords actionKeywords;
	public static String sActionKeyword;
	public static String sPageObject;
	public static Method method[];
	
	public static int iTestStep;
	public static int iTestLastStep;
	public static String sTestCaseID;
	public static String sRunMode;
 
	public DriverScript() throws NoSuchMethodException, SecurityException
	{
		actionKeywords = new ActionKeywords();
		method = actionKeywords.getClass().getMethods();
	}
 
    public static void main(String[] args) throws Exception  
    {
 
    	DriverScript b1 = new DriverScript();
    	ExcelUtils.setExcelFile(Constants.Path_TestData);
    	String Path_OR = Constants.Path_OR; 
    	System.out.println(Path_OR);
    	FileInputStream fs = new FileInputStream(Path_OR);
    	OR=new Properties(System.getProperties());
    	OR.load(fs);
    	b1.execute_TestCase();
     }
    
    private void execute_TestCase() throws Exception 
    {
    	//This will return the total number of test cases mentioned in the Test cases sheet
    	int iTotalTestCases = ExcelUtils.getRowCount(Constants.Sheet_TestCases);
    	System.out.println("iTotalTestCases number:"+ iTotalTestCases);
		//This loop will execute number of times equal to Total number of test cases
    	for(int iTestcase=1;iTestcase<=iTotalTestCases;iTestcase++)
    	{
			//This is to get the Test case name from the Test Cases sheet
			sTestCaseID = ExcelUtils.getCellData(iTestcase, Constants.Col_TestCaseID, Constants.Sheet_TestCases);
			System.out.println("sTestCaseID :"+ sTestCaseID);
			//This is to get the value of the Run Mode column for the current test case
			sRunMode = ExcelUtils.getCellData(iTestcase, Constants.Col_RunMode,Constants.Sheet_TestCases);
			System.out.println("sRunMode :"+ sRunMode+ "=" + sRunMode);
			//This is the condition statement on RunMode value
			if(sRunMode.equals("Yes"))
			{
				//Only if the value of Run Mode is 'Yes', this part of code will execute
				iTestStep = ExcelUtils.getRowContains(sTestCaseID, Constants.Col_TestCaseID, Constants.Sheet_TestSteps);
				System.out.println("execute_TestCase-iTestStep :"+ iTestStep);
				iTestLastStep = ExcelUtils.getTestStepsCount(Constants.Sheet_TestSteps, sTestCaseID, iTestStep);
				System.out.println("execute_TestCase-iTestLastStep :"+ iTestLastStep);
				//This loop will execute number of times equal to Total number of test steps
				for (;iTestStep<=iTestLastStep;iTestStep++)
				{
					sActionKeyword = ExcelUtils.getCellData(iTestStep, Constants.Col_ActionKeyword,Constants.Sheet_TestSteps);
		    		sPageObject = ExcelUtils.getCellData(iTestStep, Constants.Col_PageObject, Constants.Sheet_TestSteps);
		    		System.out.println("for loop  execute_TestCase-sActionKeyword + sPageObject :"+ sActionKeyword+"+"+sPageObject);
		    		execute_Actions();
				}
			}
		}
    }
	
	private static void execute_Actions() throws Exception 
    {
		/*for(int i = 0;i <method.length;i++)
		{
			System.out.println(method[i]);
		}*/
		for(int i = 0;i <method.length;i++)
		{
			//System.out.println(method.length);
			//System.out.println(method[i]);
			
			if(method[i].getName().equals(sActionKeyword))
			{
				System.out.println(sActionKeyword);
				System.out.println(sPageObject);
				method[i].invoke(actionKeywords,sPageObject);
				break;
			}
		}
	}
 }