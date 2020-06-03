package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendTextToElement {
	
	static WebDriver chromeDriver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chromeDriverPath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		
		chromeDriver.get("http://facebook.com");
		
		//sending text via sendKeys
		chromeDriver.findElement(By.cssSelector("input[name='email']")).sendKeys("Look 1");
		
		//sending text via JavaScript Executor
		JavascriptExecutor jse = (JavascriptExecutor) chromeDriver;
		jse.executeScript("document.getElementById('pass').setAttribute('value', 'Look 2')");
		
		chromeDriver.quit();
		
	}

}
