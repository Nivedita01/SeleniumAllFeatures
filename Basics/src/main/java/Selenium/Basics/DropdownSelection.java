package Selenium.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//invoke a chrome browser
				String chromeDriverPath = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", chromeDriverPath);
				WebDriver chromeDriver = new ChromeDriver();
				
				chromeDriver.get("http://hotels.com");
				
				WebElement adultsSelection = chromeDriver.findElement(By.id("qf-0q-room-0-adults"));
				
				Select adultsSelect = new Select(adultsSelection);
				adultsSelect.selectByIndex(10);
				Thread.sleep(2000);
				adultsSelect.selectByValue("20");
				Thread.sleep(2000);
				adultsSelect.selectByVisibleText("15");
				Thread.sleep(2000);
				
				chromeDriver.quit();
	}

}
