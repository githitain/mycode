package S10_Session_Web_June28th;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class gloskills
{
		WebDriver driver;
		String baseUrl;
		
		@Before
		public void setup()
		{
			System.setProperty("webdriver.firefox.marionette", "D:/selenium/geckodriver-v0.9.0-win64");
			driver = new FirefoxDriver();
			//System.setProperty("webdriver.chrome.driver", "C:/Projects/selenium-java-3.4.0/chromedriver/chromedriver.exe");
			//driver=new ChromeDriver();
			baseUrl="https://glo.globallogic.com/";
		}
		
		@Test
		public void test() throws Exception
		{
			Actions act = new Actions(driver);
			driver.get(baseUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id='login']")).sendKeys("jitesh.kumar");
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");
			driver.findElement(By.xpath("//*[@id='glo-login-form']//*[@value='LOGIN']")).click();
			driver.findElement(By.xpath("//*[@id='slideSkip']")).click();
			driver.findElement(By.xpath("//a[contains(.,'My Profile')]")).click();
			driver.findElement(By.xpath(".//*[@id='profileTabs']//a[contains(.,'Career Profile')]")).click();
			
			//Verification-Primary-Secondary-Skills
			if (driver.findElement(By.xpath(".//*[@id='primary_secondary_skill_26064']//h3[contains(.,'Primary and Secondary Skills')]")).isDisplayed())
			{
				System.out.println("PASSED! Primary and Secondary Skills is visible");
			}
			else
			{
				System.out.println("FAILED! Primary and Secondary Skills is not visible");
			}
			
			Thread.sleep(2000); //Focus & Add skills
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			WebElement element0 = driver.findElement(By.xpath("(.//div[contains(text(),'Key Responsibilities:')])[last()]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element0);
		    WebElement element1 = driver.findElement(By.xpath(".//a[contains(.,'Add Skills')]"));
		    act.moveToElement(element1).click().perform();
			
		    Thread.sleep(2000); //Select Skill & Focus
			Select sel=new Select(driver.findElement(By.xpath(".//*[@id='user_ecv_primary_skill_primary_skill_id']")));
			sel.selectByValue("16");
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element0);
			
			Thread.sleep(2000); //Adding Skill Subset & Save
			WebElement element2=driver.findElement(By.xpath(".//*[@id='token-input-demo-input-facebook-theme']"));
			element2.click();
			act.moveToElement(element2)
			.sendKeys("junit").pause(2000).sendKeys(Keys.TAB)
			.sendKeys("java").pause(2000).sendKeys(Keys.TAB)
			.sendKeys("QA a").pause(2000).sendKeys(Keys.TAB).pause(2000)
			.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
			
			Thread.sleep(3000);//Verification-skill-badges
			try
			{
			WebElement sb1=driver.findElement(By.xpath(".//div[@class='skill-badge']//a[contains(text(),'JUnit')]"));
			WebElement sb2=driver.findElement(By.xpath(".//div[@class='skill-badge']//a[contains(text(),'Java')]"));
			WebElement sb3=driver.findElement(By.xpath(".//div[@class='skill-badge']//a[contains(text(),'QA Automation')]"));
			System.out.println("PASSED! Skill BADGES are added");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("FAILED! Skill BADGES are NOT added");
			}
						
			
			driver.navigate().refresh();//Verification-skill-tags
			Thread.sleep(2000);
			try
			{
			WebElement st1=driver.findElement(By.xpath(".//h2[(contains(text(),'Skills Tags'))]/following-sibling::div/a[(contains(text(),'JUnit'))]"));
			WebElement st2=driver.findElement(By.xpath(".//h2[(contains(text(),'Skills Tags'))]/following-sibling::div/a[(contains(text(),'Java'))]"));
			WebElement st3=driver.findElement(By.xpath(".//h2[(contains(text(),'Skills Tags'))]/following-sibling::div/a[(contains(text(),'QA Automation'))]"));
			System.out.println("PASSED! Skill TAGS are displayed & hyperlinked in the left menu");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("FAILED! Skill TAGS are NOT displayed & hyperlinked in the left menu");
			}			
		}
}
