package config;

public class Constants 
{
	//This is the list of System Variables
    //Declared as 'public', so that it can be used in other classes of this project
    //Declared as 'static', so that we do not need to instantiate a class object
    //Declared as 'final', so that the value of this variable can be changed
    // 'String' & 'int' are the data type for storing a type of value	
	public static final String URL = "https://accounts.google.com/ServiceLogin";
	public static final String Path_TestData = "D://Workspace_2//Keyword_FrameWork//src//main//java//dataEngine//DataEngine.xlsx";
	public static final String Path_OR = "D://Workspace_2//Keyword_FrameWork//src//main//java//config//OR.txt";
	public static final String File_TestData = "DataEngine.xlsx";
	public static final String Path_EOR = "D://Workspace_2//Keyword_FrameWork//src//main//java//dataEngine//OR.xlsx"; 
 
	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject =4 ;
	public static final int Col_ORSheetName =3 ;
	public static final int Col_ActionKeyword =5 ;
	public static final int Col_RunMode =2; 
	public static final int Col_TestData=6;
	public static final int Col_Result =3;
	public static final int Col_TestStepResult =7;

	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test_Steps";
	public static final String Sheet_TestCases = "Test_Case";
	public static final String Sheet_OR = "Test_Case";
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";

 
	// List of Test Data
	public static final String UserName = "hitain007";
	public static final String Password = "Test@123";
}
