package JSExecutorDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class highlightingBorder {
	public static void falsh(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 String bgcolor=element.getCssValue("backgroundColor");
		 for(int i=0;i<100;i++) {
			 changeColor("#000000",element,driver);
			 changeColor(bgcolor,element,driver);
		 }
		 
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor= '" + color + "'",element );
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
	
	}
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	
	}
	public static String getTitlebyJS(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String pgTitle=js.executeScript("return document.title;").toString();
		return pgTitle;
	
	
	
}
	public static void clickElement(WebElement element,WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		
}
	public static void generateAlert(String message,WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
		
}
	public static void refreshWindow(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	
	
}
	public static void scrollIntoView(WebElement element,WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	
	
}
}



