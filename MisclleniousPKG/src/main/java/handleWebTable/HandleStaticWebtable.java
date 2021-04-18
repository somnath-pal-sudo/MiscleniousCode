package handleWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticWebtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		Dimension d= new Dimension(1024, 750);
		driver.manage().window().setSize(d);
		//driver.manage().window().maximize();
		
		
		driver.get("https://www.selenium.dev/downloads/");
		int row=driver.findElements(By.xpath("//*[@class='data-list']/tbody/tr")).size();
		int col= driver.findElements(By.xpath("//*[@class='data-list']/thead/tr/th")).size();
		System.out.println(row);
		System.out.println(col);
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				
				String data= driver.findElement(By.xpath("//*[@class='data-list']//tr["+i+"]/td["+j+"]")).getText();
				System.out.println(data);
				if(data.equalsIgnoreCase("java")) {
					String v= driver.findElement(By.xpath("")).getText();
					
				}
			}
		}
		driver.quit();

	}

}
