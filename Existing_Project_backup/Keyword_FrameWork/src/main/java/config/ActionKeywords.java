package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static executionEngine.DriverScript.OR;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxDriver;

import executionEngine.DriverScript;
import utility.Log;
import Object_Repository.RespositoryParser;

public class ActionKeywords 
{
	 
	public static WebDriver driver;
	
	public static void openBrowser(String object,String object1,String object2)
	{		
		try
		{
			Log.info("Opening Browser");
			driver=new FirefoxDriver();
		}
		catch(Exception e)
		{
			//This is to print the logs - Method Name & Error description/stack
			Log.info("Not able to open Browser --- " + e.getMessage());
			//Set the value of result variable to false
			DriverScript.bResult = false;
		} 
	}

	public static void navigate(String object,String object1,String object2)
	{	
		try
		{
		
			Log.info("Navigating to URL");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(Constants.URL);
		
		}
		catch (Exception e)
		{
			Log.info("Not able to Navigating to URL" + e.getMessage());
			DriverScript.bResult = false;
		}
	}

	public static void input_Searchterm(String object,String object1,String object2)
	{
		try
		{
			Log.info("Entering the text in UserName" + object2);
			driver.findElement(RespositoryParser.getbjectLocator(object,object1)).sendKeys(object2);
		}
		catch(Exception e)
		{
			Log.info("Not able to Entering the text in UserName" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	
	public static void click(String object, String object1,String object2)
	{
		try
		{
			Log.info("Clicking on Webelement "+ object);
			driver.findElement(RespositoryParser.getbjectLocator(object,object1)).click();
		}
		catch(Exception e)
		{
			Log.info("not able to Clicking on Webelement "+ e.getMessage());
			DriverScript.bResult = false;
		}
	}
	
	public static void closeBrowser(String object, String object1,String object2)
	{	
		try
		{
			Log.info("Closing the browser");
			driver.quit();
			System.out.println("Browser Closed");
		}
		catch(Exception e)
		{
			Log.info("not able to Closing the browser"+ e.getMessage());
			DriverScript.bResult = false;
		}
	} 

}