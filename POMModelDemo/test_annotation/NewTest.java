package test_annotation;

import org.testng.annotations.Test;

public class NewTest {
	
	
	@beforemethod
	public void setup()
	{
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", value);
		driver.get("https:\\www.google.com");
		
		
		
	}
  
}
