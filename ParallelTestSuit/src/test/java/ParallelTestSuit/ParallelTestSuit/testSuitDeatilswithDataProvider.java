package ParallelTestSuit.ParallelTestSuit;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testSuitDeatilswithDataProvider {
	
	WebDriver driver;
	
	
	/*
	 * @BeforeClass
	 * 
	 * @DataProvider(name="testdata") public Object[][] dataprovfun(){ return new
	 * Object[][] { {"LambdaTest"},{"automation"} }; }
	 */
	
	@BeforeMethod
	 public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	}
	
	@Test(dataProvider="testdata",dataProviderClass=DP.class)
	
	public void search(String keyword) {
		
		WebElement txtBox= driver.findElement(By.xpath("//input[@name='q']"));
		txtBox.sendKeys(keyword);
		Reporter.log("keyword is" + keyword);
		txtBox.sendKeys(Keys.ENTER);
		Reporter.log("Searchword is ");
		
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	
}
