import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class registrationTest {
	static WebDriver driver;
	
	@Test
	public void verifyRegistrationpage() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//v-sompa//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		driver= new ChromeDriver();
		RegistrationPage rpage= new RegistrationPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.get("https://www.mercurytravels.co.in/");
		WebElement modal= driver.findElement(By.xpath("//*[@id='modalPopup']/div/div/div[1]"));
		String modalbody= modal.getText();
		//driver.switchTo().activeElement();
		WebElement ok= driver.findElement(By.xpath("//button[contains(@class,'close')]//span"));
		ok.click();
		
		  rpage.custLink();
		  rpage.clickReg();
		  rpage.setFirstname("somnath");
		  rpage.setLastname("pal"); 
		  rpage.setEmail("pall.somnath2@gmail.com");
		  rpage.setPassword("somnath123"); 
		  rpage.setPhonenum("8093231232");
		  rpage.clickregBtn();
		  
		  //validation//
		  
		  if(driver.getPageSource().contains("Thank you for registartion"))
		  {
		  System.out.println("Registered");
		  
		  } 
		  else 
		  { 
			  System.out.println("not registered"); 
		  } 
		  driver.close();
		  
		 
		
		
		
		
		
		
		
	}

}
