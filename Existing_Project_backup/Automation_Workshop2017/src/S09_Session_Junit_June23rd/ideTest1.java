package S09_Session_Junit_June23rd;

import java.util.regex.Pattern;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ideTest1 {
  private static WebDriver driver;
  private static String baseUrl;
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass
  public static void setUp() throws Exception 
  {
	 System.setProperty("webdriver.firefox.marionette","D:\\Selenium jar\\Selenium-3.4.0\\geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.co.in/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @Test
  public void testRegistraton() throws Exception 
  {
    driver.get(baseUrl);
    /*driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
    driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
    driver.findElement(By.xpath(".//*[@id='gb_70']")).click();
    driver.findElement(By.linkText("Sign In")).click();*/
    //driver.findElement(By.id("gb_70")).click();
    //driver.findElement(By.name("btnK")).click();
    //driver.findElement(By.linkText("Terms")).click();
    //driver.findElement(By.partialLinkText("Priv")).click();
    //List ls = driver.findElements(By.tagName("div"));
    //System.out.println(ls.size());
    //driver.findElement(By.className("fbar")).click();
    driver.findElement(By.cssSelector("a#gb_70")).click();
    driver.findElement(By.cssSelector("input[type='email']")).click();
    
    
    
    Thread.sleep(6000);
  }

  /*@Test
  public void test1() throws Exception 
  {
    driver.get(baseUrl + "/?gfe_rd=cr&ei=EadMWfesA-jx8AfvuYS4BQ&gws_rd=ssl");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("selenium");
    driver.findElement(By.id("_fZl")).click();
  }*/
  
  @Test
  public void testTrest2() throws Exception 
  {
    //driver.get(baseUrl + "/?gfe_rd=cr&ei=SadMWcuMHOjx8AfvuYS4BQ&gws_rd=ssl");
    driver.findElement(By.xpath(".//*[@id='gb_70']")).click();
    //driver.findElement(By.linkText("Sign In")).click();
  }
  
  
  

  @AfterClass
  public static void tearDown() throws Exception 
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
