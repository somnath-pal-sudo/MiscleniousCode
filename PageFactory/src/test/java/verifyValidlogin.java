import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageFactory.PageFactory.loginPageNewPF;
import pagefactoryUtility.helper;

public class verifyValidlogin {
	
	@Test
	public void checkValiduser() {
		
		
		WebDriver driver=helper.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");
		loginPageNewPF login_page=PageFactory.initElements(driver, loginPageNewPF.class);
		login_page.login("admin", "demo123");
		
		
		
		
		
		
		
		
		
		
	}

}
