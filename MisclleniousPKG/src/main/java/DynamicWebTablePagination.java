import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTablePagination {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		String text=driver.findElement(By.xpath(".//*[@class='alignR']//a")).getText();
		System.out.println(text);
		
	
		
		
		

	}

}
