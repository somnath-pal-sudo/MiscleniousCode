import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(IReporterImplement.class)

public class Listener {
	@Test
	@SuppressWarnings("deprecation")
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("q")).sendKeys("Somnath");;
		driver.findElement(By.name("btnK")).click();;
	}
	@Test
	public void testFail() {
		AssertJUnit.assertTrue(false);
		System.out.println("Fail");
	}
	
	

}
