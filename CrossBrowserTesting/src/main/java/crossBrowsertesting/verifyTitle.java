package crossBrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class verifyTitle {
	
	public WebDriver driver=null;
	
	@Test
	@Parameters("browsers")
	
	public void verifypagetitle(String browserName) {
		
		
		if(browserName.equalsIgnoreCase("fiefox"))
			driver= new FirefoxDriver();
		
		else if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32-86 (3)\\chromedriver.exe");
			driver= new ChromeDriver();
			
			
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		System.out.println("Window title is " + driver.getTitle());
		driver.quit();

	}

}
