package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before(order=1)
	public void setup_app(Scenario sc)
	{
		System.out.println("launch amazon app");
		System.out.println(sc.getName());
	}
	@Before(order=2)
	public void db_setup()
	{
		System.out.println("set up db");
	}
	
	@After(order=1)
	public void tearDown()
	{
		System.out.println("close the db");
	}
	@After(order=2)
	public void tearDown_db()
	{
		System.out.println("close the browser");
	}
	
	@BeforeStep
	
	public void screenshot()
	{
		System.out.println("take thescreenshot");
	}
	
	@AfterStep
	
	public void refresh()
	{
		System.out.println("refresh the page");
	}
	
	

}
