import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderOperationinJquery {

	public static void main(String[] args) {
		
		//WebDriverManager().chromeDriver().setup();
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/jQuery-Custom-Scrollbar-Plugin-malihu/");
		driver.manage().window().maximize();
		WebElement slider= driver.findElement(By.xpath(".//div[@class='mCSB_scrollTools']//descendant::a[@class='mCSB_buttonUp']"));
		System.out.println(slider.getLocation());
		System.out.println(slider.getSize());
		
		Actions action= new Actions(driver);
		action.dragAndDropBy(slider, 26, 181).perform();
		System.out.println(slider.getLocation());
		System.out.println(slider.getSize());
		

	}

}
