package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\15192\\eclipse-workspace\\BDDcucumber\\src\\test\\java\\feature", glue= {"stepdefinition"},
plugin= {"pretty", "json:target/Htmlreports.json"}, monochrome=true, dryRun = true)

public class Testrunner {
	
	

}
