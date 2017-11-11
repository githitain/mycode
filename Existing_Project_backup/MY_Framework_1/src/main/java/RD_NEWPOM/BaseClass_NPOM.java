package RD_NEWPOM;

import org.openqa.selenium.WebDriver;

public class BaseClass_NPOM {
	
public static WebDriver driver;
public static boolean bResult;

	public  BaseClass_NPOM(WebDriver driver)
	{
				BaseClass_NPOM.driver = driver;
				BaseClass_NPOM.bResult = true;
	}

}


