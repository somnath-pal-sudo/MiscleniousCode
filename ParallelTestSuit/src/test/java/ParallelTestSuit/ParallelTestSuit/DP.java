package ParallelTestSuit.ParallelTestSuit;

import org.testng.annotations.DataProvider;

public class DP {
	
	@DataProvider(name="testdata")
	
	public static Object [][]dataprovfun(){
		return new Object[][] {
			{"Lambda Test"},{"Automation"}};
		
	}
	

}
	

