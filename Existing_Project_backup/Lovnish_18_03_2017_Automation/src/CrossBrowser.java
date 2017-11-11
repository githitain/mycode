import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowser 
{
	static WebDriver driver;

	public static void main(String []args) 
	{
		String ChromedriverPath="C:\\Ashu Folder\\selenium Course Batch\\Lovnish\\";
		String IEdriverPath="C:\\Ashu Folder\\selenium Course Batch\\Lovnish\\";

		System.out.println("launching chrome browser");
		//System.setProperty("webdriver.chrome.driver", ChromedriverPath+"chromedriver.exe");
		//driver = new ChromeDriver();
		
		//or
		System.setProperty("webdriver.ie.driver", IEdriverPath+"IEDriverServer.exe");
		driver = new InternetExplorerDriver();

		
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");

		driver.findElement(By.id("Email")).sendKeys("webtraining019");
		// Enter Password
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		// Wait For Page To Load
		// Click on 'Sign In' button
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("12466");
		
		//Click on Compose Mail.
		driver.findElement(By.id("signIn")).click();
		// Click on the image icon present in the top right navigational Bar
		driver.findElement(By.linkText("Forgot password?")).click();
		//Click on 'Logout' Button
		//driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		//Close the browser.
		driver.quit();
	}
}
