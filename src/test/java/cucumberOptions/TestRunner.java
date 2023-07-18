package cucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features"
		,glue="StepDefinitions"
		,monochrome=true,dryRun=true,stepNotifications=true,
		plugin= {"pretty","html:target/cucumber.html","json:target/cuckes.json","junit:target/cfile.xml"})
public class TestRunner {

}
