package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	@FindBy(id="txtUsername")
	WebElement un;
	
	@FindBy(id="txtPassword")
	WebElement pwd;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	public void login(String u, String p)
	{
		un.sendKeys(u);
		pwd.sendKeys(p);
		login.click();
	}
}
