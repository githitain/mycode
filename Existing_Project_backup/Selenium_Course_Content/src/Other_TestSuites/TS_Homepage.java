package Other_TestSuites;

import org.testng.annotations.Test;

import Other_testcases.TC_Naukari_Homepage;
import Other_testcases.TC_SBI_Homepage;
import Parametration_XML.XML_file_Reading;
import ExecutionDriver.Runner;


public class TS_Homepage extends Runner 
{
	//TC_SBI_Homepage SHP;
	
	@Test
	public static void TC1() throws Exception
	{
		//TC_Homepage.search();
		//TC_SBI_Homepage.Cap_Login();
		
		 TC_SBI_Homepage.sirra_login();
		 TC_SBI_Homepage.sirra_search();
		 
		//TC_SBI_Homepage.GoTOHomePage();
		//TC_SBI_Homepage.Personal_Login(XML_file_Reading.getXMLTagValue("X_SBI", "username"), XML_file_Reading.getXMLTagValue("X_SBI", "password"));
	}
}
