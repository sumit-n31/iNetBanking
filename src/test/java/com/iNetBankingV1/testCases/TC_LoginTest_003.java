package com.iNetBankingV1.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.iNetBankingV1.pageObject.Createaccountpage;

import junit.framework.Assert;

public class TC_LoginTest_003 extends BaseClass {
	
	@Test
	public void createNewaccount() {
		driver.get(baseUrl);
		Createaccountpage c = new Createaccountpage(driver);
		c.signIn1();
		
		c.createAcc();
		
		c.enterName("Sumit N");
		
		c.enteMob("976497051");
		
		String email = randomString()+"@gmail.com";
		
		c.enterEmail(email);
		
		c.enterPass("pass@2021Ab");
		
		c.conti();
		
		boolean res = driver.getPageSource().contains("Solve this puzzle to protect your account");
		
		if(res==true) {
			Assert.assertTrue(true);
		
		} else {
			Assert.assertTrue(false);
		}
		
	}
	
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphanumeric(8);
		return generatedString;

	}
	
	public String randomNum() {
		String generatedNum = RandomStringUtils.random(8);
		return generatedNum;

	}

}
