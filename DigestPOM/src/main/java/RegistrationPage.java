import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
	WebDriver driver;
	
	By custLogin= By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]");
	By Register= By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[1]/a");
	By firstname=By.name("first_name");
	By lastname=By.name("last_name");
	By email=By.xpath("//*[@id='acc_user_email']");
	By password=By.xpath("//*[@id='acc_user_password']");
	By cnfpwd=By.name("passconf");
	By mob= By.name("mobile_no");
	By regbtn=By.xpath("//*[@id='modalUserLogin']/div/div/div[2]/form/button");
	By clickReg=By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]");
	
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void custLink() {
		driver.findElement(custLogin).click();
	}
	
	public void setFirstname(String fname) {
		driver.findElement(firstname).sendKeys(fname);
		
	}
	public void setLastname(String lname) {
		driver.findElement(lastname).sendKeys(lname);
		
	}
	public void setPhonenum(String ph) {
		driver.findElement(mob).sendKeys(ph);
		
	}
	public void setEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
		
	}
	public void setPassword(String pw) {
		driver.findElement(password).sendKeys(pw);
		
	}
	public void setcnfPassword(String cpw) {
		driver.findElement(cnfpwd).sendKeys(cpw);
		
		
	}
	public void clickregBtn() {
		driver.findElement(regbtn).click();
		
		
	}
	public void clickReg() {
		driver.findElement(clickReg).click();
		
		
	}
	

}
