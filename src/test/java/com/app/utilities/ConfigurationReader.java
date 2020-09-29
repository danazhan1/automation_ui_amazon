package com.app.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	
	// create Properties Object var
	 private static Properties properties;

	    static {

	        try {
	            String path = "configuration.properties";
	            FileInputStream input = new FileInputStream(path);

	            properties = new Properties();
	            properties.load(input);

	            input.close();
	        } catch (Exception e) {
	            e.printStackTrace();

	        }
	    }

	    public static String get(String keyName) {
	        return properties.getProperty(keyName);
	    }
	
	
	

}
