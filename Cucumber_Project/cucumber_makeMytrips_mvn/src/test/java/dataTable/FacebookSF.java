package dataTable;

import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSF 
{ 
   WebDriver driver;
	
   
   @Given("^I am on the new user registration page$") 
   public void goToFacebook() 
   {
	
	   System.setProperty("webdriver.chrome.driver", "D:\\Automation_Software\\Selenium Jars\\chromedriver.exe");
	   driver = new ChromeDriver();
		//driver= new FirefoxDriver();
      //Intiate web browser instance. driver = new FirefoxDriver();
      driver.navigate().to("https://www.facebook.com/"); 
   } 
	
   @When("^I enter invalid data on the page$") 
   public void enterData(DataTable table)
   { 
      //Initialize data table 
      List<List<String>> data = table.raw();
      System.out.println(data.get(1).get(1)); 
      
      //Enter data
      driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(1));
      driver.findElement(By.name("lastname")).sendKeys(data.get(2).get(1));
      driver.findElement(By.name("reg_email__")).sendKeys(data.get(3).get(1));     
      driver.findElement(By.name("reg_email_confirmation__")).
         sendKeys(data.get(4).get(1)); 
      driver.findElement(By.name("reg_passwd__")).sendKeys(data.get(5).get(1)); 
      
      Select dropdownB = new Select(driver.findElement(By.name("birthday_day"))); 
      dropdownB.selectByValue("15"); 
		
      Select dropdownM = new Select(driver.findElement(By.name("birthday_month")));
      dropdownM.selectByValue("6"); 
		
      Select dropdownY = new Select(driver.findElement(By.name("birthday_year")));
      dropdownY.selectByValue("1990"); 
		
      driver.findElement(By.className("_58mt")).click(); 
      // Click submit button driver.findElement(By.name("websubmit")).click(); 
   } 
	
   @Then("^Close Facebook application$") 
   public void FacebookClose() 
   {
      //if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/")){
         System.out.println("Test Pass"); 
      //} //else { 
         System.out.println("Test Failed"); 
      //} 
      driver.close(); 
   } 
}
