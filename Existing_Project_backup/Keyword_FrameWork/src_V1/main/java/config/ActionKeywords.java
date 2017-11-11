/**
 * 
 */
/**
 * @author hitendra.pawar
 *
 */

package config;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeywords 
{
	 
	public static WebDriver driver;
	
	public static void openBrowser()
	{		
		driver=new FirefoxDriver();
	}

	public static void navigate()
	{	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin");
	}

	public static void input_Searchterm()
	{
		driver.findElement(By.id("Email")).sendKeys("hitain007");
	}
	
	public static void click_next()
	{
		driver.findElement(By.id("next")).click();
	}
	
	public static void closeBrowser()
	{
		driver.quit();
	}

}