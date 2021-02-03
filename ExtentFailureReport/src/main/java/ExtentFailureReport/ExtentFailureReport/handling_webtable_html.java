package ExtentFailureReport.ExtentFailureReport;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_webtable_html {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32-86 (3)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		/*
		 * //*[@id="customers"]/tbody/tr[2]/td[1] //*[@id="customers"]/tbody/tr[3]/td[1]
		 * //*[@id="customers"]/tbody/tr[4]/td[1] //*[@id="customers"]/tbody/tr[5]/td[1]
		 * 
		 */
		/*
		List<WebElement>ls_rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount= ls_rows.size();
		System.out.println("total no.of rows " + rowCount);
		
		
		String beforeXpath="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for(int i=2;i<=rowCount;i++) {
			String Xpath= beforeXpath+i+afterXpath;
			WebElement element=driver.findElement(By.xpath(Xpath));
			System.out.println(element.getText());
			
			if(element.getText().equals("Island Trading")) {
				System.out.println("company name " + element.getText() +" is found" +(i-1));
				break;
			}
			
			
				}
		String afterxpathcontact="]/td[2]";
		for(int i=2;i<=rowCount;i++) {
			String Xpath= beforeXpath+i+afterxpathcontact;
			WebElement element=driver.findElement(By.xpath(Xpath));
			System.out.println(element.getText());
			
			if(element.getText().equals("Island Trading")) {
				System.out.println("company name " + element.getText() +" is found" +(i-1));
				break;
			
			
		}
			//*[@id="customers"]/tbody/tr[1]/th[2]
			//*[@id="customers"]/tbody/tr[1]/th[1]
			//*[@id="customers"]/tbody/tr[1]/th[3]
*/			
			String columnbeforexpath="//*[@id='customers']/tbody/tr[1]/th[";
			String colunaferxpath="]";
			 List<WebElement>ls_col=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
			 int col_count= ls_col.size();
			 System.out.println(col_count);
			 

	}

}

