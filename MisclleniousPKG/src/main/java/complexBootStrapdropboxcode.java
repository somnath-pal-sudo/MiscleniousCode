import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class complexBootStrapdropboxcode {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/#");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.findElement(By.id("dropdownMenuButton")).click();
		List<WebElement>list=driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			/*
			 * if(list.get(i).getText().contains("Action")) { list.get(i).click(); break; }
			 */
			
			
		}

	}

}
