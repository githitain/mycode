package stepDefination;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Object_Repo.RespositoryParser;
//import ExecutionDriver.Runner;

public class CommanFuntion 
{
	
	static WebDriver driver;
	
	
	public static void main(String args[]) throws IOException
	{
		System.out.println(RespositoryParser.getbjectLocator("DC", "go_btn"));
		
		
	}
	
	
	public static WebDriver init_open(String s)
	{	
		System.out.println("Launch Browser");
		System.setProperty("webdriver.firefox.marionette","D:\\Automation_Software\\Selenium Jars\\geckodriver.exe");  
		driver = new FirefoxDriver();
		driver.get(s);
		System.out.println("Done-Launched Application");
		return driver;
	}
	

	public static WebDriver sendKeysInput(String sheetName, String keyName, String testData)
	{	
		System.out.println("Perform Sendkeys");
		//driver.findElement(RespositoryParser.getbjectLocator("DC", "username")).sendKeys(s);
		driver.findElement(RespositoryParser.getbjectLocator(sheetName, keyName )).sendKeys(testData);
		System.out.println("Done-Performed Sendkeys");
		return driver;
	}
	

	public static WebDriver clickLink(String sheetName, String keyName)
	{	
		System.out.println("Perform clickLink");
		//driver.findElement(RespositoryParser.getbjectLocator("DC", "username")).sendKeys(s);
		driver.findElement(RespositoryParser.getbjectLocator(sheetName, keyName )).click();
		System.out.println("Done-Performed clickLink");
		return driver;
	}
	
	public static WebDriver verifyElement(String sheetName, String keyName)
	{	
		List<WebElement> we;
		
		
		System.out.println("Verify element");
		
		we=driver.findElements(RespositoryParser.getbjectLocator(sheetName, keyName));
		
		
		if(!we.isEmpty())
		{
			System.out.println("Element is Persent on the page");
		} 
		else
		{
			System.out.println("Element is not Persent on the page");
		}
		Assert.assertEquals(true, !we.isEmpty());
		
		System.out.println("Done-Verified element");
		return driver;
	}
	
	public static WebDriver waitThread(int time)
	{	
		try 
		{
			System.out.println("Wait till" +time);
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	
	
	
	public static WebDriver quit_Browser()
	{	
		driver.quit();
		return driver;
	}
}
