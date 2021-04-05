import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;



public class IRetryAnalyzerImplement implements IRetryAnalyzer{
	
	int counter=10;

	@Override
	public boolean retry(ITestResult result) {
		
		Retention[] annotation=result.getMethod().getConstructorOrMethod().getMethod().getAnnotationsByType( Retention.class);
		if((annotation != null) && (counter < annotation.length)){
			counter++;
			return true;
			
		}
		
		
		return false;
	}

}
