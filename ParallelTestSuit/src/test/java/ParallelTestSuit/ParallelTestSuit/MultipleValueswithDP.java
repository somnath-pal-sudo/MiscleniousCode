package ParallelTestSuit.ParallelTestSuit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleValueswithDP {
	
	WebDriver driver;
	
	@DataProvider(name="test-data")
	public Object[][] datafun(){
		return new Object[][] {
			{"Selenium","Delhi"},{"QTP","Bangalore"},{"LoadRunner","Chennai"}
    	};
		}
	

@BeforeMethod
public void setup() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	
}

@Test(dataProvider="test-data")
public void search(String Kwd1, String kwd2) {
	
	WebElement txtBox = driver.findElement(By.xpath("//input[@name='q']"));
	  txtBox.sendKeys(Kwd1," ",kwd2);
	  Reporter.log("Keyword entered is : " +Kwd1+ " " +kwd2);
	  txtBox.sendKeys(Keys.ENTER);
	  Reporter.log("Search results are displayed.");
	
}

@AfterMethod
	public void burnDown(){
    	driver.quit();
	}
}


