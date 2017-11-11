package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:/III_Automation/Worksapces/DC_BDD/src/stepDefination/DC_Evalution.features" 
				, format={"pretty","html:target/Destination"})


public class DC_Evalution_TestRunner 
{

}
