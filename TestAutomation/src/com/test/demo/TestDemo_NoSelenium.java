package com.test.demo;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestDemo_NoSelenium {
	
	WebDriver driver;
	
		@BeforeSuite
		 public void setup() {
			System.out.println("enter system property for chrome");
			
		}
		
		
		@BeforeClass
		
		public void launcebrowser() {
			System.out.println("launch chrome browser");
		}
		
		@BeforeMethod
		
		public void enterURL() {
			System.out.println("enter the Url");
		}
		
		@BeforeTest
		
		public void login() {
			System.out.println("login method");
		}
		
		@Test
		 public void googletitle() {
			
			System.out.println("google title test");
		}
		
		@AfterMethod
		 public void logout() {
			System.out.println("log out from app");
		}
		
		@AfterTest
		
		public void deleteAllcookies() {
			System.out.println("delete all cookies");
		}
		
		@AfterClass
		
		public void closebrowser() {
			
			System.out.println("close the browser");
		}
		
		@AfterSuite
		
		public void teardown() {
			System.out.println("close the driver and generate the report");
		}
		
		
		
	}


