package PageFactory.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPageNewPF {
	
	WebDriver driver;
	
	public  loginPageNewPF(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@FindBy(id="user_login")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID,using="user_pass")
	@CacheLookup
	WebElement pasword;
	
	@FindBy(id="wp-submit")
	@CacheLookup
	WebElement login;
	
	@FindBy(how=How.LINK_TEXT,using="Lost your password?")
	@CacheLookup
	WebElement forget_password;

	public void login(String uid, String Pwd) {
		
		username.sendKeys(uid);
		pasword.sendKeys(Pwd);
		login.click();
		
		
	}
	
	

}
