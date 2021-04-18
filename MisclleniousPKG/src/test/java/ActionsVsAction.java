import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement features= driver.findElement(By.xpath("//a[@title='Women']"));
		Actions act= new Actions(driver);
		//act.moveToElement(features).perform();
		//act.moveToElement(features).build().perform();
		Action ac2=act.moveToElement(features).build();
		ac2.perform();
		
		
		

	}

}
