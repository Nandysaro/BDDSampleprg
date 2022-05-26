package runners;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features="src//test//resources//samplefeatures//Login.feature",
		glue= {"StepDef"},
		monochrome=true
		
		)
public class LoginRunner {

}
