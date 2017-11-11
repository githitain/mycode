package utility;

import java.io.FileInputStream;










//import org.apache.poi.openxml4j.opc.Package;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import config.Constants;

public class ExcelUtils_Example 
{
	
	private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
 	
 	public static int iTestStep;
 	public static int iTestLastStep;
 	public static String sTestCaseID;
 	public static String sRunMode;
 	public static String sActionKeyword;
	public static String sPageObject;
	public static String sORSheetName;
	public static String sTestData;

     //This method is to set the File path and to open the Excel file
     //Pass Excel Path and SheetName as Arguments to this method
	 public static void setExcelFile(String Path) throws Exception 
	 {		 //String Path="D://Workspace_2//Keyword_FrameWork//src//main//java//dataEngine//DataEngine.xlsx";	
	         FileInputStream ExcelFile = new FileInputStream(Path);
	         ExcelWBook = new XSSFWorkbook(ExcelFile);
	         System.out.println("setExcelFile-ExcelWBook:"+ ExcelWBook);
	 }

	 //This method is to read the test data from the Excel cell
     //In this we are passing Arguments as Row Num, Col Num & Sheet Name
	 public static String getCellData(int RowNum, int ColNum, String SheetName) throws Exception
	 {
		 
		 ExcelWSheet = ExcelWBook.getSheet(SheetName);
		 System.out.println("getCellData -ExcelWSheet:" + SheetName);
		 try
		 {
			 Cell =ExcelWSheet.getRow(RowNum).getCell(ColNum);
		     String CellData = Cell.getStringCellValue();
		     System.out.println("getCellData CellData:" +CellData);
		      
		     return CellData;
		 }
		 catch (Exception e)
		 {
			 return "";
		 }
	 }
	 
	//This method is to get the row count used of the excel sheet
 	public static int getRowCount(String SheetName)
 	{	//String SheetName = "Test_Case";
 		//System.out.println(ExcelWBook);
 		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		int number=ExcelWSheet.getLastRowNum();
		
		System.out.println("getRowCount number:" +number);
		
		return number;
 	}
 	
	//This method is to get the Row number of the test case
	//This methods takes three arguments(Test Case name , Column Number & Sheet name)
 	public static int getRowContains(String sTestCaseName, int colNum,String SheetName) throws Exception
 	{	
 		int i;
 		ExcelWSheet = ExcelWBook.getSheet(SheetName);
 		int rowCount = ExcelUtils_Example.getRowCount(SheetName);
 		System.out.println("getRowContains rowCount:" +rowCount);
 		
 		for(i=1;i<rowCount; i++)
 		{
 		 
 			if(ExcelUtils_Example.getCellData(i, colNum, SheetName).equalsIgnoreCase(sTestCaseName))
 			{
 				break;
 			}
 		}
 		System.out.println("getRowContains i:" +i);
 		return i;
 	}
 	
 	//This method is to get the count of the test steps of test case
	//This method takes three arguments (Sheet name, Test Case Id & Test case row number)
	public static int getTestStepsCount(String SheetName, String sTestCaseID, int iTestCaseStart) throws Exception
	{
		int TotalrowCount =ExcelUtils_Example.getRowCount(SheetName);
		for(int i=iTestCaseStart;i<=TotalrowCount;i++)
		{
			if(!sTestCaseID.equals(ExcelUtils_Example.getCellData(i, Constants.Col_TestCaseID, SheetName)))
			{
				int number=i;
				return number;
			}
		}
		ExcelWSheet=ExcelWBook.getSheet(SheetName);
		int number=ExcelWSheet.getLastRowNum();
		System.out.println("getTestStepsCount number:"+ number);
		return number;
	}
	
    public static void execute_TestCase() throws Exception 
    {
    	//This will return the total number of test cases mentioned in the Test cases sheet
    	int iTotalTestCases = ExcelUtils_Example.getRowCount(Constants.Sheet_TestCases);
    	//int iLastTestCases = ExcelUtils_Example.getTestStepsCount(Constants.Sheet_TestCases, sTestCaseID, iTestStep);
    	System.out.println("iTotalTestCases number:"+ iTotalTestCases);
		//This loop will execute number of times equal to Total number of test cases6
    	for(int iTestcase=1;iTestcase<=iTotalTestCases;iTestcase++)
    	{
			//This is to get the Test case name from the Test Cases sheet
			sTestCaseID = ExcelUtils_Example.getCellData(iTestcase, Constants.Col_TestCaseID, Constants.Sheet_TestCases);
			System.out.println("sTestCaseID :"+ sTestCaseID);
			//This is to get the value of the Run Mode column for the current test case
			sRunMode = ExcelUtils_Example.getCellData(iTestcase, Constants.Col_RunMode,Constants.Sheet_TestCases);
			System.out.println("sRunMode :"+ sRunMode+ "=" + sRunMode);
			//This is the condition statement on RunMode value
			if(sRunMode.equals("Yes"))
			{
				///Only if the value of Run Mode is 'Yes', this part of code will execute
				iTestStep = ExcelUtils_Example.getRowContains(sTestCaseID, Constants.Col_TestCaseID, sTestCaseID);
				System.out.println("execute_TestCase-iTestStep :"+ iTestStep);
				iTestLastStep = ExcelUtils_Example.getTestStepsCount(sTestCaseID, sTestCaseID, iTestStep);
				System.out.println("execute_TestCase-iTestLastStep :"+ iTestLastStep);
				//This loop will execute number of times equal to Total number of test steps
				for (;iTestStep<=iTestLastStep;iTestStep++)
				{
					sActionKeyword = ExcelUtils_Example.getCellData(iTestStep, Constants.Col_ActionKeyword,sTestCaseID);
		    		sPageObject = ExcelUtils_Example.getCellData(iTestStep, Constants.Col_PageObject, sTestCaseID);
		    		sORSheetName = ExcelUtils_Example.getCellData(iTestStep, Constants.Col_ORSheetName, sTestCaseID);
		    		sTestData = ExcelUtils_Example.getCellData(iTestStep, Constants.Col_TestData, sTestCaseID);
		    		System.out.println("sActionKeyword + sPageObject+sORSheetName+sTestData=:"+ sActionKeyword+"+"+sPageObject+"+"+sORSheetName+"+"+sTestData);
		    		//execute_Actions();
				}
				
				System.out.println("Runable testcase");
			}
    	else 
    		{
    		System.out.println("Not Runable testcase");
    		}
		}
    }
    
    public static void main(String args[]) throws Exception
    {
    	setExcelFile(Constants.Path_TestData);
    	execute_TestCase();
    	//getRowCount();
    	
    }
}
 
