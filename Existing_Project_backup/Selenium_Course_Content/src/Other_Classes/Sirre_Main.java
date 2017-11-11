package Other_Classes;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sirre_Main 
{
	 private static WebDriver driver;
	  private static String baseUrl;
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	  
	  public static void main (String arg[])
	  {
		  

		  /*System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Automations_SW\\Browser exe\\chromedriver.exe");
		  driver = new ChromeDriver();*/
		  System.out.println("Test1" );
		  driver = new FirefoxDriver();
		  baseUrl = "http://172.16.77.162/sierra/admin";
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get(baseUrl);
		    driver.findElement(By.name("j_username")).clear();
		    driver.findElement(By.name("j_username")).sendKeys("iii");
		    driver.findElement(By.name("j_password")).clear();
		    driver.findElement(By.name("j_password")).sendKeys("30848noi");
		    String UN= "TP";
		    for (int i=0; i>2; i++)
		    
		    { 	StringBuffer un1= new StringBuffer(UN).append(i);  
		    			
		    			
		    	System.out.println("the results is " + un1);
		  }
		    driver.findElement(By.cssSelector("input.button")).click();
		    driver.findElement(By.linkText("Authorizations and Authentication")).click();
		    
		    String Uname= "TP";
		    for (int i=0; i>2; i++)
		    {
		    	StringBuffer un= new StringBuffer(Uname).append(i);  
		    			
		    			
		    	System.out.println(un);
		    
		    driver.findElement(By.xpath(".//*[contains(text(),'CREATE USER')]")).click();
		    driver.findElement(By.xpath(".//*[@name='userNameInput']")).clear();
		    driver.findElement(By.xpath(".//*[@name='userNameInput']")).sendKeys(un);
		    driver.findElement(By.id("fullNameField")).clear();
		    driver.findElement(By.id("fullNameField")).sendKeys(un);
		    driver.findElement(By.id("passwordInput")).clear();
		    driver.findElement(By.id("passwordInput")).sendKeys(un);
		    driver.findElement(By.id("confirmPasswordInput")).clear();
		    driver.findElement(By.id("confirmPasswordInput")).sendKeys(un);
		    new Select(driver.findElement(By.id("languageChooser"))).selectByVisibleText("English");
		    driver.findElement(By.id("Submit_1")).click();
		    driver.findElement(By.id("link_edituser_tabEDIT_TAB_APPLICATIONS")).click();
		    driver.findElement(By.cssSelector("span.addAll")).click();
		    driver.findElement(By.xpath("//button[@type='button']")).click();
		    driver.findElement(By.id("Submit_1")).click();
		    driver.findElement(By.id("link_edituser_tabEDIT_TAB_PERMISSIONS")).click();
		    driver.findElement(By.cssSelector("span.addAll")).click();
		    driver.findElement(By.id("Submit_1")).click();
		    driver.findElement(By.id("link_edituser_tabEDIT_TAB_WORKFLOWS")).click();
		    driver.findElement(By.id("Submit_1")).click();
		    driver.findElement(By.id("linkUsers")).click();
		    driver.findElement(By.id("createUserLink")).click();
		    
		    }
		    
		    driver.quit();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      fail(verificationErrorString);
		    }
		    
	  }
}
