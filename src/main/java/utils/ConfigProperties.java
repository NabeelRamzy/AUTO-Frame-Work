package utils; 

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {
	
	Properties properties;
	
	public ConfigProperties() {
		loadProperties();
	}

	private void loadProperties() {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("env.properties");
		properties = new Properties(); 
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
	
	public String getProperty(String Key) {
		if (Key != null) {
			 
		}else {
			return null;
		}
		return properties.getProperty(Key);
		
	}
	
	public long getNumProperty(String Key) {
		String value = getProperty(Key);
		if (value != null ) {
			String refindvalue = value.trim().replaceAll("[^0-9]", "");
			return Long.parseLong(refindvalue);
		}else
		return 0;
		
	}
	//public static void main(String[] args) {
	//	ConfigProperties configProperties = new ConfigProperties();
	//	String urlString = configProperties.getProperty("bowser");
	//	System.out.println(urlString);
	//	String urlString2 = configProperties.getProperty(null);
	//	System.out.println(urlString2);
	//	String urlString3 = configProperties.getProperty("abc");
	//	System.out.println(urlString3);
		
	//	long wait = configProperties.getNumProperty("pageloadTime");
	//	System.out.println(wait);
	//}
}
