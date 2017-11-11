package nov_05_2016;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Commands 
{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
   
	  //1- Commond to create new browser instance of firbox
	driver = new FirefoxDriver();
	
	//2- Commad to create new brser instanc of chrome
	
	System.setProperty("webdriver.chrome.driver", "C://Ashu Folder//selenium tools//Browser exe//chromedriver.exe");
	//driver = new ChromeDriver();
	
	//3- Commad to create new brser instanc of IE
	
		System.setProperty("webdriver.ie.driver", "C://Ashu Folder//selenium tools//Browser exe//IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		
	
    baseUrl = "https://www.google.co.in/";
	//4- Commad to manage implicitwait timeout 
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testFirst() throws Exception {
	//5- Commad to get a URL 
    driver.get(baseUrl);
	//6- Commad to click on elemny 
    driver.findElement(By.linkText("Gmail")).click();
    //7- Commad to Clear the text of textbox 
    /*driver.findElement(By.id("Email")).clear();
    //8- Commad to send inputs to a text box 
    driver.findElement(By.id("Email")).sendKeys("hitain");
    driver.findElement(By.id("next")).click();
    
  //9- Commad to get the page title 
    String paget=driver.getTitle();
    System.out.println(paget);
    */
    
    //9- Commad to open aonther url for after baseurl 
    driver.navigate().to("https://www.naukri.com/advanced-search");
    driver.findElement(By.xpath(".//*[@id='dd_adv_workExp_year']/div[1]/span")).click();
    driver.findElement(By.xpath(".//*[@id='dd_cja_expyr1']")).click();
    Thread.sleep(50000);
    
    /*Select listbox= new Select(driver.findElement(By.xpath(".//div[@class='dd_adv_workExp_year']//div[@class='matchParent content']/ul//li")));
    listbox.s("3");
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
