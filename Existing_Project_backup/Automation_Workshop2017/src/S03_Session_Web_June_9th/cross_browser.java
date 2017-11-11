package S03_Session_Web_June_9th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cross_browser 

{
	public static void main(String []args) throws InterruptedException 
	{
		WebDriver driver2;
		String baseUrl;
		baseUrl = "https://www.flipkart.com/";
		System.out.println("launching Brower browser");
		System.setProperty("webdriver.firefox.marionette","D:\\Automation_Software\\Selenium Jars\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Software\\Selenium Jars\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\Automation_Software\\Selenium Jars\\IEDriverServer.exe");
		System.setProperty("webdriver.opera.driver", "D:\\Automation_Software\\Selenium Jars\\operadriver.exe");
	
		//driver2 = new FirefoxDriver();
		//driver2 = new InternetExplorerDriver();
		//driver2 = new ChromeDriver();
		driver2 = new OperaDriver();
		
		driver2.get(baseUrl);
		Thread.sleep(5000);
		
	    driver2.findElement(By.cssSelector("input[name=q]")).sendKeys("wallet");
		driver2.findElement(By.cssSelector("button.vh79eN[type=submit]")).click();
		Thread.sleep(3000);
		
		
		//System.out.println("Page title: - "+strPageTitle);
		driver2.quit();
	}
}
