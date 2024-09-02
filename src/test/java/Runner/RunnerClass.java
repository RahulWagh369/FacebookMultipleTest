package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
					features = "Folder",
	glue	 = "facebookloginWithMultipleTestData",
	plugin   = {"pretty" , "html:target/cucumber-reports.html"}
				
				)


public class RunnerClass {

}
