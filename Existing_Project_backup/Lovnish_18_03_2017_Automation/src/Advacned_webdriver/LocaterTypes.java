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

public class LocaterTypes 
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
  public void TestID() throws Exception 
  {
	  System.out.println("Start finding elements be ID");
	  	 driver.get(baseUrl);
	    driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
	    driver.findElement(By.id("_fZl")).click();
	    Thread.sleep(3000);
	    
	    System.out.println("Found elements be ID");
  }
  
  @Test
  public void TestName() throws Exception 
  {
	System.out.println("Start finding elements be Name");  
    driver.get(baseUrl);
    driver.findElement(By.name("q")).sendKeys("Selenium");
    driver.findElement(By.name("btnG")).click();
    Thread.sleep(3000);
    
    System.out.println("Found elements be Name");
  }
  
  @Test
  public void TestLinkText() throws Exception 
  {
	System.out.println("Start finding elements be Linktest");  
    driver.get(baseUrl);
    driver.findElement(By.linkText("Gmail")).click();
    driver.findElement(By.linkText("Find my account")).click();
    Thread.sleep(3000);
    
    System.out.println("Found elements be TestLinkText");
  }
  
  @Test
  public void TestPartialLinkText() throws Exception 
  {
	  System.out.println("Start finding elements be Partial Linnk Test");
	    driver.get(baseUrl);
	    driver.findElement(By.partialLinkText("mail")).click();
	    driver.findElement(By.partialLinkText("Find my")).click();
	    Thread.sleep(3000);
	    
	    System.out.println("Found elements be TestPartialLinkText");
  }
  
  
  @Test
  public void TestTagName() throws Exception 
  {
	  System.out.println("Start finding elements be TagName");
    driver.get(baseUrl);
    List<WebElement> ls = driver.findElements(By.tagName("a"));
    System.out.println(ls.size());
    for (int i=1;i<ls.size();i++)
    {
    	System.out.println(ls.get(i).getText());
    }
    Thread.sleep(3000);
    
    System.out.println("Found elements be TestTagName");
  }

  @Test
  public void TestClassName() throws Exception 
  {
	  System.out.println("Start finding elements be TestClassName");
    driver.get(baseUrl);
    driver.findElement(By.className("gsfi lst-d-f")).sendKeys("Selenium");
    driver.findElement(By.className("sbico-c")).click();
    Thread.sleep(3000);
    System.out.println("Found elements be TestClassName");
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
