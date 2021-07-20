package utility;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Config.configReader;
import hook.myhook;
import io.github.bonigarcia.wdm.WebDriverManager;

public class keyword{
	
	public WebDriver driver;
	

	public keyword(WebDriver currentdriver) {
		this.driver= currentdriver;
}


	configReader  cfg =  new configReader();
	
	
	
	 public  WebElement locatortype(String value) throws IOException {
		 WebElement element = null;
		 
		String Locator= cfg.init_prop(value);
	    String[] ar=	Locator.split(",");
		
		String locatortype= ar[0];  
		String locatorValue= ar[1];
		
		
		if(locatortype.equalsIgnoreCase("xpath")) {
			element=driver.findElement(By.xpath(locatorValue));
		} else if(locatortype.equalsIgnoreCase("id")) {
			element=driver.findElement(By.id(locatorValue));
		}else if(locatortype.equalsIgnoreCase("classname")) {
			element=driver.findElement(By.className(locatorValue));
		}else if(locatortype.equalsIgnoreCase("name")) {
			element=driver.findElement(By.name(locatorValue));
		}else if(locatortype.equalsIgnoreCase("linktext")) {
			element=driver.findElement(By.linkText(locatorValue));
		}else if(locatortype.equalsIgnoreCase("partialLinkText")) {
			element=driver.findElement(By.partialLinkText(locatorValue));
		}else {
			System.out.println("Locator invalid");
		}
		
		return element;		 	 
	 }
	
	 
	 
	 
	 public void click(String key) throws IOException {
		 
		 WebElement element= locatortype(key);
		 element.click(); 
	 }
	 
	 
	 public void sendkey(String Key  ,String text) throws IOException {
		 
		 WebElement element= locatortype(Key); 
		 element.sendKeys(text);
		 
	 }
	 
	 
	 
	
	
	
	
	
	

	
	










}
