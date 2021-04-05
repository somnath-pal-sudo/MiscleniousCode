package checkActionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderOperation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//v-sompa//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath(".//*[@id='slider']/span"));
		
		Actions action=new Actions(driver);
		action.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();

	}
}
