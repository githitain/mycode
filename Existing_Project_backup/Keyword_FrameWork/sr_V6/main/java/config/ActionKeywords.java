package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static executionEngine.DriverScript.OR;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxDriver;

import Object_Repository.RespositoryParser;

public class ActionKeywords 
{
	 
	public static WebDriver driver;
	
	public static void openBrowser(String object,String object1,String object2)
	{		
		driver=new FirefoxDriver();
	}

	public static void navigate(String object,String object1,String object2)
	{	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
	}

	public static void input_Searchterm(String object,String object1,String object2)
	{
		
		driver.findElement(RespositoryParser.getbjectLocator(object,object1)).sendKeys(object2);
		//driver.findElement(By.id(OR.getProperty(object))).sendKeys(object2);
	}
	
	public static void click(String object, String object1,String object2)
	{
		//driver.findElement(By.id(OR.getProperty(object))).click();
		driver.findElement(RespositoryParser.getbjectLocator(object,object1));
	}
	
	public static void closeBrowser(String object,String object1,String object2)
	{
		driver.quit();
		System.out.println("Browser Closed");
	} 

}