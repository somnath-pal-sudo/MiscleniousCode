import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandlebrowserwindowPopup {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty(null, null);
		driver.get(null);
		
		String Pwindow=driver.getWindowHandle();
		
		Set<String>s1=driver.getWindowHandles();
		
		  Iterator<String>it=s1.iterator(); 
		  while(it.hasNext()) 
		  { 
			  String Cwindow=it.next();
			  
			  
			  if(!Cwindow.equalsIgnoreCase(Pwindow)) {
				  
				  driver.switchTo().window(Cwindow);
				  driver.switchTo().frame(driver.findElement(By.xpath(xpathExpression).get(0)));
				  System.out.println(Cwindow);
				  System.out.println(driver.getTitle());
				  driver.close();
				  
			  }
			  driver.quit();
		  }
		  
		  
		   
		 
		

	}

}
