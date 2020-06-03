package Selenium.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//invoke a chrome browser
		String chromeDriverPath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("http://google.com");
		System.out.println(chromeDriver.getCurrentUrl());
		chromeDriver.navigate().back();
		chromeDriver.navigate().forward();
		chromeDriver.navigate().refresh();
		
	}

}
