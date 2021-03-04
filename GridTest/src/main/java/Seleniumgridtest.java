import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Seleniumgridtest {

	public static void main(String[] args) throws MalformedURLException {
		
		//1.define desired capabilities
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		//2.chromeoption definition//
		ChromeOptions options= new ChromeOptions();
		options.merge(cap);
		
		String huburl="http://localhost:2020/wd/hub";
		WebDriver driver= new RemoteWebDriver(new URL(huburl),options);
		driver.get("https://www.google.com/");
		String title= driver.getTitle();
		System.out.println("print the title"+ title);
		

	}

}
