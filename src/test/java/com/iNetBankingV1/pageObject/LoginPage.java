package com.iNetBankingV1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(css = "a.nav-a.nav-a-2.nav-progressive-attribute:nth-of-type(2)")
	@CacheLookup
	WebElement signIn;

	@FindBy(css="input#ap_email")
	@CacheLookup
	WebElement uName;

	@FindBy(css="input#continue")
	@CacheLookup
	WebElement conti;

	@FindBy(css="input#ap_password")
	@CacheLookup
	WebElement pass;

	@FindBy(css ="input#signInSubmit")
	@CacheLookup
	WebElement logIn;

	public void signIn() {
		signIn.click();

	}

	public void setUser(String user) {
		uName.sendKeys(user);

	}

	public void conti() {
		conti.click();

	}

	public void setPassword(String password) {
		pass.sendKeys(password);
	}

	public void clickSubmit() {
		logIn.click();

	}
}
