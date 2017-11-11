/**
 * 
 */
/**
 * @author hitendra.pawar
 *
 */
package Other_testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Excel_Parametraztion.RespositoryParser;
import ExecutionDriver.Runner;
import Global_Common_Function.Comman_Function;
import Parametation_Propetiese_File.Properties_File_reading;
import Parametration_XML.XML_file_Reading;

public class TC_Naukari_Homepage
{
	
	
	public static void Naukari_search() throws Exception
	{
		Comman_Function.AddpopWindowHanlded(Runner.driver);
		String textToSelect = XML_file_Reading.getXMLTagValue("dc", "textToSelect"); 
		System.out.println(textToSelect);
        Runner.driver.findElement(RespositoryParser.getbjectLocator("element", "searchbox")).clear();
		WebElement autoOptions=Runner.driver.findElement(RespositoryParser.getbjectLocator("element", "searchbox"));
	    autoOptions.sendKeys(XML_file_Reading.getXMLTagValue("dc", "Skills"));

///----------Auto-Suggests Handle--------------------------------
	    List<WebElement> optionsToSelect = Runner.driver.findElements(RespositoryParser.getbjectLocator("element", "ST_optionsToSelect"));
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
	    Runner.driver.findElement(RespositoryParser.getbjectLocator("element", "locationPanl")).click();
	    Runner.driver.findElement(RespositoryParser.getbjectLocator("element", "locationbox")).clear();
	    Runner.driver.findElement(RespositoryParser.getbjectLocator("element", "locationbox")).sendKeys(XML_file_Reading.getXMLTagValue("dc", "Location"));
	    Runner.driver.findElement(RespositoryParser.getbjectLocator("element", "expdropdown")).click();
	    List<WebElement> exp_options  = Runner.driver.findElements(RespositoryParser.getbjectLocator("element", "explist"));
	    
	    
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
	    
	    Runner.driver.findElement(RespositoryParser.getbjectLocator("element", "salarydown")).click();
	  	List<WebElement> sal_options = Runner.driver.findElements(RespositoryParser.getbjectLocator("element", "salarylist"));
	  	
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
}

