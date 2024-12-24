package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//Articles.feature",
		monochrome=true,
		glue="stepsdeffi",
		plugin= {"pretty",
				"html:target/reports/HtmlReport.html",
				
		}

		)
public class Test_Runners extends AbstractTestNGCucumberTests {

}

