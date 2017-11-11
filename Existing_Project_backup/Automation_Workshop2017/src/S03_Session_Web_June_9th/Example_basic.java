package S03_Session_Web_June_9th;
import static org.junit.Assert.fail;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_basic 

{
	 private static WebDriver driver;
	 public static WebDriverWait wa;
	
	  private static String baseUrl;
	 private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	 
	  @BeforeClass
	  public static void setUp() throws Exception 
	  {
		  
		 
		  System.setProperty("webdriver.firefox.marionette","D:\\Selenium jar\\Selenium-3.4.0\\geckodriver.exe");
           driver = new FirefoxDriver();
           baseUrl = "https://www.flipkart.com/";
           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	
	  public void SortSearch() throws Exception 
	  {
		 driver.get(baseUrl);
	     driver.findElement(By.cssSelector("input[name=q]")).sendKeys("wallet");
		 driver.findElement(By.cssSelector("button.vh79eN[type=submit]")).click();
		 Thread.sleep(3000);
		 Assert.assertEquals("", driver.getTitle());
		 
	   }
	
	  @AfterClass
	  public static void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

}