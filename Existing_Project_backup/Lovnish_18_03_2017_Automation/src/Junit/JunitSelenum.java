package Junit;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JunitSelenum 
{
  private static WebDriver driver;
  private static String baseUrl;
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass
  public static void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.co.in/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void TestGmail() throws Exception 
  {
    driver.get(baseUrl);
    driver.findElement(By.linkText("Gmail")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Create account')]")).click();
    ///driver.findElement(By.linkText("Create account")).click();
    //driver.findElement(By.id("")).clear();
    driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("test");
    //driver.findElement(By.id("LastName")).clear();
    driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("selenum");
  
  }
  
  @Test
  public void TestSignin() throws Exception 
  {
    driver.get(baseUrl);
    driver.findElement(By.linkText("Sign in")).click();
  }
  
  @Test
  public void TestSearch() throws Exception 
  {
    driver.get(baseUrl);
    driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Selenium");
    driver.findElement(By.xpath(".//*[@value='Search']")).click();
  }


  @AfterClass
  public static void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
