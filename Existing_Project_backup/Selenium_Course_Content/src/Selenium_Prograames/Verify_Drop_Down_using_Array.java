package Selenium_Prograames;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Parametation_Propetiese_File.Properties_File_reading;

//import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

public class Verify_Drop_Down_using_Array 
{
	
	
	WebDriver driver;
	@Before
	 
	public void setUp() throws Exception
	{
	
	/*//driver=new FirefoxDriver();
	driver=Properties_File_reading.getBrowser("browser");
	driver.get("http://www.naukri.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//driver.manage().window().maximize();*/
	
	driver=Properties_File_reading.getBrowser("browser");
	driver.get(Properties_File_reading.getBrowserUrl("local"));
	driver.manage().timeouts().implicitlyWait(Properties_File_reading.getTime("time"),TimeUnit.SECONDS);

	}
	 
	@Test
	public void testWindowAlert() throws Exception
	{
		
		String[] exp = {"Select","0 Year","1","2","3","4","5","6","7","8","9","10"};
		String[] sal= {"Select","<1 Lac","1","2","3","4","5","6","7","8","9","10"};
		
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
		driver.findElement(By.name("qp")).clear();
		WebElement autoOptions= driver.findElement(By.name("qp"));
	    autoOptions.sendKeys("Software");

///----------Auto-Suggests Handle--------------------------------
	    List<WebElement> optionsToSelect = driver.findElements(By.xpath(".//li//div//strong"));
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
		
		driver.findElement(By.xpath(".//*[@id='location']/div[1]/div[2]")).click();
		driver.findElement(By.xpath(".//*[@id='location']/div[1]/div[2]/input")).clear();
		driver.findElement(By.xpath(".//*[@id='location']/div[1]/div[2]/input")).sendKeys("Delhi");
		driver.findElement(By.xpath(".//*[@placeholder='Experience']")).click();
		//driver.findElement(By.xpath(".//*[@id='exp_dd']/div[2]/div/div/div[1]/ul//li")).click();
		List<WebElement> exp_options = driver.findElements(By.xpath(".//*[@id='exp_dd']/div[2]/div/div/div[1]/ul//li"));
		
///----------Exp-DropDown Verify using list--------------------------------		
		for(int j=0;j<exp.length;j++)
		{
			String e = exp_options.get(j).getText();
			String a = exp[j];
			if(a.equals(e))
			{
				System.out.println("EXP Value matched:" + exp[j]);
			}
			else
			{
				System.out.println("EXP Value is not matched:" + exp_options.get(j).getText());
				break;
			}
		}
		
		driver.findElement(By.xpath(".//*[@placeholder='Salary']")).click();
		List<WebElement> sal_options = driver.findElements(By.xpath(".//*[@id='salary_dd']/div[2]/div/div/div[1]/ul//li"));
		
///----------Sal-DropDown Verify using list--------------------------------		 

		for(int j=0;j<sal.length;j++)
		{
			String e = sal_options.get(j).getText();
			String a = sal[j];
			if(a.equals(e))
			{
				System.out.println("Salary Value matched:" + sal[j]);
			}
			else
			{
				System.out.println("Salary Value is not matched:" + sal_options.get(j).getText());
				break;
			}
		 }
		//driver.findElement(By.id("qsbFormBtn")).click();
	
	}
	 
	@After
	public void tearDown()
	{
	driver.quit();
	
	}
	}





