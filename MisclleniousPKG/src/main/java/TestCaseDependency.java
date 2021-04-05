import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseDependency {
	
	
	
	@Test(successPercentage = 60, invocationCount = 3)
	public void startup() {
		
		Assert.assertEquals(10, 20);
		System.out.println("start application");
		
	}
	@Test(dependsOnMethods="startup")
	public void login() {
		System.out.println("login to app");
		
	}
	@Test(dependsOnGroups="testseen")
	public void logout() {
		System.out.println("logout from the app");
	}

}
