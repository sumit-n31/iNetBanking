package com.iNetBankingV1.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.iNetBankingV1.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig r = new ReadConfig();
	public String baseUrl = r.getUrl();
	public String expected = r.getExpected();
	public String userName = r.getUser();
	public String password = r.getPass();
	public static WebDriver driver;

	@Parameters("Browser")
	@BeforeMethod
	public void setUp(String br) {
		if (br.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", r.getchromePath());
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
