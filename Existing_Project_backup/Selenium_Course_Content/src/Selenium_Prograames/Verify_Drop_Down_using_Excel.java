package Selenium_Prograames;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
import Parametation_Propetiese_File.Properties_File_reading;

public class Verify_Drop_Down_using_Excel 
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
		

///--------Code do read excel file for experice dropdown---
		List<String> exp=new ArrayList<>();
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
		System.out.println("Exp Data in excel:" +exp.toString());
		
		
///--------Code do read excel file for experience dropdown---
		List<String> sal=new ArrayList<>();
		File myFile1 = new File("D://Workspace_2//Selenium_Course_Content//bin//Resources//OR1.xlsx");
		FileInputStream fis1 = new FileInputStream(myFile1);
		XSSFWorkbook myWorkBook1 = new XSSFWorkbook (fis1);
		XSSFSheet mySheet1 = myWorkBook.getSheetAt(2);
		Iterator<Row> rowIterator1 = mySheet1.iterator();
		
		while (rowIterator1.hasNext()) 
		{
			Row row1= rowIterator1.next();
			Iterator<Cell> cellIterator1 = row1.cellIterator();
					
			Cell cell1 =cellIterator1.next();
			switch (cell1.getCellType())
			{ 
				case Cell.CELL_TYPE_STRING: 
				sal.add(cell1.getStringCellValue().trim());
				break; 
				case Cell.CELL_TYPE_NUMERIC:
				String nvalue1=String.valueOf(cell1.getNumericCellValue());
				nvalue1=nvalue1.replaceAll("(?<=^\\d+)\\.0*$", "");
				sal.add(nvalue1);
				break; 
				case Cell.CELL_TYPE_BOOLEAN: 
				break; 
				default :
			}
		}
		System.out.println("Sal Data in excel:" +sal.toString());
				
				
///----------POP Window Handle--------------------------------
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
				        
									
        String textToSelect = "Developer";
		driver.findElement(RespositoryParser.getbjectLocator("element", "searchbox")).clear();
		WebElement autoOptions=driver.findElement(RespositoryParser.getbjectLocator("element", "searchbox"));
	    autoOptions.sendKeys("Software");

///----------Auto-Suggests Handle--------------------------------
	    List<WebElement> optionsToSelect = driver.findElements(RespositoryParser.getbjectLocator("element", "ST_optionsToSelect"));
	    for(WebElement option : optionsToSelect)
	    {
	        System.out.println(option);
	        if(option.getText().equals(textToSelect)) 
	        {
	            System.out.println("Trying to select: "+textToSelect);
	            option.click();
	            break;
	        }
	    }
				
	    driver.findElement(RespositoryParser.getbjectLocator("element", "locationPanl")).click();
	    
	    driver.findElement(RespositoryParser.getbjectLocator("element", "locationbox")).clear();
	    driver.findElement(RespositoryParser.getbjectLocator("element", "locationbox")).sendKeys("Delhi");
	    driver.findElement(RespositoryParser.getbjectLocator("element", "expdropdown")).click();
	    List<WebElement> exp_options  = driver.findElements(RespositoryParser.getbjectLocator("element", "explist"));
	    
	    
///----------Exp-DropDown Verify using list--------------------------------
	    
	    for(int l=0;l<exp_options.size();l++)
		{
			System.out.println("Experiece Dynamic Value is :" + exp_options.get(l).getText());
		}
		for(int e=0;e<exp.size();e++)
		{
			System.out.println("Experice Static value:" + exp.get(e));
		}

		
	    for(int j=0;j<exp.size();j++)
	  	{
	  		String e = exp_options.get(j).getText();
	  		String a = exp.get(j);
	  		if(a.equals(e))
	  		{
	  			System.out.println("EXP Value matched:" + a);
	  		}
	  		else
	  		{
	  			System.out.println("EXP Value is not matched:" + e);
	  			break;
	  		}
	  	}
	  		
///----------Salary -DropDown Verify using list--------------------------------
	    
	    driver.findElement(RespositoryParser.getbjectLocator("element", "salarydown")).click();
	  	List<WebElement> sal_options = driver.findElements(RespositoryParser.getbjectLocator("element", "salarylist"));
	  	
	  	for(int l=0;l<sal_options.size();l++)
		{
			System.out.println("Salary Dynamic Value is :" + sal_options.get(l).getText());
		}
	  	for(int e=0;e<sal.size();e++)
		{
			System.out.println("Salary Static value:" + sal.get(e));
		}
	   
	    for(int j=0;j<sal.size();j++)
	  	{
	  		String e = sal_options.get(j).getText();
	  		String a = sal.get(j);
	  		if(a.equals(e))
	  		{
	  			System.out.println("Salary Value matched:" + a);
	  		}
	  		else
	  		{
	  			System.out.println("Salary Value is not matched:" + e);
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
