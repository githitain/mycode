package config;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static executionEngine.DriverScript.OR;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeywords 
{
	 
	public static WebDriver driver;
	
	public static void openBrowser(String object)
	{		
		driver=new FirefoxDriver();
	}

	public static void navigate(String object)
	{	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
	}

	public static void input_Searchterm(String object)
	{
		driver.findElement(By.id(OR.getProperty(object))).sendKeys(Constants.UserName);
	}
	
	public static void click(String object)
	{
		driver.findElement(By.id(OR.getProperty(object))).click();
	}
	
	public static void closeBrowser(String object)
	{
		driver.quit();
		System.out.println("Browser Closed");
	}

}