package mypackage;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Google {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

		String psource = driver.getPageSource();
		System.out.println("Page Source: " + psource);

		System.out.println(" ");
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currenturl);

		driver.close();
	}

}
