package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\Deepak\\ecllipse\\Cucumber_Framework\\src\\test\\resources\\features\\sample.feature",
		glue = {"StepDefination","hook"},
		monochrome=true,
				plugin = {"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"}
		,publish=true
		
		)
public class RunnerTest {

}
