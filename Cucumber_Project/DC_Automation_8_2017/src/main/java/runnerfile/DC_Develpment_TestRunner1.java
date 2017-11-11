package runnerfile;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@CucumberOptions(features="src/main/java/features",
//@CucumberOptions(features="classpath:features",
@CucumberOptions(features="Resources/features",
									glue={"classpath:stepDefinations"},
									format={"pretty","html:target/Destination"//,
									//"json:Reporting/cucumber.json",
									//"com.cucumber.listener.ExtentCucumberFormatter:Reporting/extent.html"
}
//dryRun=true
)



public class DC_Develpment_TestRunner1 extends AbstractTestNGCucumberTests
{
	@AfterClass
	public static void reportSetup()
	{
		System.out.println("Extent Reportiong is started");
		Reporter.loadXMLConfig(new File("Resources/extent-config.xml"));
		Reporter.setSystemInfo("UserName", "Hitain");
	}
}
