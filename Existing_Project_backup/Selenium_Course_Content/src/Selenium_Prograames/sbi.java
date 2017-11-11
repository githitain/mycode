package Selenium_Prograames;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Global_Common_Function.Comman_Function;
import Parametration_XML.XML_file_Reading;

public class sbi 
{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.onlinesbi.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSbi() throws Exception {
    driver.get(baseUrl + "/");
    
    String s= "SBI’s internet banking portal provides ";
    String s1="PERSONAL";
    String s2="PERSONAL111";
  
    
   new Select(driver.findElement(By.id("target"))).selectByVisibleText("Vyapaar");
    driver.findElement(By.cssSelector("a.corp_login")).click();
    driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("abc");
    driver.findElement(By.id("label2")).clear();
    driver.findElement(By.id("label2")).sendKeys("abcd1234");
    driver.findElement(By.id("Button2")).click();

//    String getPage=driver.getPageSource();
//  	Assert.assertTrue(getPage.contains(s));
//  	
//  	
//  	Assert.assertTrue(getPage.contains(s1));
//  	//Assert.assertTrue(getPage.contains(s2));
  	
  	//Assert.assertEquals("Gooogle", driver.getTitle(), "Strings are not matching");
  	
  	//Assert.assertTrue(verifyTextPresent(s), "User failed to login");
  	
  	//assertTrue(getPage.contains(s1));
  	
  	Comman_Function.verifyText(XML_file_Reading.getXMLTagValue("X_SBI", "VTxt1"),driver);

      
  }
  
  

  @AfterClass(alwaysRun = true)
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
