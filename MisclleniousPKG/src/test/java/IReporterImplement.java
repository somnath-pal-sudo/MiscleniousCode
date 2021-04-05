import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class IReporterImplement implements IReporter {

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		// TODO Auto-generated method stub
		
		for(ISuite suit: suites) {
			String suitName=suit.getName();
			Map<String,ISuiteResult>suiteResult=suit.getResults();
			for(ISuiteResult sr:suiteResult.values()) {
				ITestContext tc=sr.getTestContext();
				System.out.println(tc.getName()+tc.getOutputDirectory());
				System.out.println(tc.getPassedTests()+""+tc.getFailedTests());
				System.out.println(tc.getSkippedTests()+""+ tc.getFailedTests()+""+ tc.getSuite());
				
			}
		}
		
	}

}
