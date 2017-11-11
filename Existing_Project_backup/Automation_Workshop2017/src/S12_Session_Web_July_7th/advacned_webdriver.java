package S12_Session_Web_July_7th;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class advacned_webdriver 
{

	private WebDriver driver;
	static WebDriverWait wait;
	private String baseUrl, baseUrl2,Url_Naukari,Url_Gmail,Url_puch,Url_CurrentTime;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();


  @Before
  public void setUp() throws Exception 
  {
    driver = new FirefoxDriver();
    Url_Naukari = "https://www.naukri.com/advanced-search";
    Url_Gmail = "https://accounts.google.com/SignUp?continue=https%3A%2F%2Fwww.google.co.in%2F%3Fgfe_rd%3Dcr%26ei%3DiEYCWOH7GvDs8Aft74DwDg&hl=en";
    //Url_puch="http://www.ignou.ac.in/";
    Url_puch="http://puchd.ac.in/";
    Url_CurrentTime="https://www.timeanddate.com/worldclock/india/new-delhi";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wait = new WebDriverWait(driver, 5);
  }


  @Test
  public void actionsEvents() throws Exception 
  {
		Actions actions = new Actions (driver);
	    /*driver.get(Url_puch);
	  
	//contextClick command-1
	   
	    WebElement R1 = driver.findElement(By.xpath(".//*[@id='servicemenue']/ul/li[1]/strong/a[contains(text(),'Home')]"));
	    Thread.sleep(3000);
	    actions.contextClick(R1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	    Thread.sleep(3000);
	  	   
	//Get Windoes Hanldes command and Switch to child window-2
	
	    String winHandleBefore = driver.getWindowHandle();
	    for (String winHandle : driver.getWindowHandles()) 
	    {
	      // Switch to child window
	     driver.switchTo().window(winHandle);
	    }
	 
	    Thread.sleep(3000);
	    
	    WebElement admin= driver.findElement(By.xpath(".//*[@id='hmenue']//a[contains(text(),'Admissions')]"));
	    admin.click();
	    
	    Thread.sleep(5000);
	 
	//Close the Child winodw and go to the parent-3 
	    driver.close();
	   driver.switchTo().window(winHandleBefore);
	    WebElement results= driver.findElement(By.xpath(" .//*[@id='hmenue']//a[contains(text(),'Results')]"));
	    results.click();
	    Thread.sleep(5000);
	    
	  
	
	//mouseoverEvent Command-4
	    
	    WebElement moveonmenu= driver.findElement(By.xpath("//div[@id='myNavbar']//a[contains(.,'Regional Network')]"));
	    actions.moveToElement(moveonmenu);
	    actions.perform();
	    WebElement moveonmenu1= driver.findElement(By.xpath("//div[@id='myNavbar']//a[contains(text(),'Regional Centers')]"));
	    actions.moveToElement(moveonmenu1);
	    actions.click().build().perform();
	    
	    Thread.sleep(5000);
	
	//Drag and Drop Command-5   
	    driver.navigate().to("http://jqueryui.com/droppable/");
	    
	    WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		
	    WebElement Sourcelocator = driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement Destinationlocator = driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		//action.dragAndDrop(Sourcelocator, Destinationlocator).build().perform();
		action.dragAndDrop(Sourcelocator, Destinationlocator).build().perform();
		
		  Thread.sleep(5000);
	
	//Double Click Command-6   
		
		driver.navigate().to("http://api.jquery.com/dblclick/");
		
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.cssSelector("html>body>div"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		
		 JavascriptExecutor J = (JavascriptExecutor) driver;
		 J.executeScript("arguments[0].scrollIntoView();", element); //   this line has javascript error
	   
		
		Thread.sleep(5000);	 
		actions.doubleClick(element).build().perform();
		Thread.sleep(5000); 
	
	//Scroll up and down command-7
		
		driver.navigate().to(Url_Naukari);
	    Thread.sleep(5000);	 
		
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 //vertical
		
		 jse.executeScript("window.scrollBy(0,500)", "");
		 Thread.sleep(5000);
		 //horizetilh   
		  jse.executeScript("window.scrollBy(-100,0)", "");
	
		   
			Thread.sleep(5000);	 
	   
		   WebElement element2 = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/ul/li[14]/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element2);
			
			Thread.sleep(5000);	 
		  
	//Alert Handlng-8
				  
		  	driver.navigate().to("http://demo.guru99.com/V4/");
		    driver.findElement(By.name("uid")).sendKeys("mngr54743");					
		    driver.findElement(By.name("password")).sendKeys("tEqarej");					
		    driver.findElement(By.name("btnLogin")).submit();
		    
		    Alert alert=driver.switchTo().alert();		
			
		    // Capturing/get alert message.    
		    String alertMessage=driver.switchTo().alert().getText();	
		    System.out.println(alertMessage);
		    alert.accept();	
		    
		    driver.findElement(By.name("uid")).sendKeys("mngr54743");					
		    driver.findElement(By.name("password")).sendKeys("tEqarej");					
		    driver.findElement(By.name("btnLogin")).submit();
		    
		    alert.dismiss();	
	
	//Page Source Command-9 ------------------------
			
		    driver.get("http://puchd.ac.in/");
		    //driver.navigate().to("http://du.ac.in/");
		    
			  Thread.sleep(2000);
		
		    if(driver.getPageSource().contains("Established in 1882 as University"))
		    {
		       System.out.println(" Text is persent");
		
		    }
		   else
		   {
			    System.out.println(" Text is not persent");
		
		   }	  
	
	//List box-10 -----------------------------
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
		    
		    Thread.sleep(1000);
	
	//Dropdwon Handling -11 -----------------------------
		    
			driver.navigate().to("file:///C:/Ashu%20Folder/Actions_Examples/Lisrbox/list-box.html");
		    Thread.sleep(5000);
		    WebElement va2=driver.findElement(By.xpath(".//*[@id='continents']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", va2);
		    Select s1=new Select(va2);
		    //List<WebElement> allvals1=s1.getOptions();
		   
		    for(int i=0;i<allvals1.size();i++)
		    {
			     Thread.sleep(1000);
			     System.out.println("CheckBox:"+ allvals1.get(i).getAttribute("value"));
			     s1.selectByIndex(i); //select one by one
		    }
		    
		    s1.selectByIndex(0);
		    //s1.selectByValue("Africa");   
		    s1.selectByVisibleText("Antartica");
		    
		    Thread.sleep(1000);
		
		
	//Verify Current Date Scenario-12 -----------------------------
		
		   driver.get(Url_CurrentTime);
		  
		   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		   //get current date time with Date()
		   Date date = new Date();
		   //System.out.println(dateFormat.format(date));
		   //String Dformat ="dd MMMM YYYY HH:mm";
		   String Tdate = null;
		   String Ddate = null;
		   String Dformat ="EEEE, dd MMMM YYYY";
		   String Tformat ="H:mm:ss z";
		   String tTimezon="IST";

		   SimpleDateFormat TgmtDateFormat = new SimpleDateFormat(Tformat);
		   TgmtDateFormat.setTimeZone(TimeZone.getTimeZone(tTimezon));
		   Tdate= TgmtDateFormat.format(date);
		   System.out.println(Tdate);
		   
		   SimpleDateFormat gmtDateFormat = new SimpleDateFormat(Dformat);
		   gmtDateFormat.setTimeZone(TimeZone.getTimeZone(tTimezon));
		   Ddate= gmtDateFormat.format(date);
		   
		   System.out.println(Ddate);
		   
		   if(driver.getPageSource().contains(Tdate))
		   {
	    	   System.out.println("Time is correct and is showing as per the "+tTimezon+"as:"+Tdate);
			   
		   }  
		   else
		   {
			   System.out.println("Time is not correct");
		   }
		   
		   if(driver.getPageSource().contains(Ddate))
		   {
	    	   System.out.println("Date is correct and is showing as per the "+tTimezon+"as:"+Ddate);
			   
		   }  
		   else
		   {
			   System.out.println("Date is not correct");
		   }
		
		   
		
	//Tooltips Verifications-13 -----------------------------	
	
		driver.get(Url_puch);
		WebElement Admissions = driver.findElement(By.xpath("//a[text()='Admissions']"));
		String attribute ="href";
	    String Actualattribute = Admissions.getAttribute(attribute);
	    System.out.println("Actual Attribute value:"+ Actualattribute);
	    String ExpectedAttribute="http://admissions.puchd.ac.in/";
	    System.out.println("Expecpted Attribute value:"+ ExpectedAttribute);
	    
	    if(Actualattribute.equals(ExpectedAttribute))
	    {
	    	System.out.println("Test Case is passed");
	    	
	    }
	    else
	    	
	    	System.out.println("Test Case is failed"); 
	    
	//Auto suggest --14
	    
	    driver.get("http://google.com");
		WebElement textBoxElement = driver.findElement(By.id("lst-ib"));
		textBoxElement.sendKeys("war");
		WebElement wholist = driver.findElement(By.xpath("//ul[@role='listbox']"));
		int indexToSelect =2;
		
		//String b = "By.tagName('li')";
		
		//selectOptionWithIndex(2,wholist);
		
		try 
		{
		
			wait.until(ExpectedConditions.visibilityOf(wholist));
			List<WebElement> optionsToSelect = wholist.findElements(By.tagName("li"));
			if(indexToSelect<=optionsToSelect.size()) 
		    {
		       	System.out.println("Trying to select based on index: "+indexToSelect);
		          optionsToSelect.get(indexToSelect).click();
		          Thread.sleep(3000);
		    }
		} 		
		catch (NoSuchElementException e) 
		{
			System.out.println(e.getStackTrace());
		}
		catch (Exception e) 
		{
			System.out.println(e.getStackTrace());
		}*
		
		
	// count number of link on the page -15 
		
		driver.get(Url_puch);
		List<WebElement> allLinkElements = driver.findElements(By.xpath("//a"));
		int linkcount = allLinkElements.size();
		System.out.println(linkcount);
		
		for (int i=0;i<allLinkElements.size(); i++)
		{
			System.out.println("The number of link is :" +i + " = " + allLinkElements.get(i).getText());
		} */


	// Capture SceenShot - 16
		
		driver.get(Url_puch);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:/error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());

		 }
		
 }
    
  
  @After
  public void TearDown() throws Exception {
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
