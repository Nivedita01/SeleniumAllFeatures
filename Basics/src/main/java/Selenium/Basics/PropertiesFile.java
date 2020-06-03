package Selenium.Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	static Properties prop = new Properties();
	public static void main(String args[]){
		readProperties();
		writeProperties();
	}
	
	public static void readProperties(){

		try {
			InputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"//config//config.properties");
			prop.load(inputStream);
			TestUsingProperties.browser = prop.getProperty("browser");
		}
		catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static void writeProperties() {
		try{
			OutputStream outputStream = new FileOutputStream(System.getProperty("user.dir")+"//config//config.properties");
			prop.setProperty("name", "Tester");
			prop.store(outputStream, "Writing to file");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
