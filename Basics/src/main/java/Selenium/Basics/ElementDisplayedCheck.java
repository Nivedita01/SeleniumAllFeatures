package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayedCheck {

	static WebDriver chromeDriver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chromeDriverPath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		
		chromeDriver.get("http://google.com");
		
		boolean isDisplayedStatus = chromeDriver.findElement(By.id("gbqfbb")).isDisplayed();
		
		boolean isDisplayedFunctionStatus = isDisplayedFunction(By.id("gqfbb"));
		
		boolean findElementsFunctionStatus = findElementsFunction("//*[@id='gbqfbb']");
		
		System.out.println("Element displayed: "+isDisplayedStatus);
		System.out.println("Element displayed from isDisplayedFunction: "+isDisplayedFunctionStatus);
		System.out.println("Element displayed from findElementsFunction: "+findElementsFunctionStatus);
		
		
	}
	public static boolean isDisplayedFunction(By by){
		try {
				if(chromeDriver.findElement(by).isDisplayed()){
					return true;
				}
		} catch (Exception e) {
				return false;
		}
		return false;
		
	}
	
	public static boolean findElementsFunction(String element){
		if(chromeDriver.findElements(By.xpath(element)).size()>0){
			return true;
		}
		else
			return false;
	}

}
