package Selenium.Basics;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUsingProperties {

	static public String browser = null;
	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertiesFile.readProperties();
		configureBrowser();
		runTest();
		PropertiesFile.writeProperties();

	}
	
	public static void configureBrowser(){
			if(browser.contains("Chrome")){
				String chromeDriverProperty = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", chromeDriverProperty);
				driver = new ChromeDriver();
			}
		}
	
	public static void runTest(){
        driver.get("http://seleniumhq.org/");
        driver.quit();
	}
	

}
