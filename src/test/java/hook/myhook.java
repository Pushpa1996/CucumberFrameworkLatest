package hook;



import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.DriverFactory;

public class myhook {
	
	WebDriver driver;
	
	DriverFactory df = new DriverFactory();
	
	
	

	@Before(order=0)
	
	public   void browser() throws IOException {
		 
	driver=df.Mydriver();
	}
	
	@After(order=0)
	public void closeBrowser(){
		driver.close();
	}
	
	
	
	@After(order=1)
	public void screenshot(Scenario  sc) {
		
		
		   if(sc.isFailed()) {
			
			String Screenshotname= sc.getName().replace(" ", "");
		
			byte[] sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcepath, "image/png", Screenshotname);
			
			
			
			
			
			
			
			
		}
		
	}
	
}
