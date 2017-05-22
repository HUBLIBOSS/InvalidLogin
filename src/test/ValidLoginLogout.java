package test;



import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest
{
	@Test()
	public void testValidLoginLogout() throws InterruptedException
	{
		String un=Excel.getCellData(INPUT_PATH,"ValidLoginLogout", 1, 0);
		String pw=Excel.getCellData(INPUT_PATH,"ValidLoginLogout", 1, 1);
	    String hpd=Excel.getCellData(INPUT_PATH,"ValidLoginLogout", 1, 2);
		String lpd=Excel.getCellData(INPUT_PATH,"ValidLoginLogout", 1, 3);


	   //enter valid username
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		
	  //enter valid password
		l.setPassword(pw);
		
	  // click on login
		l.clickLogin();
	 // verify that Home page is displaed
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	
		e.verifyTitle(hpd);
	//click on logout
	    e.clickLogout();
				
	// verify that logi page is displaed
		l.verifyTitle(lpd);

	
}
}



