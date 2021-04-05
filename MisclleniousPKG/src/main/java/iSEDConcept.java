import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iSEDConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/register/");
		Boolean b1=driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println(b1);//true
		Boolean b2=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(b2);
		Boolean b3=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(b3);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Boolean b4=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(b4);
		
		
		
		
		

	}

}
