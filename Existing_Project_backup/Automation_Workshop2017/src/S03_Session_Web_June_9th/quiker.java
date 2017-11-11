package S03_Session_Web_June_9th;


import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class quiker {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception 
  {
	 
	  System.setProperty("webdriver.firefox.marionette","D:\\Selenium jar\\Selenium-3.4.0\\geckodriver.exe");  
    driver = new FirefoxDriver();
    baseUrl = "http://www.quickr.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testQuickrPostFreeAdds() throws Exception {
    driver.get(baseUrl + "/");
    driver.manage().window().maximize();
    driver.findElement(By.id("postAdBtn")).click();
  /*  WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Cars & Bikes')]"));*/
    
    WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Cars & Bikes')]"));
    Actions action = new Actions(driver);
    action.moveToElement(element).build().perform();
    driver.findElement(By.xpath("//div[(@class ='right-sub-cat-col')]/ul/li/a[contains(text(),'Cars')]")).click();
    driver.getPageSource().contains("Cars & Bikes / Cars");

    driver.findElement(By.id("Brand_name_newpap")).click();
   

    driver.findElement(By.xpath(".//*[@value='Maruti Suzuki']")).click();
    driver.findElement(By.id("Model_newpap")).click();
    driver.findElement(By.xpath(".//*[@value='Ritz']")).click();
    driver.findElement(By.id("Year_newpap")).click();
    driver.findElement(By.xpath(".//*[@value='2015']")).click();
    driver.findElement(By.name("Kms_Driven")).sendKeys("22000");
    driver.findElement(By.id("Fuel_Type_newpap")).click();
    driver.findElement(By.xpath(".//*[@value='Diesel']")).click();
    driver.findElement(By.name("citySelectBox2")).sendKeys("Noida");
    driver.findElement(By.xpath("//li[@id='green_dhtml_content55_Noida']//a[contains(text(),'Noida')]")).click();
    driver.findElement(By.name("singleSelLoc")).click();
    driver.findElement(By.xpath(".//*[@id='customSingleSelLoc']/span[1]")).click();
    driver.findElement(By.name("description1")).sendKeys("In 1970, a private limited company named Surya Ram Maruti technical services private limited (MTSPL) was launched on November 16, 1970. In June 1971, a company called Maruti limited was incorporated under the Companies Act. Maruti Limited went into liquidation in 1977.");
    driver.findElement(By.xpath(".//*[@value='Individual']")).click();
    driver.findElement(By.name("contactName")).sendKeys("Peter");
   
    System.out.println("ENTER EMAIL ID");
	  String emailid;
		Scanner s=new Scanner(System.in);
		emailid=s.next();
    driver.findElement(By.name("emailid")).sendKeys(emailid);
    
    System.out.println("ENTER MOBILE NUMBER");
	  String number;
		Scanner t=new Scanner(System.in);
		number=t.next();
		driver.findElement(By.name("mobile")).sendKeys(number);
    driver.findElement(By.xpath(".//*[@value='adprivacy']")).click();
    driver.findElement(By.xpath(".//*[@value='sendalerts']")).click();
    driver.findElement(By.id("freeidboxpayment")).click();
    driver.findElement(By.xpath(".//*[@id='postbtn_container']/button/span[contains(text(),'Post')]")).click();
 /*   driver.findElement(By.xpath("//a[@title='close']")).click(); */
    driver.findElement(By.xpath("//*[@id='post_without_photo']/a[contains(text(),'Post without Photos')]")).click();
    
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