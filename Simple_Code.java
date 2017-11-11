jiraid=QA-235
proj=QA
Automation Enocre Mobile Suites


package Training_Automation;

import static org.junit.Assert.fail;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
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

public class Flipkart_Automation 

{
	 private static WebDriver driver;
	 public static WebDriverWait wa;
	 //private static WebDriver driver1;
	  private static String baseUrl;
	  private static String baseUrl1;
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	 
	  @BeforeClass
	  public static void setUp() throws Exception 
	  {
		  
		  //System.setProperty("webdriver.gecko.driver","D:\\Selenium jar\\Selenium-3.4.0\\geckodriver.exe");
          
		  System.setProperty("webdriver.firefox.marionette","D:\\Selenium jar\\Selenium-3.4.0\\geckodriver.exe");

          // if above property is not working or not opening the application in browser then try below property

         //System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");
	  
		  driver = new FirefoxDriver();
	//    driver1 = new FirefoxDriver();
	   /*String ChromedriverPath="D:\\Automations_SW\\Browser exe\\";	   
	   System.setProperty("webdriver.chrome.driver", ChromedriverPath+"chromedriver.exe");
		driver = new ChromeDriver();*/
		
	   baseUrl = "https://www.google.co.in/";
	   baseUrl1 = "https://www.flipkart.com/";
	   wa=new WebDriverWait(driver, 30);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	/*  @Test
	  public void SeacrhFlipkart() throws Exception 
	  {
	    //Search Fliipkart word in Google
		driver.get(baseUrl);
	   // driver.findElement(By.linkText("Gmail")).click();
	    driver.findElement(By.id("lst-ib")).sendKeys("Flipkart");
	    driver.findElement(By.id("_fZl")).click();
	    //driver.findElement(By.id("")).clear();
	    driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
	   
	  
	  
	  }*/
	  
/*	  @Test
	  public void WalletSearch() throws Exception 
	  {
		 driver.get(baseUrl1);
	  //   driver1.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("wallet");
	  
	       driver.findElement(By.cssSelector("input[name=q]")).sendKeys("wallet");
		    
		 driver.findElement(By.cssSelector("button.vh79eN[type=submit]")).click();
			   
	   }*/	  @Test
	  public void SortSearch() throws Exception 
	  {
		 driver.get(baseUrl1);
	     driver.findElement(By.cssSelector("input[name=q]")).sendKeys("wallet");
		 driver.findElement(By.cssSelector("button.vh79eN[type=submit]")).click();
		 Thread.sleep(3000);
		 wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//li[text()='Relevance']")));
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(".//li[text()='Popularity']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(".//li[text()='Price -- Low to High']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(".//li[text()='Price -- High to Low']")).click();
		 Thread.sleep(3000);
		 wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//li[text()='Newest First']")));
		 driver.findElement(By.xpath(".//li[text()='Newest First']")).click();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//section/div[2]/div[2]/span/span[3]"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		WebElement element3 = driver.findElement(By.xpath("//div[@title='Woodland']"));
		actions.moveToElement(element3).click().perform();
		Thread.sleep(2000);
		
		WebElement element4 = driver.findElement(By.xpath("//span[text()='Apply Filters']"));
		
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Apply Filters']")));
		
		actions.moveToElement(element4).click().perform();
		
		//driver.findElement(By.xpath("//span[text()='Apply Filters']")).click();
		 
	   }
	/*  @AfterClass
	  public  static void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }*/
	/*  @Test
	  public void TestSearch() throws Exception 
	  {
	    driver.get(baseUrl);
	    driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Selenium");
	    driver.findElement(By.xpath(".//*[@value='Search']")).click();
	  }

*/
	  @AfterClass
	  public static void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

}