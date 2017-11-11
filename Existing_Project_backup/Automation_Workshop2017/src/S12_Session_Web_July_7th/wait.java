package S12_Session_Web_July_7th;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;



public class wait {
	
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  //Wait<WebDriver> wait1;
  
  @Before
  public void setUp() throws Exception {
    //driver = new FirefoxDriver();
  
    
//Wait-1 TimeOut.Implicitly wait-----------------
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
////Wait-2 TimeOUT.pageLoadTimeout wait-----------------    
//    driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
//
////Wait-3 TimeOUT.setScriptTimeout wait-----------------    
//    driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
    
    System.setProperty("webdriver.firefox.marionette","D:\\Selenium jar\\Selenium-3.4.0\\geckodriver.exe");  
	System.setProperty("webdriver.chrome.driver", "D:\\Automation_Workshop_2017\\Selenium_exe\\chromedriver.exe");
    driver = new FirefoxDriver();
	//driver = new ChromeDriver();
    //baseUrl = "http://www.du.ac.in";
   baseUrl = "http://www.msn.com/";
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

  }

  @Test
    public void testMouseOver() throws Exception 
    {
	  
	    driver.get(baseUrl);
	    //driver.findElement(By.xpath("//ul[@id='menu']/li/a/span")).click();
	  
//Wait-4 Explicit wait-------Flaunt Wait Example
	 
	   final WebElement l1 = driver.findElement(By.xpath(".//*[@id='wrapper']/div[6]/div[2]/div/div[2]/div[1]/span[1]/a"));
	    
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    		.withTimeout(5, TimeUnit.SECONDS) //
	            .pollingEvery(100, TimeUnit.MILLISECONDS) //
	            .ignoring(NoSuchElementException.class);

	    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

	        public WebElement apply(WebDriver driver) 
	        {
	            return l1;
	        }
	    });

	    foo.click();
	    
  
	    
	    //Thread.sleep(2000);

//Wait-5 Explicit wait-------ExpectedConditions Wait Example  
	    
	    WebElement l2 = driver.findElement(By.xpath("//span[contains(text(),'Sign in455')]"));
	    WebDriverWait waitE = new WebDriverWait(driver, 30 );
	    waitE.until(ExpectedConditions.elementToBeClickable(l2));
	    //waitE.until(ExpectedConditions.elementToBeClickable(l2)); 
	    //wait.until(ExpectedConditions.elementToBeSelected(l2)); 
	   
	    
	    l2.click();
	    
	    Thread.sleep(3000);

//Wait-6---Thread.sleep(2000);
	    
   /* Actions actions = new Actions(driver);
    WebElement mainMenu = driver.findElement(By.xpath("//span[contains(text(), 'Amenities')]"));
    actions.moveToElement(mainMenu);

    WebElement subMenu = driver.findElement(By.xpath("//span[contains(text(), 'Computer Centre')]"));
    actions.moveToElement(subMenu);
    actions.click().build().perform();
    
    driver.findElement(By.xpath("//span[contains(text(), 'Home')]"));*/

	    
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
