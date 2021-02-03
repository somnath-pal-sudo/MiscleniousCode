package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/AppFeatures/billing.feature"},
		glue= {"stepdefinitions", "MyHooks"},
		plugin={"pretty", "json:target/MyReports/reports.json",
				 "junit:target/MyReports/reports.xml"},
		tags="not @prod",
		publish=true,
		monochrome= true,// proper alignment
		dryRun=true,
		strict= true//Deprecated
		
		
		)

public class billingrunner {

}
