package checkActionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickOperation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C://Users//v-sompa//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action= new Actions(driver);
		WebElement rightClick=driver.findElement(By.xpath(".//*/p/span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(rightClick).build().perform();
		 
		driver.findElement(By.xpath(".//*//ul[@class='context-menu-list context-menu-root']//li[2]/span")).click();//capture the alert
		System.out.println(driver.switchTo().alert().getText());//get the text of alert
		driver.switchTo().alert().accept();//close the alert box
	

	}

}
