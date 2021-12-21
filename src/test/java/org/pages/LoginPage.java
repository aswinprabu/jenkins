package org.pages;

import org.bcc.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//p[contains(text(),'Adactin')]")
	private WebElement loginPage;
	
	public WebElement getLoginPage() {
		return loginPage;
	}

	@FindBy (name="username")
	private WebElement txtUserName;
	
	@FindBy (name="password")
	private WebElement txtPassword;
	
	@FindBy (name="login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	
	
}
