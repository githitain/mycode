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

public class First_Junit {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception 
  
  {
	  
	System.setProperty("webdriver.firefox.marionette","D:\\Automation_Software\\Selenium Jars\\geckodriver.exe");  
    driver = new FirefoxDriver();
    baseUrl = "http://www.msn.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
  }

  @Test
  public void testFist() throws Exception 
  {
    driver.get(baseUrl + "/en-in/");
    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys("selenium");
    driver.findElement(By.id("sb_form_go")).click();
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
