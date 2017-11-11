/*
1-Alert Handling
2-Different wait in Webdriver
3-IE Developer tools
4-Google Chrome Developer tools
5-List box automation
6-Capture screenshots
7-Get Page source and find the text.
*/

package commands;

import java.util.regex.Pattern;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Nov_20_2016 
{
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception 
  {
    driver = new FirefoxDriver();
    baseUrl = "https://www.amazon.com/";
    
/*ImplicitlyWait Command -1----------------------------------------
    This means that we can tell Selenium that we would like 
    it to wait for a certain amount of time before throwing 
    an exception that it cannot find the element on the page. 
    We should note that implicit waits will be in place for 
    the entire time the browser is open. This means that any 
    search for elements on the page could take the time the implicit wait is set for.
    */
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
/*PageLoadTimeout Command-2----------------------------------------
    Sets the amount of time to wait for a page load to complete before throwing an error.*/
    
    
    driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
  }

  @Test
  public void testCode() throws Exception 
  {
	 // driver.get(baseUrl + "/");
//    driver.findElement(By.id("twotabsearchtextbox")).clear();
//    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wallet for men");
//    driver.findElement(By.cssSelector("input.nav-input")).click();
//    
//    WebElement sort= driver.findElement(By.xpath(".//*[@id='searchSortForm']//select[@name='sort']"));
//    
//    sort.click();	    
//    Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='searchSortForm']//select[1]")));
//    dropdown.selectByValue("price-asc-rank");
//    
/////*ExpectedConditions Command-3----------------------------------------
//    Models a condition that might reasonably be expected to eventually evaluate to something 
//    that is neither null nor false.*/
//    
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//
//    WebElement sort1= driver.findElement(By.xpath(".//*[@id='searchSortForm']//select[@name='sort']"));
//    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='searchSortForm']//select[@name='sort']")));
//    //driver.findElement(By.linkText(linkText)).click();
//    
//    sort1.click();
//    Select dropdown1 = new Select(driver.findElement(By.xpath(".//*[@id='searchSortForm']//select[1]")));
//    dropdown1.selectByValue("relevancerank");
//    
//    WebElement sort2= driver.findElement(By.xpath(".//*[@id='searchSortForm']//select[@name='sort']"));
//    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='searchSortForm']//select[@name='sort']")));
//    
//    sort2.click();
//    Select dropdown2 = new Select(driver.findElement(By.xpath(".//*[@id='searchSortForm']//select[1]")));
//    dropdown2.selectByValue("price-desc-rank");
//    

///*Sleep Command-4----------------------------------------
//	This is rarely used, as it always force the browser to wait
//	for a specific time. Thread.Sleep is never a good idea and 
//	that’s why Selenium provides wait primitives. If you use them 
//	you can specify much higher timeout value which makes tests more 
//	reliable without slowing them down as the condition can be evaluated 
//	as often as it’s required.*/
//    
//    Thread.sleep(1000);
//   
//    driver.navigate().to("https://www.naukri.com/");
//    
////pop window handle Command-5----------------------------------------
//    String parent = driver.getWindowHandle();
//	Set<String> pops=driver.getWindowHandles();
//	{
//		
//		System.out.println(parent);
//		Iterator<String> it =pops.iterator();
//		while (it.hasNext()) 
//		{
//			String popupHandle=it.next().toString();
//			//final String w1 = popupHandle;
//			if(!popupHandle.contains(parent))
//			{
//				System.out.println(popupHandle);
//				driver.switchTo().window(popupHandle);
//				System.out.println("Popu Up Title: "+ driver.switchTo().window(popupHandle).getTitle());
//				driver.close();
//			}
//		}
//			driver.switchTo().window(parent);
//	}
//    
// Alert Message handling-6----------------------------------------
//	
	/*accept() To accept the alert
	dismiss() To dismiss the alert
	getText() To get the text of the alert
	sendKeys() To write some text to the alert
	*/
	
//    driver.navigate().to("http://demo.guru99.com/V4/");
//    driver.findElement(By.name("uid")).sendKeys("mngr54743");					
//    driver.findElement(By.name("password")).sendKeys("tEqarej");					
//    driver.findElement(By.name("btnLogin")).submit();			
//    driver.findElement(By.linkText("Delete Customer")).click();			
//    driver.findElement(By.name("cusid")).sendKeys("53920");
//    
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//
//   // WebElement sort1= driver.findElement(By.xpath(".//*[@id='searchSortForm']//select[@name='sort']"));
//    wait.until(ExpectedConditions.presenceOfElementLocated(By.name("AccSubmit")));
//    
//    
//    driver.findElement(By.name("AccSubmit")).click();			
//    
//    Thread.sleep(1000);
//
//    
//        // Switching to Alert        
//    Alert alert=driver.switchTo().alert();		
//    		
//    // Capturing/get alert message.    
//    String alertMessage=driver.switchTo().alert().getText();		
//    
//    Thread.sleep(1000);
//
//    // Displaying alert message		
//    System.out.println(alertMessage);			
//    
//    Thread.sleep(1000);
//
//    
//    // Accepting alert		
//    alert.accept();		
//
//    Thread.sleep(1000);
//    
//    String alertMessage1=driver.switchTo().alert().getText();		
//    System.out.println(alertMessage1);			
//
//    //dismiss alert		
//    alert.dismiss();	
//    
//    //Send keys in alert		
//   
//  
    /*
  	Alert promptAlert  = driver.switchTo().alert();
	String alertText = promptAlert.getText();
	System.out.println("Alert text is " + alertText);
	//Send some text to the alert
	promptAlert.sendKeys("Accepting the alert");
	Thread.sleep(4000); //This sleep is not necessary, just for demonstration
	promptAlert .accept(); 
    
    */
    
//Page Source Command-7 ------------------------
	  
	  //Thread.sleep(2000);
    driver.get("http://du.ac.in/");
//    //driver.navigate().to("http://du.ac.in/");
//    
//	  Thread.sleep(2000);
//
//    
////    if(driver.getPageSource().contains("Welcome to the University of Delhi"))
////    {
////       System.out.println(" Text is persent");
////
////    }
////   else
////   {
////	    System.out.println(" Text is not persent");
////
////   }
//
////Take screen shot Command-8 -----------------------------
//    
//    if(driver.getPageSource().contains("Google is import"))
//    {
//       System.out.println(" Text is persent");
//
//    }
//   else
//   {
//	    System.out.println(" Text is not persent");
//	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    //The below method will save the screen shot in d drive with name "screenshot.png"
//	    FileUtils.copyFile(scrFile, new File("C:\\Ashu Folder\\screenshot.png"));
//   }

//List box-8 -----------------------------
    driver.navigate().to("file:///C:/Ashu%20Folder/Actions_Examples/Lisrbox/list-box.html");
    Thread.sleep(5000);
   

    WebElement val=driver.findElement(By.xpath(".//*[@id='selenium_commands']"));
    
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", val);

    
    Select s=new Select(val);
    List<WebElement> allvals=s.getOptions();
   
    for(int i=0;i<allvals.size();i++)
    {
     Thread.sleep(1000);
     System.out.println("CheckBox:"+ allvals.get(i).getAttribute("value"));
     s.selectByIndex(i); //select one by one
    }
    
    s.deselectAll();

    
    s.selectByIndex(0);
    s.selectByIndex(1);
//
//
//    
    
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
