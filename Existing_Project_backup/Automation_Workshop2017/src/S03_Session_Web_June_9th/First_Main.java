package S03_Session_Web_June_9th;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class First_Main 
{

  public static void main(String []args) throws InterruptedException 
	{
	  WebDriver driver;
	  String baseUrl;
	  boolean acceptNextAlert = true;
	  StringBuffer verificationErrors = new StringBuffer();
	  
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium jar\\Selenium-3.4.0\\geckodriver.exe");  
		driver = new FirefoxDriver();
		baseUrl = "http://www.msn.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

  
	    driver.get(baseUrl + "/en-in/");
	    driver.findElement(By.id("q")).clear();
	    driver.findElement(By.id("q")).sendKeys("selenium");
	    driver.findElement(By.id("sb_form_go")).click();
	    
	    driver.quit();
   }

  
}
