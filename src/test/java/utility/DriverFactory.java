package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Config.configReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
WebDriver driver;


configReader obj = new configReader();


	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	
	public WebDriver Mydriver() throws IOException {
		
	String browsername= 	obj.init_prop("Browser");
		
		if (browsername.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
				
			tldriver.set(new ChromeDriver()); 	
			
		}else if (browsername.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();;
			tldriver.set(new FirefoxDriver()); 	
			
		}else if (browsername.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();;
			tldriver.set(new EdgeDriver()); 
			
			
		}else {
			System.out.println("Browser name is invalid");
		}
		
		getDriver().manage().window().maximize();
		
		return getDriver();
		
		
	}
	
	
	
	public WebDriver getDriver() {
		
		
		return tldriver.get();
	}
	
	
}
