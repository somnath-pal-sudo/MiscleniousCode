package checkActionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOveroperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//v-sompa//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		//Thread.sleep(5000);
		
		
		
		//more-->ActivitesandTours-->search-->select any option
		
		Actions act= new Actions(driver);
		WebElement search=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[2]/div/div/nav/ul/li[10]/a ']"));
		WebElement toursandActivity=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[2]/div/div/nav/ul/li[10]/div/a[1]"));
		
		
		act.moveToElement(search).build().perform(); //mouseoverAction on Search tab
		act.moveToElement(toursandActivity).click().build().perform();// click on toursandActivities button
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
