package utility;

import java.io.FileInputStream;





import java.io.FileOutputStream;

//import org.apache.poi.openxml4j.opc.Package;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import config.Constants;
import executionEngine.DriverScript;

public class ExcelUtils 
{
	 private static XSSFSheet ExcelWSheet;
     private static XSSFWorkbook ExcelWBook;
     private static XSSFCell Cell;
     private static XSSFRow Row;

     //This method is to set the File path and to open the Excel file
     //Pass Excel Path and SheetName as Arguments to this method
	 public static void setExcelFile(String Path) throws Exception 
	 {
		 try
		 {
	         FileInputStream ExcelFile = new FileInputStream(Path);
	         ExcelWBook = new XSSFWorkbook(ExcelFile);
	         System.out.println("setExcelFile-ExcelWBook:"+ ExcelWBook);
		 }
		catch (Exception e)
		{
			 Log.error("Class Utils | Method setExcelFile | Exception desc : "+e.getMessage());
			 DriverScript.bResult = false;
		}
	 }
	 

	 //This method is to read the test data from the Excel cell
     //In this we are passing Arguments as Row Num, Col Num & Sheet Name
	 public static String getCellData(int RowNum, int ColNum, String SheetName) throws Exception
	 {
		 try
		 {
		 
			 ExcelWSheet = ExcelWBook.getSheet(SheetName);
			 System.out.println("getCellData -ExcelWSheet:" + SheetName);
			 try
			 {
				 Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	/*			 if(Cell ==null)
				 throw new RuntimeException ("AssetRole value is NULL.");
	*/			 String CellData = Cell.getStringCellValue();
				 System.out.println("getCellData CellData:" +CellData);
				 return CellData;
			 }
			 catch (Exception e)
			 {
				 return"";
			 }
		 }
		 catch (Exception e)
		 {	
			 Log.error("Class Utils | Method getCellData | Exception desc : "+e.getMessage());
		 	 DriverScript.bResult = false;
			 return "";
		 }
	 }
	 
	//This method is to get the row count used of the excel sheet
 	public static int getRowCount(String SheetName)
 	{
 		int iNumber=0;
 		try
 		{
	 		ExcelWSheet = ExcelWBook.getSheet(SheetName);
			iNumber=ExcelWSheet.getLastRowNum();
			System.out.println("getRowCount number:" +iNumber);
 		}
 		catch(Exception e)
 		{
 			Log.error("Class Utils | Method getRowContains | Exception desc : "+e.getMessage());
			DriverScript.bResult = false;
 		}
 		return iNumber;
 	}
 	
	//This method is to get the Row number of the test case
	//This methods takes three arguments(Test Case name , Column Number & Sheet name)
 	public static int getRowContains(String sTestCaseName, int colNum,String SheetName) throws Exception
 	{	
 		int iRowNum=0;
 		try
 		{
	 		ExcelWSheet = ExcelWBook.getSheet(SheetName);
	 		int rowCount = ExcelUtils.getRowCount(SheetName);
	 		System.out.println("getRowContains rowCount:" +rowCount);
 		
	 		for(iRowNum=0;iRowNum<rowCount; iRowNum++)
	 		{
	 		 	if(ExcelUtils.getCellData(iRowNum, colNum, SheetName).equalsIgnoreCase(sTestCaseName))
	 			{
	 				break;
	 			}
	 		}
 		}
 		catch (Exception e)
 		{
			Log.error("Class Utils | Method getRowContains | Exception desc : "+e.getMessage());
			DriverScript.bResult = false;
		}
 		
 		System.out.println("getRowContains i:" +iRowNum);
 		return iRowNum;
 	}
 	
 	//This method is to get the count of the test steps of test case
	//This method takes three arguments (Sheet name, Test Case Id & Test case row number)
	public static int getTestStepsCount(String SheetName, String sTestCaseID, int iTestCaseStart) throws Exception
	{
		try 
		{
			int TotalrowCount =ExcelUtils.getRowCount(SheetName);
			for(int i=iTestCaseStart;i<=TotalrowCount;i++)
			{
				if(!sTestCaseID.equals(ExcelUtils.getCellData(i, Constants.Col_TestCaseID, SheetName)))
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
		catch (Exception e)
		{
			Log.error("Class Utils | Method getRowContains | Exception desc : "+e.getMessage());
			DriverScript.bResult = false;
			return 0;
		}
	}
	
	@SuppressWarnings("static-access")
	public static void setCellData(String Result,  int RowNum, int ColNum, String SheetName) throws Exception
	{
		try
		{
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
			Row  = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
			
			if(Cell == null)
			{
				Cell=Row.createCell(ColNum);
				Cell.setCellValue(Result);
			}
			else
			{
				Cell.setCellValue(Result);
			}	
			
			// Constant variables Test Data path and Test Data file name
			FileOutputStream fileOut = new FileOutputStream(Constants.Path_TestData);
			ExcelWBook.write(fileOut);
			fileOut.close();
			ExcelWBook = new XSSFWorkbook(new FileInputStream(Constants.Path_TestData));
		}
		catch(Exception e)
		{
			DriverScript.bResult = false;
		}
	}
	
}
 	
 
