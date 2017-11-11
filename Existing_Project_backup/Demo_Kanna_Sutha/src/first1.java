

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class first1 
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
  public void testFirst() throws Exception {
    driver.get(baseUrl + "/?gws_rd=ssl");
    driver.findElement(By.xpath("(//a[contains(text(),'Sign me up')])[2]")).click();
    //driver.findElement(By.xpath("//div[@class='sign-up-tabs']//a[contains(text(),'Saving')]")).click();

    driver.findElement(By.xpath("(//a[contains(text(),'Enroll now')])[1]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'No, sign me up')])[1]")).click();
    
    driver.findElement(By.xpath(".//*[@id='transaction-Title']/a")).click();
    
    Select listbox= new Select(driver.findElement(By.xpath(".//*[@id='transaction-Title']/ul")));
    
    
    /*
    driver.findElement(By.xpath("(//a[contains(text(),'No, sign me up')])[1]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'No, sign me up')])[1]")).click();
    */ 
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
