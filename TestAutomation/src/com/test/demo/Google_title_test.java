package com.test.demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class Google_title_test {
	
	WebDriver driver;
	
	@Test(priority=0,enabled=false)
	
	public void google_tiltle_test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32-86 (3)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
	String Test_title=driver.findElement(By.xpath("//*[@class='RNNXgb']")).getText();
		String title= "Google";
		if (Test_title== title) {
			System.out.println("test is pass");
		}
		else {
			System.out.println("test is fail");
		}
	}
	

	
	
		
	}
	
	


