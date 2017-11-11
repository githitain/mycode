package Tangerine;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Tangerine_01 
{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.tangerine.ca/";
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  }

  @Test
  public void testSpending() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.xpath("(//a[contains(text(),'Sign me up')])[2]")).click();
    //driver.findElement(By.xpath("//div[@class='sign-up-tabs']//a[contains(text(),'Saving')]")).click();
    Thread.sleep(20000);
    driver.findElement(By.xpath("(.//*[@id='spending']//a[contains(text(),'Enroll now')])[1]")).click();
    //driver.findElement(By.xpath("(//a[contains(text(),'Enroll now')])[1]")).click();
   	driver.findElement(By.xpath("(//a[contains(text(),'No, sign me up')])[1]")).click();
    
    Thread.sleep(20000);


//About you

    driver.findElement(By.xpath(".//*[@id='transaction-Title']/a")).click();
    driver.findElement(By.xpath(".//*[@id='transaction-Title']//li[4]/a")).click();
    driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Autmtion First Name");
    driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("Autmtion Last Nmae");
    //driver.findElement(By.xpath(".//*[@id='SIN']")).sendKeys("Autmtion 1523");
    driver.findElement(By.xpath(".//*[@id='DateOfBirth']")).click();

    Select listbox= new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")));
    listbox.selectByIndex(3);
    //listbox.s
    
    Select listbox1= new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")));
    listbox1.selectByIndex(3);
    
    driver.findElement(By.xpath("//a[contains(text(),'12')]")).click();
    
 ////Contacting you   
    driver.findElement(By.xpath(".//*[@id='HomePhoneNumber']")).sendKeys("89962 1245");
    driver.findElement(By.xpath(".//*[@id='EmailAddress']")).sendKeys("hitain007@gm.com");
    driver.findElement(By.xpath(".//*[@id='ConfirmationEmailAddress']")).sendKeys("hitain007@gm.com");
    
 ////Your address   
    driver.findElement(By.xpath(".//*[@id='PostalCode']")).sendKeys("89962 1245");
    driver.findElement(By.xpath(".//*[@id='StreetNumber']")).sendKeys("delhi 7857");
    driver.findElement(By.xpath(".//*[@id='Address']")).sendKeys("canda");
    driver.findElement(By.xpath(".//*[@id='Suite']")).sendKeys("ABX express");
    driver.findElement(By.xpath(".//*[@id='City']")).sendKeys("Toranto");
    driver.findElement(By.xpath(".//*[@id='transaction-Province']/a")).click();
    driver.findElement(By.xpath(".//*[@id='transaction-Province']/ul/li[3]/a")).click();
  
/////Create a PIN for online and phone banking    
    driver.findElement(By.xpath(".//*[@id='Pin']")).sendKeys("1245");
    driver.findElement(By.xpath(".//*[@id='PinConfirmation']")).sendKeys("1245");
   
////Referred by a friend?   
    driver.findElement(By.xpath(".//*[@id='PromotionCode']")).sendKeys("ABX express");
    
///Next    
    driver.findElement(By.xpath(".//*[@id='SAVE ANY CHANGES AND CONTINUE TO NEXT PAGE']")).click();
    
    Thread.sleep(20000);
 
    
  }
  
  @Test
  public void testSaving() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.xpath("(//a[contains(text(),'Sign me up')])[2]")).click();
    Thread.sleep(20000);
    driver.findElement(By.xpath("//div[@class='container']//ul/li[2]/a[contains(text(),'Saving')]")).click();
    Thread.sleep(20000);
    driver.findElement(By.xpath("(.//*[@id='saving']//a[contains(text(),'Enroll now')])[1]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'No, sign me up')])[1]")).click();
    
    Thread.sleep(20000);


//About you

    driver.findElement(By.xpath(".//*[@id='transaction-Title']/a")).click();
    driver.findElement(By.xpath(".//*[@id='transaction-Title']//li[4]/a")).click();
    driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Autmtion First Name");
    driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("Autmtion Last Nmae");
    //driver.findElement(By.xpath(".//*[@id='SIN']")).sendKeys("Autmtion 1523");
    driver.findElement(By.xpath(".//*[@id='DateOfBirth']")).click();

    Select listbox= new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")));
    listbox.selectByIndex(3);
    
    Select listbox1= new Select(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")));
    listbox1.selectByIndex(3);
    
    driver.findElement(By.xpath("//a[contains(text(),'12')]")).click();
    
 ////Contacting you   
    driver.findElement(By.xpath(".//*[@id='HomePhoneNumber']")).sendKeys("89962 1245");
    driver.findElement(By.xpath(".//*[@id='EmailAddress']")).sendKeys("hitain007@gm.com");
    driver.findElement(By.xpath(".//*[@id='ConfirmationEmailAddress']")).sendKeys("hitain007@gm.com");
    
 ////Your address   
    driver.findElement(By.xpath(".//*[@id='PostalCode']")).sendKeys("89962 1245");
    driver.findElement(By.xpath(".//*[@id='StreetNumber']")).sendKeys("delhi 7857");
    driver.findElement(By.xpath(".//*[@id='Address']")).sendKeys("canda");
    driver.findElement(By.xpath(".//*[@id='Suite']")).sendKeys("ABX express");
    driver.findElement(By.xpath(".//*[@id='City']")).sendKeys("Toranto");
    driver.findElement(By.xpath(".//*[@id='transaction-Province']/a")).click();
    driver.findElement(By.xpath(".//*[@id='transaction-Province']/ul/li[3]/a")).click();
  
/////Create a PIN for online and phone banking    
    driver.findElement(By.xpath(".//*[@id='Pin']")).sendKeys("1245");
    driver.findElement(By.xpath(".//*[@id='PinConfirmation']")).sendKeys("1245");
   
////Referred by a friend?   
    driver.findElement(By.xpath(".//*[@id='PromotionCode']")).sendKeys("ABX express");
    
///Next    
    driver.findElement(By.xpath(".//*[@id='SAVE ANY CHANGES AND CONTINUE TO NEXT PAGE']")).click();
    
    Thread.sleep(20000);
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
