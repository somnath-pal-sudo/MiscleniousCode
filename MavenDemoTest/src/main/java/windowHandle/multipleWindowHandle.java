package windowHandle;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("");
		String parentwin=driver.getWindowHandle();
		System.out.println("parent window is" + parentwin);
		driver.findElement(By.xpath(""));
		Set<String>allwindow=driver.getWindowHandles();
		int count=allwindow.size();
		
		for(String child:allwindow) {
			if(!parentwin.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.name(""));
				Thread.sleep(3000);
				driver.close();
				
			}
			driver.switchTo().window(parentwin);
			System.out.println("child window title is " + driver.getTitle());
		}
		
		

	}

}
