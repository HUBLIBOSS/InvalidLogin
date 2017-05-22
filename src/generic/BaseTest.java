package generic;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest implements Autoconst{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApplication(){
		System.setProperty(CHROME_KEY  ,CHROME_VALUE);
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApplication(){
		driver.quit();
	}
}
