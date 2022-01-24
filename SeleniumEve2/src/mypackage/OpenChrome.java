package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChrome {
	public static void main(String[] args) {



		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-debugging-port=9222");
		chromeOptions.addArguments("--no-sandbox");
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium download\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com");
		
		

	}

}
