package handleWebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oranageHRM_WT {
	public static  WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//v-sompa//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		
		int rowNumber=driver.findElements(By.xpath(".//*[@id='tableWrapper']/table/tbody/tr")).size();
		System.out.println(rowNumber);
		
		int statusCount=0;
		
		int rowcount=0;
		
		for(int i=0; i<=rowcount;i++) {
			WebElement status=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr["+i+"]/td[5]"));
			
			if(status.equals("Enabled")) {
				statusCount= statusCount+1;
				
			}
			
			System.out.println(statusCount);
			driver.close();
			
			
		}
		
		
		
		
		
		
		

	}

}
