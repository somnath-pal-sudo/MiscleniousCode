import org.openqa.selenium.WebDriver;

public abstract class MethodOverirdeConcept {
	String name;
	String title;
	WebDriver driver;
	String url;
	
	public MethodOverirdeConcept(String name, String title, WebDriver dvr,String url) {
		this.name=name;
		this.driver=dvr;
		this.title=title;
		this.url=url;
		
	}
	
	protected WebDriver driver() {
		return this.driver;
	}
	protected String name() {
		return this.name;
	}
	protected String url() {
		return this.url;
	}
	protected String title() {
		return this.title;
	}
	
	protected boolean isDisplayed() {
		return this.title.equalsIgnoreCase(this.driver.getTitle())&& this.title.equalsIgnoreCase(this.driver.getCurrentUrl());
	
	}

}
