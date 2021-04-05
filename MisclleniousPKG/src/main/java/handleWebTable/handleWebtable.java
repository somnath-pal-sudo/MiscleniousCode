package handleWebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleWebtable {
	
	public static  WebDriver driver;
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//v-sompa//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa?");
		
		int cols=driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th")).size();
		int rows=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")).size();
		
		System.out.println(cols);
		System.out.println(rows);
		
		
		  for (int i=2;i<=rows;i++)
		  { 
			  for(int j=1;j<=cols;j++)
		  {
		  
		  String text=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]")).getText(); 
		  System.out.println(text);
		  
		  } 
	 }

	}

}
