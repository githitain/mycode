package commands;


import java.util.regex.Pattern;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class action_event 
{

	private WebDriver driver;
	private String baseUrl, baseUrl2,Url_Naukari,Url_Gmail,Url_ignou;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	

  @Before
  public void setUp() throws Exception 
  {
    driver = new FirefoxDriver();
    Url_Naukari = "https://www.naukri.com/advanced-search";
    Url_Gmail = "https://accounts.google.com/SignUp?continue=https%3A%2F%2Fwww.google.co.in%2F%3Fgfe_rd%3Dcr%26ei%3DiEYCWOH7GvDs8Aft74DwDg&hl=en";
    Url_ignou="http://www.ignou.ac.in/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }


  
  @Test
  public void actionsEvents() throws Exception {
    driver.get(Url_ignou);
/*  
//contextClick command-1
    WebElement R1 = driver.findElement(By.xpath("//div[@class='item active']//a[contains(.,'Results')]"));
    Actions b1 = new Actions(driver);
    b1.contextClick(R1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
    //.contextClick(R1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
    
//Get Windoes Hanldes command-2

    String winHandleBefore = driver.getWindowHandle();
    for (String winHandle : driver.getWindowHandles()) 
    {
      // Switch to child window
     driver.switchTo().window(winHandle);
    }
    //driver.close();
    driver.switchTo().window(winHandleBefore);
    
    Thread.sleep(5000);
    
//mouseoverEvent Command-3
    Actions actions = new Actions (driver);
    WebElement moveonmenu= driver.findElement(By.xpath("//div[@id='myNavbar']//a[contains(.,'Regional Network')]"));
    actions.moveToElement(moveonmenu);
    actions.perform();
    WebElement moveonmenu1= driver.findElement(By.xpath("//div[@id='myNavbar']//a[contains(text(),'Regional Centers')]"));
    actions.moveToElement(moveonmenu1);
    actions.click().build().perform();
    
    Thread.sleep(5000);


  
 //Drag and Drop Command-4   
    driver.navigate().to("http://jqueryui.com/droppable/");
    
    WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
	
    WebElement Sourcelocator = driver.findElement(By.xpath(".//*[@id='draggable']"));
	WebElement Destinationlocator = driver.findElement(By.xpath(".//*[@id='droppable']"));
	Actions action = new Actions(driver);
	action.dragAndDrop(Sourcelocator, Destinationlocator).build().perform();
	
	  Thread.sleep(5000);*/

	
//Double Click Command-5   
	
	driver.navigate().to("http://api.jquery.com/dblclick/");
	
	driver.switchTo().frame(0);
	WebElement element = driver.findElement(By.cssSelector("html>body>div"));
	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	
	 JavascriptExecutor J = (JavascriptExecutor) driver;
    J.executeScript("argumentsssssss[0].scrollIntoView();", element); //   this line has javascript error
   
	
	Thread.sleep(5000);	 
	//WebElement element = driver.findElement(By.cssSelector("html>body>div"));
	Actions action2 = new Actions(driver).doubleClick(element);
	action2.build().perform();
	Thread.sleep(5000);
	
	
//Scroll up and down command-6
	
/*	driver.navigate().to(Url_Naukari);
    Thread.sleep(5000);	 
	
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
	 //vertical
	    //jse.executeScript("window.scrollBy(0,500)", "");
	 //horizetilh   
	  //  jse.executeScript("window.scrollBy(-100,0)", "");

	   
		Thread.sleep(5000);	 
   
	   WebElement element2 = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/ul/li[14]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element2);
		
		Thread.sleep(5000);	 */
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
