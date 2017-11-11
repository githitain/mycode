package dataTable;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/dataTable",
										glue={"classpath:dataTable"},
										format={"pretty","html:target/Destination", "json:target/cucumber.json"},
										tags = {"@GoogleTestingRegression", "@Passed"} 
										//dryRun=true
									)

public class MdataTableRunnerTNG extends AbstractTestNGCucumberTests
{
	static	{
	 System.out.println("In DC_Evalution_TestRunner Runner file");
	}
}
