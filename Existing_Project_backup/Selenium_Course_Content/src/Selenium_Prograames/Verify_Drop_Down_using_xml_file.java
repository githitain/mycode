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
import Global_Common_Function.Comman_Function;
import Parametation_Propetiese_File.Properties_File_reading;
import Parametration_XML.XML_file_Reading;

public class Verify_Drop_Down_using_xml_file 
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

		Comman_Function.AddpopWindowHanlded(driver);
		String textToSelect = XML_file_Reading.getXMLTagValue("dc", "textToSelect"); 
		System.out.println(textToSelect);
        driver.findElement(RespositoryParser.getbjectLocator("element", "searchbox")).clear();
		WebElement autoOptions=driver.findElement(RespositoryParser.getbjectLocator("element", "searchbox"));
	    autoOptions.sendKeys(XML_file_Reading.getXMLTagValue("dc", "Skills"));

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
	    driver.findElement(RespositoryParser.getbjectLocator("element", "locationbox")).sendKeys(XML_file_Reading.getXMLTagValue("dc", "Location"));
	    driver.findElement(RespositoryParser.getbjectLocator("element", "expdropdown")).click();
	    List<WebElement> exp_options  = driver.findElements(RespositoryParser.getbjectLocator("element", "explist"));
	    
	    
	    List<String> exp=Comman_Function.ListOneRowExcel(Properties_File_reading.getOther("A1"), "exp_dropdown");
	    List<String> sal=Comman_Function.ListOneRowExcel(Properties_File_reading.getOther("A1"), "Sal_dropdown");
	    
	    
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
