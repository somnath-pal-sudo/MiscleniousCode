package JSExecutorDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutorDemo1 {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		
		
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath(".//*/div[@class='container']/ul/li/a[@href='/login']"));
		//highlightingBorder.falsh(login, driver);//flashing element
		highlightingBorder.drawBorder(login, driver);//border element
		
		//take Screenshot//
		/*
		 * File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * 
		 * File target= new
		 * File("C://Users//v-sompa//Downloads//Screenshot");//directory not allowed
		 * FileUtils.copyFile(src, target);
		 */
		//capture o=title of the page//
		//System.out.println(driver.getTitle());
		
		String title=highlightingBorder.getTitlebyJS(driver);
		System.out.println(title);
		

	}
	

}
