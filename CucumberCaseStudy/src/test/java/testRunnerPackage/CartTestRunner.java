package testRunnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	
	features = "features\\cart.feature",
    glue = {"stepDefinitions"}
	
)
public class CartTestRunner {
	
}
