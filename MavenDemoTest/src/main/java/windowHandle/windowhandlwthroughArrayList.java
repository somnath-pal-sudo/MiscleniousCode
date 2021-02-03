package windowHandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlwthroughArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("");
		String parentwin=driver.getWindowHandle();
		System.out.println("parent window is" + parentwin);
		Set<String>allWindows=driver.getWindowHandles();
		ArrayList<String> tabs= new ArrayList<>(allWindows);
		driver.switchTo().window(tabs.get(2));
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		System.out.println("The parent window is " + driver.getTitle());
		

	}

}
