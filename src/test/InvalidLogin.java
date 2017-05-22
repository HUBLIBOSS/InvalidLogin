package test;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LoginPage;

public class InvalidLogin extends BaseTest 
{
	@Test
	public void testInvalidLogin()
	{
		String un=Excel.getCellData(INPUT_PATH, "InvalidLogin", 1, 0);
		String pw=Excel.getCellData(INPUT_PATH, "InvalidLogin", 1, 1);
		
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		
		l.setPassword(pw);
		
		l.clickLogin();
		l.verifyErrorMsgDisplayed();
	}
}
