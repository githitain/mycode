package Other_Classes;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sierra 
{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://noiqavsierra650nt-app.iii.com:63100/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSierraScripts() throws Exception {
    driver.get(baseUrl + "/sierra/admin/SignOnPage.html;jsessionid=4B23FED3C3C1AE88E1F23C6A1716D256");
    driver.findElement(By.name("j_username")).clear();
    driver.findElement(By.name("j_username")).sendKeys("iiii");
    driver.findElement(By.name("j_username")).clear();
    driver.findElement(By.name("j_username")).sendKeys("iii");
    driver.findElement(By.name("j_password")).clear();
    driver.findElement(By.name("j_password")).sendKeys("30848noi");
    driver.findElement(By.cssSelector("input.button")).click();
    driver.findElement(By.id("DirectLink_3_0")).click();
    driver.findElement(By.id("createUserLink")).click();
    driver.findElement(By.id("userNameInput")).clear();
    driver.findElement(By.id("userNameInput")).sendKeys("epicu1");
    driver.findElement(By.id("fullNameField")).clear();
    driver.findElement(By.id("fullNameField")).sendKeys("epicu1");
    driver.findElement(By.id("passwordInput")).clear();
    driver.findElement(By.id("passwordInput")).sendKeys("epicu1");
    driver.findElement(By.id("confirmPasswordInput")).clear();
    driver.findElement(By.id("confirmPasswordInput")).sendKeys("epicu1");
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
