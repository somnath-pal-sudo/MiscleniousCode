import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestionDropDown2Google {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium");
		List<WebElement> ls=driver.findElements(By.xpath("//li[contains(@class,'sa_sg')]//span"));
		
		System.out.println(ls.size());
		for(WebElement i: ls) {
			
			if(i.getText().contains("download"))
			{
				i.click();
			}
				
			}
		}
	
		
		
		

	}


