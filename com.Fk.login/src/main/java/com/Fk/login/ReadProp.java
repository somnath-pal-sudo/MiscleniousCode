package com.Fk.login;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop= new Properties();
		 FileInputStream ip= new FileInputStream("C:\\Users\\v-sompa\\eclipse-workspace\\com.Fk.login\\config.properties");
		 prop.load(ip);
		 
		 System.out.println(prop.getProperty("name"));
		 System.out.println(prop.getProperty("Age"));
		 String browsername= prop.getProperty("browser");
		 
		 
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webDriver.chrome.driver","C:\\Users\\v-sompa\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http:\\www.google.com");
		}

	}
}
