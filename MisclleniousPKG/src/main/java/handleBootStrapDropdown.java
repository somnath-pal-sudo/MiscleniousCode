import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBootStrapDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-info btn-sm dropdown-toggle')]")).click();
		List<WebElement> dropdowns=driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//li//label"));
		//System.out.println(dropdowns.size());
		for(int i=0;i<dropdowns.size();i++) {
			
			System.out.println(dropdowns.get(i).getText());
			if(dropdowns.get(i).getText().contains("HTML")) {
				dropdowns.get(i).click();
				break;
			}
			
		}
		
		

	}

}
