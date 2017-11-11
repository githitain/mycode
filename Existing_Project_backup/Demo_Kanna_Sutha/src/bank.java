

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class bank 
{

private WebDriver driver;
  private String baseUrl, baseUrl2;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.tangerine.ca/en/index.html";
    baseUrl2 = "https://accounts.google.com/SignUp?continue=https%3A%2F%2Fwww.google.co.in%2F%3Fgfe_rd%3Dcr%26ei%3DiEYCWOH7GvDs8Aft74DwDg&hl=en";

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

 /* @Test
  public void testFirst() throws Exception {
    driver.get(baseUrl + "/?gws_rd=ssl");
    driver.findElement(By.xpath("html/body/div[1]/div/div[2]/section[4]/div/nav/ul/li[8]/a")).click();
    Thread.sleep(50000);
    driver.findElement(By.xpath("(//a[contains(text(),'Enroll now')])[1]")).click();
    
    driver.findElement(By.xpath(".//*[@id='modal-visitor-link']")).click();
    
  }*/
  @Test
  public void testGmailFirst() throws Exception {
    driver.get(baseUrl2);
    Thread.sleep(5000);
    driver.findElement(By.id("Passwd")).sendKeys("SeleniumBla9");
    driver.findElement(By.id("PasswdAgain")).sendKeys("SeleniumBla9");
    driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
   //driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[2]")).click();
   //.
    Thread.sleep(1500);
   
    driver.findElement(By.xpath(".//div[contains(text(),'August')]")).click();
   
    driver.findElement(By.xpath("    .//*[@id='Gender']/div")).click();
    
     Thread.sleep(1000);
    
     driver.findElement(By.xpath(".//div[contains(text(),'Female')]")).click();
    
    
    
      driver.findElement(By.id("birthday-placeholder")).sendKeys("15");
        driver.findElement(By.id("birthyear-placeholder")).sendKeys("1981");
        driver.findElement(By.xpath(".//*[@id='Gender']/div[1]/div[2]")).click();
        driver.findElement(By.xpath(".//*[@id=':f']/div")).click();
        driver.findElement(By.xpath(".//*[@id='phone-form-element']/table/tbody/tr/th/div/div[2]")).click();
        driver.findElement(By.xpath(".//*[@id=':7p']/div/div/span[1]")).click();
        driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("kannan_subbu@yahoo.com");
        driver.findElement(By.xpath(".//*[@id='CountryCode']/div[1]/div[2]")).click();
        driver.findElement(By.xpath(".//*[@id=':i']/div")).click();
   
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
