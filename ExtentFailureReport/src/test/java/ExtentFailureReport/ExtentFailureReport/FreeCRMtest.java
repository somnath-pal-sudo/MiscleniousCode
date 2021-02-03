package ExtentFailureReport.ExtentFailureReport;

import java.io.File;
import java.io.IOException;
//import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.*;
//import org.apache.tools.ant.util.FileUtils;
import org.apache.commons.io.FileUtils;

//import org.apache.tools.ant.util.FileUtils;
//import org.apache.*;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;

public class FreeCRMtest {
	
	static WebDriver driver=null;
	public ExtentReports extent;
	public ExtentTest logger;
	//public FileUtils copyFile;
	
	
	  @BeforeTest public void setExtent() {
		  String projectpath= System.getProperty("user.dir");
		  extent.setSystemInfo("HostName", "Somnath-PC");
		  extent.setSystemInfo("test", "qa env");
		  	
	  }
	  
	  @AfterTest
	   public void endReport() {
		  extent.flush();
		  //extent.close();
	  }
	 public static String getScreenShot(WebDriver driver, String screenshot) throws IOException {
		 String dateName= new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		 TakesScreenshot ts= (TakesScreenshot)driver;
		 File srcFile= ts.getScreenshotAs(OutputType.FILE);
		 String destfile= System.getProperty("user.dir")+"/failedtstscreenshot/"+ dateName+".png";
		 File finaldestination= new File(destfile);
		 FileUtils.copyFile(srcFile, finaldestination);
		 
		 return destfile;

		 
		 
	 }
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-sompa\\Downloads\\chromedriver_win32-86 (3)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://freecrm.co.in/");
		
		
	}
	
	@Test(order=0)
	public void crmtitletest() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
	@AfterMethod
	
	public void tearDown(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			logger.log(Status.FAIL, "test case fail is "+ result.getName());
			logger.log(Status.FAIL, "test case fail is "+ result.getThrowable());
			String Screenshotname= FreeCRMtest.getScreenShot(driver, result.getName());
			logger.log(Status.FAIL, (Markup) logger.addScreencastFromPath(Screenshotname));
			 
		}
		else if(result.getStatus()== ITestResult.SKIP){
			logger.log(Status.SKIP, "test is skip" + result.getName());
			
		}
		//extent.flush();
		
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
