package com.iNetBankingV1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Confiiguratiions/config.Properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getUrl() {
		String url = pro.getProperty("baseUrl");
		return url;

	}
	
	public String getUser() {
		String user = pro.getProperty("userName");
		return user;

	}
	
	public String getPass() {
		String pass = pro.getProperty("password");
		return pass;
	}
	
	public String getchromePath() {
		String chromePath = pro.getProperty("chromePath");
		return chromePath;
	}
	
	public String getExpected() {
		String exp = pro.getProperty("expected");
		return exp;

	}
	public String getedgePath() {
		String edgePath = pro.getProperty("edgePath");
		return edgePath;
	}
	public String getfirePath() {
		String firePath = pro.getProperty("firePath");
		return firePath;
	}

}
