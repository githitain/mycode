package S14_Session_Web_July12th;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actions2 
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
		
			/*driver.navigate().to("http://api.jquery.com/dblclick/");
			
			WebElement element0 = driver.findElement(By.xpath(".//*[@id='legal']/ul/li[3]/a"));
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element0);
			
			driver.switchTo().frame(0);
			WebElement element = driver.findElement(By.xpath("html/body/div[1]"));
			
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
			
			 JavascriptExecutor J = (JavascriptExecutor) driver;
			 J.executeScript("arguments[0].scrollIntoView();", element); //   this line has javascript error
		   
			 Actions a1 = new Actions(driver);
			 
			Thread.sleep(5000);	 
			a1.doubleClick(element).build().perform();
			Thread.sleep(5000); 
			
			
			driver.navigate().to("http://demo.guru99.com/V4/");
		    driver.findElement(By.name("uid")).sendKeys("mngr54743");					
		    driver.findElement(By.name("password")).sendKeys("tEqarej");					
		    driver.findElement(By.name("btnLogin")).submit();
		    
		    Alert al=driver.switchTo().alert();		
			
		    // Capturing/get alert message.    
		    String alertMessage=driver.switchTo().alert().getText();	
		    System.out.println(alertMessage);
		    al.accept();
		    
		    
		    driver.findElement(By.name("uid")).sendKeys("mngr54743");					
		    driver.findElement(By.name("password")).sendKeys("tEqarej");					
		    driver.findElement(By.name("btnLogin")).submit();
		    */
			
			
			//Auto suggest --14
		    
		    driver.get("http://google.com");
			WebElement textBoxElement = driver.findElement(By.id("lst-ib"));
			textBoxElement.sendKeys("dev");
			WebElement wholist = driver.findElement(By.xpath("//ul[@role='listbox']"));
			int indexToSelect =2;
			
			//String b = "By.tagName('li')";
			
			//selectOptionWithIndex(2,wholist);
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			try 
			{
			
				wait.until(ExpectedConditions.visibilityOf(wholist));
				List<WebElement> optionsToSelect1 = driver.findElements(By.tagName("li"));
				List<WebElement> optionsToSelect = wholist.findElements(By.tagName("li"));
				System.out.println(optionsToSelect1.size());
				System.out.println(optionsToSelect.size());
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
			}
			
			
			
		}
		
		@After
		public void close()
		{
		
			driver.quit();
		}
		
	}


