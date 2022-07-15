package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//Features"},
		glue="StepDefeniations",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				"html:test-output"}
		
		)

public class TestRunner {

	
	
}
