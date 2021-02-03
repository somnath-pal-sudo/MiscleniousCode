package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentreportsDemo {
	private static WebDriver driver=null;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlreporter= new ExtentHtmlReporter("extentreprts.html");
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		ExtentTest test1= extent.createTest("googleSearch Test","test to validate google search functionality");
		
		
		String projectpath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32-86 (3)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test1.log(Status.INFO, "startingtest cases");
		
		driver.get("https:\\google.com");
		test1.pass("navigated to the url");
		driver.findElement(By.name("q")).sendKeys("test");
		test1.pass("successfully input");
		
		/*
		 * driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 */test1.info("close successfully");
		
		driver.close();
		driver.quit();
		
		extent.flush();
		
		
		
	}

}
