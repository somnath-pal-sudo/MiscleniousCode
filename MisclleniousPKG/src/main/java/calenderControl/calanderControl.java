package calenderControl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calanderControl {
	public static  WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//v-sompa//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*/div[@id='dvfarecal']/input[@id='ddate']")).click();
		
		
		  Select select= new Select (driver.findElement(By.cssSelector(".main")));
		  select.selectByVisibleText("Feb 2021");
		 
		
		
		for (int x=6;x>=1;x--) {
			
			driver.findElement(By.xpath("//div[@class='month3']/img[@id='img2Nex']")).click();
			String month=driver.findElement(By.xpath("//div[@class='month-sec']/div[@id='dvprevious']")).getText();
			
			if(month.equals("June")) {
				driver.findElement(By.id("fst_2_01/06/2021"));
				break;
			}
			
			
			
			
			
		}
	}
}

		
		
		
	


