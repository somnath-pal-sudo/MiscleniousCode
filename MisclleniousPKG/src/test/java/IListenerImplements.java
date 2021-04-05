import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class IListenerImplements implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("OntestStart"+ result.getTestName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The name of the failed testcase is "+ result.getInstanceName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("result is "+ context.getName());
		// TODO Auto-generated method stub
		
	}

}
