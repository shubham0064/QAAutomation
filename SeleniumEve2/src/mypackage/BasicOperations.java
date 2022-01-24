package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicOperations {

	public static void main(String[] args) {
//
//		System.setProperty("webdriver.edge.driver", ".\\Executables\\msedgedriver.exe");
//		EdgeDriver driver1 = new EdgeDriver();
//		driver1.get("http://www.google.com");
//		System.out.println("Page source: " + driver1.getPageSource());
//		System.out.println("Current page title: " + driver1.getTitle());
//		System.out.println("Current page URL: " + driver1.getCurrentUrl());
//		driver1.close();
//
//		System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
//		FirefoxDriver driver2 = new FirefoxDriver();
//		driver2.get("http://www.google.com");
//		driver2.close();

//		System.setProperty("webdriver.ie.driver", ".\\Executables\\IEDriverServer.exe");
//		InternetExplorerDriver idriver = new InternetExplorerDriver();
//		idriver.close();    // browser doesn't close here

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		// driver.close();
	}

}
