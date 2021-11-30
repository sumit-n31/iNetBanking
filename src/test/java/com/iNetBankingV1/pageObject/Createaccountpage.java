package com.iNetBankingV1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createaccountpage {
	
	WebDriver ldriver;
	
	public Createaccountpage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(css = "a.nav-a.nav-a-2.nav-progressive-attribute:nth-of-type(2)")
	@CacheLookup
	WebElement signIn1;

	@FindBy(css = "a.nav-a.nav-a-2.nav-progressive-attribute:nth-of-type(2)")
	@CacheLookup
	WebElement signIn;
	
	@FindBy(css = "a#createAccountSubmit")
	@CacheLookup
	WebElement createAccount;
	
	@FindBy(css="input#ap_customer_name")
	@CacheLookup
	WebElement name;
	
	@FindBy(css="input#ap_phone_number")
	@CacheLookup
	WebElement mobile;
	
	@FindBy(css ="input#ap_email")
	@CacheLookup
	WebElement email;
	
	@FindBy(css ="input#ap_password")
	@CacheLookup
	WebElement password;
	
	@FindBy(css ="input#continue")
	@CacheLookup
	WebElement conti;
	
	public void signIn1() {
		signIn1.click();
	}
	public void signIn() {
		signIn.click();
	}
	
	public void createAcc() {
		createAccount.click();
	}
	
	public void enterName(String custname) {
		name.sendKeys(custname);
	}
	
	public void enteMob(String mobno) {
		mobile.sendKeys(mobno);
	}
	
	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void enterPass(String pass) {
		password.sendKeys(pass);
	}
	
	public void conti() {
		conti.click();
	}
	
	
	
	
	

	

}
