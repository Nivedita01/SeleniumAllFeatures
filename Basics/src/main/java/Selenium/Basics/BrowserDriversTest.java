package Selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriversTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke a chrome browser
		String chromeDriverPath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver chromeDriver = new ChromeDriver();

		
		//invoke a firefox browser
		String firefoxDriverPath = System.getProperty("user.dir")+"//drivers//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
		WebDriver firefoxDriver = new FirefoxDriver();
	}

}
