import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureToolTip {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement tooltip= driver.findElement(By.xpath(".//input[@id='age']"));
		String tooltipmsg=tooltip.getAttribute("title");
		System.out.println(tooltipmsg);
		
		
		
		
		
		
		
		
		
		

	}

}
