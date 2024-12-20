package JSExecutorDemo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutorDemoall {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		
		
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath(".//div[@class='container']/ul/li/a[@href='/login']"));
		highlightingBorder.falsh(login, driver);//flashing element
		highlightingBorder.drawBorder(login, driver);//border element
		
		//take Screenshot//
		
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  File target= new
		  File("C://Users//v-sompa//Downloads//Screenshot");//directory not allowed
		  FileUtils.copyFile(src, target);
		 
		//capture o=title of the page//
		System.out.println(driver.getTitle());
		
		String title=highlightingBorder.getTitlebyJS(driver);
		System.out.println(title);
		
	//clicking any element//
		WebElement Joinnowforfree=driver.findElement(By.xpath(".//*/ul[@class='control-bar']/li[2]/a[@href='/signup']"));
		highlightingBorder.clickElement(Joinnowforfree, driver);
		highlightingBorder.generateAlert("this is a login alert", driver);
		Thread.sleep(2000);
		highlightingBorder.refreshWindow(driver);
		WebElement privacy=driver.findElement(By.xpath(".//*/div[@class='nav']/ul/li[7]/a[@href='/terms#privacy']"));
		highlightingBorder.scrollIntoView(privacy, driver);
		
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles") );
		for (String name: namesList) {
			System.out.println(name);
		}
		
		ArrayList<String> namesList2 = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles") );
		Iterator<String>it=namesList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	HashMap<String, String>hm= new HashMap<String,String>();
	hm.put("u1", "C");
	hm.put("u2", "C++");
	
	System.out.println(hm.get("u1"));
	System.out.println(hm.get("u2"));
	
Iterator<String>key=hm.keySet().iterator();
while(it.hasNext()) {
	String Key= it.next();
	String value= hm.get(Key);
	System.out.println(Key +"" +value);
	
}
Iterator<Entry<String,String>> capmap=hm.entrySet().iterator();
while(capmap.hasNext()) {
	Entry<String, String> map2= capmap.next();
	String value= hm.get(key);
	
	System.out.println(key + ""+ value);
	
	
	
}

	
		
		
		
		


	}
	

}
