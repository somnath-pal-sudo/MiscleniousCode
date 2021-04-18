import org.testng.annotations.BeforeSuite;

public class AnnotationSequence {
	
	@BeforeSuite
	public void bs() {
		System.out.println("before suit");
	}
	@AfterSuite
	public void bs() {
		System.out.println("before suit");
	}
	
	

}
