package Advacned_webdriver;
import java.util.regex.Pattern;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Locater_xpath
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
  public void Test_Basic_xpath() throws Exception 
  {
	  System.out.println("Start finding Test_Basic_xpath");
	  	 driver.get(baseUrl);
	    driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("Selenium");
	    driver.findElement(By.xpath("//button[@class='sbico-c']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Email or phone']")).sendKeys("Selenium");
	    driver.findElement(By.xpath("//input[@id='next']")).sendKeys("Selenium");
	    Thread.sleep(3000);
	    
	    System.out.println("Found elements be Test_Basic_xpath");
  }
  
  /*@Test
  public void Test_CSS_Tag_Class() throws Exception 
  {
	System.out.println("Start finding elements be Test_CSS_Tag_Class");  
    driver.get(baseUrl);
    driver.findElement(By.cssSelector("input#lst-ib")).sendKeys("Selenium");
    driver.findElement(By.cssSelector("button.sbico-c")).click();
    Thread.sleep(3000);
    
    System.out.println("Found elements be Test_CSS_Tag_Class");
  }
  
  @Test
  public void Test_CSS_Tag_Attribute() throws Exception 
  {
	System.out.println("Start finding elements be Test_CSS_Tag_Attribute");  
    driver.get(baseUrl);
    driver.findElement(By.cssSelector("a[class='gb_P']")).click();
    driver.findElement(By.cssSelector("a[class='need-help']")).click();
    Thread.sleep(3000);
    
    System.out.println("Found elements be Test_CSS_Tag_Attribute");
  }
  
  @Test
  public void Test_CSS_Tag_Class_Attribute() throws Exception 
  {
	  System.out.println("Start finding elements be Test_CSS_Tag_Class_Attribute");
	    driver.get(baseUrl);
	    driver.findElement(By.cssSelector("input#lst-ib[title='Search']")).sendKeys("Selenium");
	    driver.findElement(By.cssSelector("button.sbico-c[value='Search']")).click();
	    Thread.sleep(3000);
	    
	    System.out.println("Found elements be Test_CSS_Tag_Class_Attribute");
  }
  
  
  /*@Test
  public void Test_CSS_Tag_InnerText() throws Exception 
  {
	  System.out.println("Start finding elements be Test_CSS_Tag_InnerText");
	    driver.get(baseUrl);
	    driver.findElement(By.cssSelector("a:contains('Gmail')")).click();
	    driver.findElement(By.cssSelector("a:contains('Find my account')")).click();
	    Thread.sleep(3000);
	    
	    System.out.println("Found elements be Test_CSS_Tag_InnerText");
  }*/

  @AfterClass
  public static void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
