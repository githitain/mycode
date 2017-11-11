package Other_Classes;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Sierra_Admin  
{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception 
  {
	  /*System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Automations_SW\\Browser exe\\chromedriver.exe");
	  driver = new ChromeDriver();*/
	  
	  
   driver = new FirefoxDriver();
    baseUrl = "http://172.16.77.162/sierra/admin";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    
  }

  @Test
  public void testSierraScripts() throws Exception 
  {
    driver.get(baseUrl);
    driver.findElement(By.name("j_username")).clear();
    driver.findElement(By.name("j_username")).sendKeys("iii");
    driver.findElement(By.name("j_password")).clear();
    driver.findElement(By.name("j_password")).sendKeys("30848noi");
    String UN= "TP";
    for (int i=0; i>2; i++)
    
    { 	StringBuffer un1= new StringBuffer(UN).append(i);  
    			
    			
    	System.out.println("the results is " + un1);
  }
    driver.findElement(By.cssSelector("input.button")).click();
    driver.findElement(By.linkText("Authorizations and Authentication")).click();
    
    String Uname= "TP";
    for (int i=0; i>2; i++)
    {
    	StringBuffer un= new StringBuffer(Uname).append(i);  
    			
    			
    	System.out.println(un);
    
    driver.findElement(By.xpath(".//*[contains(text(),'CREATE USER')]")).click();
    driver.findElement(By.xpath(".//*[@name='userNameInput']")).clear();
    driver.findElement(By.xpath(".//*[@name='userNameInput']")).sendKeys(un);
    driver.findElement(By.id("fullNameField")).clear();
    driver.findElement(By.id("fullNameField")).sendKeys(un);
    driver.findElement(By.id("passwordInput")).clear();
    driver.findElement(By.id("passwordInput")).sendKeys(un);
    driver.findElement(By.id("confirmPasswordInput")).clear();
    driver.findElement(By.id("confirmPasswordInput")).sendKeys(un);
    new Select(driver.findElement(By.id("languageChooser"))).selectByVisibleText("English");
    driver.findElement(By.id("Submit_1")).click();
    driver.findElement(By.id("link_edituser_tabEDIT_TAB_APPLICATIONS")).click();
    driver.findElement(By.cssSelector("span.addAll")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("Submit_1")).click();
    driver.findElement(By.id("link_edituser_tabEDIT_TAB_PERMISSIONS")).click();
    driver.findElement(By.cssSelector("span.addAll")).click();
    driver.findElement(By.id("Submit_1")).click();
    driver.findElement(By.id("link_edituser_tabEDIT_TAB_WORKFLOWS")).click();
    driver.findElement(By.id("Submit_1")).click();
    driver.findElement(By.id("linkUsers")).click();
    driver.findElement(By.id("createUserLink")).click();
    
    }
  }

  @AfterClass
  public void tearDown() throws Exception 
  {
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
