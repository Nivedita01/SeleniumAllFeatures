package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveText {
	static WebDriver chromeDriver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeDriverPath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		
		chromeDriver.get("http://google.com");
		
		//for text wrapped inside open and closed tags
		System.out.println(chromeDriver.findElement(By.xpath("//div[@id='gbw']/div/div/div/div[1]/a")).getText());
		
		//for text inside an HTML tag as an attribute value
		System.out.println(chromeDriver.findElement(By.className("gNO89b")).getAttribute("value"));

	}

}
