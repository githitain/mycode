package S13_Session_Web_July10th;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ACT 
{
	public WebDriver driver;
	String baseurl,Url_puch;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium jar\\Selenium-3.4.0\\geckodriver.exe");
		driver = new FirefoxDriver();
		Url_puch="http://www.ignou.ac.in/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	}
	
	@Test
	public void testMethod() throws InterruptedException
	{
		driver.get(Url_puch);
		//div[@class='item active']//a[contains(.,'Downloads')]
		//driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		
		WebElement R1 = driver.findElement(By.xpath("//div[@class='item active']//a[contains(.,'Downloads')]"));
		
		Actions a1 = new Actions(driver);
		
		/*a1.contextClick(R1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		/*actions.contextClick(R1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		R1.
		//R1.click();
		
		Thread.sleep(5000);
		
		//Get Windoes Hanldes command and Switch to child window-2
		
	    String winHandleBefore = driver.getWindowHandle();
	    for (String winHandle : driver.getWindowHandles()) 
	    {
	      // Switch to child window
	     driver.switchTo().window(winHandle);
	     
	    }
	 
	    Thread.sleep(3000);
	    
	    WebElement R2 = driver.findElement(By.xpath("//a[contains(text(),'Re-admission')]"));
		
		R2.click();
		
		 WebElement R3 = driver.findElement(By.xpath("//a[text()='Prospectus']"));
			
			R3.click();
			
		
		
	    
	    Thread.sleep(5000);
	 
	//Close the Child winodw and go to the parent-3 
	    driver.close();
	    driver.switchTo().window(winHandleBefore);
	    WebElement results= driver.findElement(By.xpath(" //div[@class='item active']//a[contains(.,'Results')]"));
	    results.click();
	    Thread.sleep(5000);
	    */
		
	//mouseoverEvent Command-4
	    
	    WebElement moveonmenu= driver.findElement(By.xpath("//div[@id='myNavbar']//a[contains(.,'Regional Network')]"));
	    a1.moveToElement(moveonmenu);
	    a1.perform();
	    
	    WebElement moveonmenu1= driver.findElement(By.xpath("//div[@id='myNavbar']//a[contains(text(),'Regional Centers')]"));
	    a1.moveToElement(moveonmenu1);
	    a1.click();
		
		Thread.sleep(5000); 
		
		
		
		
	}
	
	/*@Test
	void testMethod1()
	{
		
	}?*/
	
	@After
	public void close()
	{
	
		driver.quit();
	}
	
}
