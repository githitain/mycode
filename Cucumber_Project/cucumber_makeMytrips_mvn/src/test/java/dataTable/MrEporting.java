package dataTable;
import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

public class MrEporting 
{

public static void main (String args[]) throws Exception
{
	CucumberResultsOverview results = new CucumberResultsOverview();
	results.setOutputDirectory("target");
	results.setOutputName("cucumber-results");
	results.setSourceFile("./src/test/resources/cucumber.json");
	results.executeFeaturesOverviewReport();

}


}
