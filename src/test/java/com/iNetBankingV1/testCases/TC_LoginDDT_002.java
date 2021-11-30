package com.iNetBankingV1.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iNetBankingV1.pageObject.LoginPage;
import com.iNetBankingV1.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginDDT_002 extends BaseClass {
	@Test(dataProvider = "LoginData")
	public void loginDDT(String user,String Password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		driver.get(baseUrl);
		lp.signIn();
		
		lp.setUser(user);
		
		lp.conti();
		
		lp.setPassword(Password);
		
		Thread.sleep(200);	
		
		lp.clickSubmit();
		
		String expected = driver.findElement(By.cssSelector("div#image-captcha-section>div>h4")).getText();

		boolean res = expected.equalsIgnoreCase("Enter the characters you see");
		
		if(res==true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			
		}

	}

	

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/iNetBankingV1/testData/LoginData.xls";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colnum = XLUtils.getCellCount(path,"Sheet1", rownum);
		System.out.println(colnum);
		System.out.println(rownum);
		String[][] logindata = new String[rownum][colnum];
		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colnum; j++) {
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}

		}
		return logindata;

	}
}
