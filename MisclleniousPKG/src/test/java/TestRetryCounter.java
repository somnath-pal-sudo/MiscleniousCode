import org.testng.Assert;
import org.testng.annotations.Test;
import static java.lang.annotation.RetentionPolicy.CLASS;

public class TestRetryCounter {
	
	 
	 @Test
	 @Retention(3)
	 public void Test1()
	 {
	 Assert.assertEquals(false, true);
	 }
	 
	 @Test
	 @Retention(3)
	 public void Test2()
	 {
	 Assert.assertEquals(false, true);
	 }

}
