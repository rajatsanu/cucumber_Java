package testClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		strict = true,
		monochrome = true, 
		features = "src/test/resources/features",
		plugin = { "pretty","html:target/site/cucumber-pretty","rerun:target/rerun.txt","json:target/cucumber1.json" },
		glue = "src/main/java/stepDefination",
		tags={"@Regression,@TestngScenario"})

public class TC_01_Runner extends AbstractTestNGCucumberTests {

	
}
