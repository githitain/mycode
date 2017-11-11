package S14_Session_Web_July12th;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

public class Robat_Ex1 
{
	
	
	private WebDriver driver;
	private String baseUrl,baseUrl2;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	//private Select sel = null;
	  
	  
	@Before
	  public void setUp() throws Exception 
	  {
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium jar\\Selenium-3.4.0\\geckodriver.exe");

	    driver = new FirefoxDriver();
	    //baseUrl = "https://www.naukri.com/";
	    baseUrl = "https://uploadfiles.io/";
	    //baseUrl2= "http://qavenc640bun.iii.com/iii/mobile/?lang=eng";
	    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	  }

	 
	@Test
	public void testWindowAlert() throws Exception
	{
		driver.get(baseUrl);
		
		String parent = driver.getWindowHandle();
		Set<String> pops=driver.getWindowHandles();
		{
			Iterator<String> it =pops.iterator();
			while (it.hasNext()) 
			{
				String popupHandle=it.next().toString();
				if(!popupHandle.contains(parent))
				{
					driver.switchTo().window(popupHandle);
					System.out.println("Popu Up Title: "+ driver.switchTo().window(popupHandle).getTitle());
					driver.close();
				}
			}
			driver.switchTo().window(parent);
		}
		
		//driver.findElement(By.xpath("//a/span[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath(".//*[@id='upload-window']")).click();
		Thread.sleep(5000);
		
		//String path = "C:/iii.png";
		StringSelection ss = new StringSelection("C:\\pics\\iii.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		
	

		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='edit']/a")).click();
	}
	@After
	public void tearDown()
	{
	driver.quit();
	}
	}









