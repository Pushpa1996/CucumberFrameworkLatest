package Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {

	
	
	public String init_prop(String Key) throws IOException {
		
		String filename ="C:\\Users\\Deepak\\ecllipse\\Cucumber_Framework\\src\\test\\java\\Config\\sample.properties";
		
		File file = new File(filename);
		FileInputStream ip = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(ip);
		return prop.getProperty(Key);
		
		
	}
}
