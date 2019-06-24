package testRunnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	
	features = "features\\carticon.feature",
    glue = {"stepDefinitions"},
	plugin = {"pretty", "json:target\\carticontest.json"}
)
public class CarticonRunner {

}
