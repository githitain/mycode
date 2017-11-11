package runnerfile;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="classpath:features",
										glue={"classpath:stepDefinations"},
										format={"pretty","html:target/Destination"}
										//dryRun=true
									)

public class DC_Evalution_TestRunner1 extends AbstractTestNGCucumberTests
{
	static	{
	 System.out.println("In DC_Evalution_TestRunner Runner file");
	}
}
