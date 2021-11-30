package com.iNetBankingV1.testCases;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.iNetBankingV1.pageObject.LoginPage;
import com.iNetBankingV1.utilities.Reporting;
@Listeners(Reporting.class)
public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() {
		driver.get(baseUrl);
		LoginPage l = new LoginPage(driver);
		l.signIn();
		
		l.setUser(userName);
		
		l.conti();
		
		l.setPassword(password);
		
		l.clickSubmit();
		
		Assert.assertEquals(baseUrl, expected);
 
	}

}
