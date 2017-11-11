package Sierra_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import ExecutionDriver.Runner;

public class TC_Sierra_UserAccounts 
{
	public static void Add_User(String UN, Integer number) throws Exception
	{
		Runner.driver.findElement(By.id("DirectLink_3_0")).click();
		String Uname= UN;
		for (int i=0; i<number; i++)
		{
		
			StringBuffer e1= new StringBuffer(Uname).append(i);  
		
		
		Runner.driver.findElement(By.id("createUserLink")).click();
		Runner.driver.findElement(By.id("userNameInput")).clear();
		Runner.driver.findElement(By.id("userNameInput")).sendKeys(e1);
		Runner.driver.findElement(By.id("fullNameField")).clear();
		Runner.driver.findElement(By.id("fullNameField")).sendKeys(e1);
		Runner.driver.findElement(By.id("passwordInput")).clear();
		Runner.driver.findElement(By.id("passwordInput")).sendKeys(e1);
		Runner.driver.findElement(By.id("confirmPasswordInput")).clear();
		Runner.driver.findElement(By.id("confirmPasswordInput")).sendKeys(e1);
	    new Select(Runner.driver.findElement(By.id("languageChooser"))).selectByVisibleText("English");
	    Runner.driver.findElement(By.id("Submit_1")).click();
	    System.out.println("user has been created" + e1);
	    
	}
		
	}
}
	