package checkActionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizableOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//v-sompa//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		WebElement cornerArrow=driver.findElement(By.xpath(".//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		Actions action= new Actions(driver);
		action.moveToElement(cornerArrow).dragAndDropBy(cornerArrow, 100,140).build().perform();
		
		
		
		
		
		

	}

}
