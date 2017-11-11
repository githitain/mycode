package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class YahooLoginTest_StepDef 
{
	
	public WebDriver driver= null;
	
	@Given("^user opens yahoo login page$")
	public void user_opens_yahoo_login_page()
	{
		driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com");
	}
	
	@Then("^user enters login_id$")
	public void user_enters_login_id()
	{
		
		driver.findElement(By.xpath(".//*[@id='login-username']")).sendKeys("hitain");
	}
	
	@Then("^user click on Next$")
	public void user_click_on_Next()
	{
		driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
	}
	
	@And("^user clicks forogt password link$")
	public void user_clicks_forogt_password_link()
	{
		driver.findElement(By.xpath(".//*[@id='mbr-forgot-link']")).click();
	}
	
	@And("^close the browser$")
	public void User_close_browser()
	{
		driver.quit();
	}
}
