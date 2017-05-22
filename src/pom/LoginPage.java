package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BasePage;

public class LoginPage extends BasePage 
{
	@FindBy(name="username")
	private WebElement usernameTB;
	
	@FindBy(name="pwd")
	private WebElement passwordTB;
	
	@FindBy(id="loginButton")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMSG;
	
	@FindBy(xpath="(//table[@class='footer']//nobr)[1]")
	private WebElement versionMSG;
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String un)
	{
		usernameTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		passwordTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
	public void verifyErrorMsgDisplayed()
	{
		verifyElementPresent(errMSG);
	}
	public void verfityVersion(String expected)
	{
		String actual=versionMSG.getText();
		Assert.assertEquals(expected, actual);
}
}
