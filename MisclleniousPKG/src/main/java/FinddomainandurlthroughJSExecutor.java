import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinddomainandurlthroughJSExecutor {
	 static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		//driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
		//long starttime = System.currentTimeMillis();
		//js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		WebElement searchbutton=driver.findElement(By.xpath("//*[@name='q']"));
		
		js.executeAsyncScript("arguments[0].click();", searchbutton);
		js.executeScript("window.history.go(-1)");
		js.executeScript("window.location;", args)
		driver.navigate().to("http://www.facebook.com");
		driver.close();
		
		
		//System.out.println("Passed time: " + (System.currentTimeMillis() - starttime));	
		
		
		
		
		
		
		
		
		//Object domainname=js.executeScript("return document.domain;").toString();
		//System.out.println(domainname);
		/*
		 * Object url=js.executeScript("return document.url"); System.out.println(url);
		 * Object title=js.executeScript("return document.title");
		 * System.out.println(title);
		 * 
		 * js.executeScript("window.scrollBy(0,200)");
		 * js.executeScript("alert('Welcome to Guru99');");
		 * 
		 */
		
		
		
		

	}

}
