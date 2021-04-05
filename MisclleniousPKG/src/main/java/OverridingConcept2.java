import org.openqa.selenium.WebDriver;

public class OverridingConcept2 extends MethodOverirdeConcept{

	public OverridingConcept2(String name, String title, WebDriver dvr, String url) {
		super("HomePage", "HomepageTitle", dvr, "https://google.com");
		
	}

}
