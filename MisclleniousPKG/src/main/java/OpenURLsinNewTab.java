import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class OpenURLsinNewTab {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		//WebDriver newtab=driver.switchTo().window(WindowType.WINDOW);
		String url="https://stackoverflow.com/questions/32786456/how-to-open-multiple-windows-using-selenium-webdriver";
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.open(arguments[0])", url);
		
		
		
		
		

	}

}
