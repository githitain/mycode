package Selenium_Prograames;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Excel_Parametraztion.RespositoryParser;
//import POM.Configuratin_setting;
import Parametation_Propetiese_File.Properties_File_reading;

public class Verify_Drop_Down_using_properties_file
{
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception
	{
		driver=Properties_File_reading.getBrowser("browser");
		driver.get(Properties_File_reading.getBrowserUrl("local"));
		driver.manage().timeouts().implicitlyWait(Properties_File_reading.getTime("time"),TimeUnit.SECONDS);
	}
	
	@Test
	public void testWindowAlert() throws Exception
	{
		
		List<String> exp=new ArrayList<>();
		File myFile = new File("D://Workspace_2//Selenium_Course_Content//bin//Resources//");
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
				//System.out.print(cell.getStringCellValue().trim() + "\t"); 
				break; 
				case Cell.CELL_TYPE_NUMERIC:
					String nvalue=String.valueOf(cell.getNumericCellValue());
					nvalue=nvalue.replaceAll("(?<=^\\d+)\\.0*$", "");
					exp.add(nvalue);
					//System.out.println(nvalue);
				//System.out.print(String.valueOf(cell.getNumericCellValue())+ "\t");
				//System.out.print(cell.getNumericCellValue().  )+ "\t");
				break; 
				case Cell.CELL_TYPE_BOOLEAN: 
				//System.out.print(cell.getBooleanCellValue() + "\t"); 
				break; 
				default :
			}
			//System.out.println("");
		}
		System.out.println("Data in excel:" +exp.toString());
		
		driver.findElement(RespositoryParser.getbjectLocator("naukari", "salary")).click();
		List<WebElement> options = driver.findElements(RespositoryParser.getbjectLocator("naukari", "saaryList"));
		
		for(int l=0;l<options.size();l++)
		 {
			 System.out.println("Dynamic Value is :" + options.get(l).getText());
		 }
		 for(int e=0;e<exp.size();e++)
		 {
			 System.out.println("Static value:" + exp.get(e));
		 }
		 for(int j=0;j<exp.size();j++)
		 {
			String e = options.get(j).getText();
			String a = exp.get(j);
			if(a.equals(e))
			{
				 System.out.println("Value matched:" + a);
			}
			else
			{
				 System.out.println("Value is not matched:" + e);
			break;
			}
		 }
	}
	 
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
