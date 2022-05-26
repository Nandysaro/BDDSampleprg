package runners;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  publish=true,
  features="src//test//resources//samplefeatures//GooglePage.feature",
  glue = {"StepDef"},
  monochrome=true,
  plugin = {"pretty", 
//		  "html:target/reports/HtmlReport.html"
//       	  "usage:target/reports/UsageReport"
//	         "json:target/reports/JsonReport.json"
		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
  }
)
public class GooglePageRunner {

	}
