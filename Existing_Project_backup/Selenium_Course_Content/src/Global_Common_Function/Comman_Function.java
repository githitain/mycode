package Global_Common_Function;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Comman_Function
{
	static WebDriver driver;
	//public static boolean verifyTextPresent;
	
	public static void main(String args[]) throws IOException
	{
		/*List<String> exp=new ArrayList<>();
		File myFile = new File("D://Workspace_2//Selenium_Course_Content//bin//Resources//OR1.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
		XSSFSheet mySheet = myWorkBook.getSheetAt(0);
		Iterator<Row> rowIterator = mySheet.iterator();
		while (rowIterator.hasNext()) 
		{
			Row row= rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			Cell cell =cellIterator.next();
			switch (cell.getCellType())
			{ 
				case Cell.CELL_TYPE_STRING: 
				exp.add(cell.getStringCellValue().trim());
				break; 
				case Cell.CELL_TYPE_NUMERIC:
				String nvalue=String.valueOf(cell.getNumericCellValue());
				nvalue=nvalue.replaceAll("(?<=^\\d+)\\.0*$", "");
				exp.add(nvalue);
				break; 
				case Cell.CELL_TYPE_BOOLEAN: 
				break; 
				default :
			}
		}
		System.out.println("Exp Data in excel:" +exp.toString());*/
		
		ListOneRowExcel("D://Workspace_2//Selenium_Course_Content//bin//Resources//OR1.xlsx", "exp_dropdown");
		ListOneRowExcel("D://Workspace_2//Selenium_Course_Content//bin//Resources//OR1.xlsx", "Sal_dropdown");
		//verifyText()
	}
	
	
	public static List<String> ListOneRowExcel(String filepath,String sheetname) throws IOException
	{
		List<String> exp=new ArrayList<>();
		File myFile = new File(filepath);
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
		XSSFSheet mySheet = myWorkBook.getSheet(sheetname);
		Iterator<Row> rowIterator = mySheet.iterator();
		while (rowIterator.hasNext()) 
		{
			Row row= rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			Cell cell =cellIterator.next();
			switch (cell.getCellType())
			{ 
				case Cell.CELL_TYPE_STRING: 
				exp.add(cell.getStringCellValue().trim());
				break; 
				case Cell.CELL_TYPE_NUMERIC:
				String nvalue=String.valueOf(cell.getNumericCellValue());
				nvalue=nvalue.replaceAll("(?<=^\\d+)\\.0*$", "");
				exp.add(nvalue);
				break; 
				case Cell.CELL_TYPE_BOOLEAN: 
				break; 
				default :
			}
		}
		System.out.println("Excel Data via function:"+sheetname+ "="+exp.toString());
		return exp;
	}
	
	
	public static WebDriver AddpopWindowHanlded(WebDriver driver)
	{
		String parent = driver.getWindowHandle();
		Set<String> pops=driver.getWindowHandles();
		{
			Iterator<String> it =pops.iterator();
			while (it.hasNext()) 
			{
				String popupHandle=it.next().toString();
				if(!popupHandle.contains(parent))
				{
					driver.switchTo().window(popupHandle);
					System.out.println("Popu Up Title: "+ driver.switchTo().window(popupHandle).getTitle());
					driver.close();
				}
			}
			driver.switchTo().window(parent);
		}
		return driver;
	}
	
	public static WebDriver verifyText(String s, WebDriver driver)
	{	
		String getPage=driver.getPageSource();
		
		try
		{
			System.out.println("Verify the expected text =" + s);
		
			assertTrue(getPage.contains(s));
			
			System.out.println("Text is Present on the page" + s);
		}
		catch(Exception e)
		{
			System.out.println("Text is not Present on the page" + s);
			System.out.println(e);
		}
		return driver;
	}
	
	
	public static WebDriver LandingPage(String s , WebDriver driver)
	{	
		driver.navigate().to(s);
		return driver;
	}

	
	
}	




