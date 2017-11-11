package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DC_Evalution_StepDef 
{
	
	public  WebDriver driver= null;
	
	///Scenarios-1-------------------------------------------------------->
	@Given("^User is on DC Home Page$")
	public  void User_is_on_DC_Home_Page()
	{
		CommanFuntion.init_open("https://noidcbun-dc.iii.com/iii/dc-noida/login/auth");
	}

	@When("^User is logged in into DC and currently is under Evaluation mode$")
	public  void User_is_logged_in_into_DC_and_currently_is_under_Evaluation_mode()
	{
		CommanFuntion.waitThread(2);
		System.out.println("Give UserName");
		CommanFuntion.sendKeysInput("DC","username_inputbox","iii");
		
		System.out.println("Give Password");
		CommanFuntion.sendKeysInput("DC","password_inputbox","94484ern");
		
		System.out.println("Click on Button");
		CommanFuntion.clickLink("DC","submit_btn");
		
		CommanFuntion.waitThread(4);
		
		System.out.println("Click on Evalution Mode");
		CommanFuntion.clickLink("DC","evalutionMode_img");
	
		CommanFuntion.waitThread(4);
	}
	
	@Then("^User has verified that Expenditure Trends sub-category is present under Acquisitions$")
	public  void User_has_verified_that_Expenditure_Trends_subcategory_is_present_under_Acquisitions()
	{
		
		System.out.println("Verify The Expenditure elemnt");
		CommanFuntion.verifyElement("DC","acquistionsExpenditures_link");
		
		CommanFuntion.waitThread(4);
		
		System.out.println("Verify The Expenditure Trend elemnt");
		CommanFuntion.verifyElement("DC","acquistionsExpendituresTrand_link");
		
	
	}
	
	@And("^User Expands Expenditure Trends sub-category$")
	public void And_User_Expands_Expenditure_Trends_sub_category()
	{
		CommanFuntion.clickLink("DC", "acquistionsExpendituresTrand_link");
	}
	
	@Then("^User Expenditure Trends sub-category should be expandable and Following reports should be present Expenditure Trends by Bib Level$")
	public  void Expenditure_Trends_subcategory_should_be_expandable_and_Following_reports_should_be_present()
	{
		
		System.out.println("Verify Report with link  Expenditure Trends by Bib Level");
		CommanFuntion.verifyElement("DC","ExpenditureTrendsByBibLevel_link");
		
		System.out.println("Verify Report with link  Expenditure Trends by Call Number Range");
		CommanFuntion.verifyElement("DC","ExpenditureTrendsByCallNubmberRange_link");
		
		System.out.println("Verify Report with link  Expenditure Trends by Format");
		CommanFuntion.verifyElement("DC","ExpenditureTrendsByFormat_link");
		
		System.out.println("Verify Report with link   Expenditure Trends by Funds");
		CommanFuntion.verifyElement("DC","ExpenditureTrendsByFunds_link");
		
	
	}
	
	///Scenarios-2-------------------------------------------------------->
	
	/*@And("^And User quits the browser for C60332$")
	public void User_close_browser_C60332()
	{
		CommanFuntion.quit_Browser();
	}
	
	@Given("^User is on DC Home Page to run C60821$")
	public  void User_is_on_DC_Home_Page_C60821()
	{
		CommanFuntion.init_open("https://dc-indhd.iii.com/iii/dc-indhd/login/auth");
	}
	
	@When("^User is logged in into DC and currently is under Evaluation mode for C60821$")
	public  void User_is_logged_in_into_DC_and_currently_is_under_Evaluation_mode_C60821()
	{
		CommanFuntion.waitThread(2);
		System.out.println("Give UserName");
		CommanFuntion.sendKeysInput("DC","username_inputbox","dcadmin");
		
		System.out.println("Give Password");
		CommanFuntion.sendKeysInput("DC","password_inputbox","indhdadmin");
		
		System.out.println("Click on Button");
		CommanFuntion.clickLink("DC","submit_btn");
		
		CommanFuntion.waitThread(4);
		
		System.out.println("Click on Evalution Mode");
		CommanFuntion.clickLink("DC","evalutionMode_img");
	
		CommanFuntion.waitThread(4);
	}*/
	
	@And("^User Expands Expenditure Trends sub-category and click on the report Expenditure Trends by Bib Level$")
	public void And_User_Expands_Expenditure_Trends_sub_category_click_on_a_report()
	{
		
		CommanFuntion.clickLink("DC", "ExpenditureTrendsByBibLevel_link");
		CommanFuntion.waitThread(4000);
	}
	
	
	@Then("^User verifies the Go button$")
	public  void User_verify_the_Go_button()
	{
		CommanFuntion.waitThread(4000);
		System.out.println("Verify Go Buttn");
		CommanFuntion.verifyElement("DC","go_btn");
	}
	
	
	@And("^User clicks on Go button$")
	public  void User_clicks_on_Go_button()
	{
		CommanFuntion.waitThread(4000);
		System.out.println("click on Go Buttn");
		CommanFuntion.clickLink("DC","go_btn");
	}
	
	@Then("^Users verifies the Report Expenditure Trends by Bib Level$")
	public  void User_verifies_the_Report_Expenditure_Trends_by_Bib_Level()
	{
		CommanFuntion.waitThread(4000);
		System.out.println("Verify Report");
		CommanFuntion.verifyElement("DC","fieldTotalForTimePeriod_label");
		CommanFuntion.verifyElement("DC","email_btn");
		CommanFuntion.verifyElement("DC","export_btn");
	}
	
	@And("^User clicks on sign out link$")
	public  void User_clicks_on_signout_link()
	{
		CommanFuntion.waitThread(4000);
		System.out.println("click on sign out link");
		CommanFuntion.clickLink("DC","signOut_link");
	}
	
	@Then("^Users verifies the login page$")
	public  void User_verifies_the_login_page()
	{
		CommanFuntion.waitThread(4000);
		System.out.println("Verify login page");
		CommanFuntion.verifyElement("DC","username_inputbox");
	}
	
	@And("^User quits the browser for C60821$")
	public void User_close_browser_C60821()
	{
		CommanFuntion.quit_Browser();
	}
}
