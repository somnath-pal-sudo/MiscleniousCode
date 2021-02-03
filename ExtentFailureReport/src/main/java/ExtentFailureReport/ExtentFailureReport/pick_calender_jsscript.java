package ExtentFailureReport.ExtentFailureReport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pick_calender_jsscript {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32-86 (3)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement dateval= driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String date="30-12-2017";
		selectDatebyJSScript(dateval,date,driver);

	}
	
	public static void selectDatebyJSScript(WebElement element, String dateval, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
		
		
	}

}
