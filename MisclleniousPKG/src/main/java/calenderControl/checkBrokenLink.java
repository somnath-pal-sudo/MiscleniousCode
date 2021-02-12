package calenderControl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBrokenLink {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//initiate the driver
		
		System.setProperty("webdriver.chrome.driver", "C://Users//v-sompa//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://contentmarketinginstitute.com/education/white-paper-library/");
		//Thread.sleep(5000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0; i<=links.size();i++) {
			
			
			//by using href attribute we can get url of the required link
			
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
			URL link= new URL(url);
			
			//create connection using URL object and httpURLConnection Method
			
			HttpURLConnection httpcon= (HttpURLConnection)link.openConnection();
			
			//Thread.sleep(2000);
			
			httpcon.connect();
			int responseCode=httpcon.getResponseCode();
			
			if(responseCode>=400) {
				System.out.println("Print the Broken URL" + url);
			}
			else
			{System.out.println("Valid URL" + url);}
	
		}
	}
}
