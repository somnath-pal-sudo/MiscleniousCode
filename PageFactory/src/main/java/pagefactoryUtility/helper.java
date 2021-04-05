package pagefactoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class helper {
	
	static WebDriver driver;
	
	
	public  static WebDriver startBrowser(String browsername, String url) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("IE")) {
			driver= new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		return driver;
		
	}

}
