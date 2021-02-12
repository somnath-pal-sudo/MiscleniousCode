package checkActionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAnddropOperaion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//v-sompa//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		
		WebElement srcElement=driver.findElement(By.id("box3"));
		WebElement targetElement= driver.findElement(By.id("box103"));
		
		Actions action= new Actions(driver);
		//action.clickAndHold(srcElement).moveToElement(targetElement).release().build().perform();
		action.dragAndDrop(srcElement, targetElement).build().perform();
	
	}

}
