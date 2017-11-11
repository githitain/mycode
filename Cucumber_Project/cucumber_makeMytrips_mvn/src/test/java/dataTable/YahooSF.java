package dataTable;

import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YahooSF 
{ 
   WebDriver driver;
	
   /*@Before
   public void Open()
   {
	   System.out.println("Open Browser"); 
	   System.setProperty("webdriver.chrome.driver", "D:\\Automation_Software\\Selenium Jars\\chromedriver.exe");
	   driver = new ChromeDriver();
   }*/
  
   
   @Given("^I am on the Yahoo Home page$") 
   public void goToYahoo()
   { 
	   System.out.println("Open Browser"); 
	   System.setProperty("webdriver.chrome.driver", "D:\\Automation_Software\\Selenium Jars\\chromedriver.exe");
	   driver = new ChromeDriver();
	   
      driver.navigate().to("https://in.yahoo.com/?p=us"); 
   } 
	 
   @When("^I Click Login link$") 
   public void VerifyYahoologin() 
   {
	   System.out.println("VerifyYahooLogin-Functinaly");
	   driver.findElement(By.xpath(".//*[@id='uh-signin']")).click();  
   } 
   
   @When("^I Click on Email link$") 
   public void VerifyEmail() 
   {
	   System.out.println("Click on Sign-up link");
	   driver.findElement(By.xpath(".//*[@id='mega-bottom']]")).click();  
   } 
   
   @When("^I Click Cricket link$") 
   public void VerifyCrickete() 
   {
	   System.out.println("Click on Cricekt");
	   driver.findElement(By.xpath(".//*[@id='mega-bottombar']//a[contains(.,'Cricket')]")).click();  
   } 
   
   @Then("^Close the Yahoo link$") 
   public void CloseYahoo() 
   {
	   driver.quit();
   } 
   

}
