package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/Features"
		,glue="StepDefinitions"
		,monochrome=true,dryRun=true,
		plugin= {"pretty"})
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
