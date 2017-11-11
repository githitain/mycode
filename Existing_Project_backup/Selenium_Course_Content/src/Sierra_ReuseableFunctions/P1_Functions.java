package Sierra_ReuseableFunctions;

import org.openqa.selenium.By;

import ExecutionDriver.Runner;

public class P1_Functions 
{
	public static void Sirra_login(String U1, String P1) throws Exception
	{
		/*String U1="iii";
		String P1="18745noi";*/
		
		Runner.driver.findElement(By.name("j_username")).clear();
		Runner.driver.findElement(By.name("j_username")).sendKeys(U1);
		Runner.driver.findElement(By.name("j_password")).clear();
		Runner.driver.findElement(By.name("j_password")).sendKeys(P1);
		Runner.driver.findElement(By.cssSelector("input.button")).click();
		
	}
	
	public static void Sirra_Logout() throws Exception
	{
		Runner.driver.findElement(By.id("moreMenuLink")).click();
		Runner.driver.findElement(By.xpath(".//a[contains(text(),'Sign out')]")).click();
		
	}
}
