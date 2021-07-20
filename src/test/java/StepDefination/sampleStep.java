package StepDefination;

import java.io.IOException;

import Config.configReader;
import io.cucumber.java.en.When;
import utility.DriverFactory;
import utility.keyword;

public class sampleStep {
	
	DriverFactory df = new DriverFactory();
	
	
	keyword key = new keyword(df.getDriver());
		
	@When("user enter url")
	public void user_enter_url() throws IOException {
		
	    
	}
	@When("user enter password {string}")
	public void user_enter_value_in_text_field(String password) throws IOException {
		
		key.sendkey("password", password);
	   
	}
	@When("user click sumbit button")
	public void user_click_sumbit_button() throws IOException {
		
		
		key.click("loginbutton");
		
	    
	}

	
	
}
