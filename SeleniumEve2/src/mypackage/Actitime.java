package mypackage;

import org.openqa.selenium.edge.EdgeDriver;

public class Actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", ".\\Executables\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://demo.actitime.com");

		String PageSource = driver.getPageSource();
		System.out.println("PageSource: " +PageSource);
		System.out.println(" ");
		int SourceLength = driver.getPageSource().length();
		

		String PageTitle = driver.getTitle();
		System.out.println("Page Title: " +PageTitle);
		
		int TitleLength = driver.getTitle().length();
		System.out.println("Page Title Length: " +TitleLength);
		System.out.println("Page Source Length: " +SourceLength);

		String CurrentPageURL = driver.getCurrentUrl();
		System.out.println("Current Page URL: " + driver.getCurrentUrl());

		if (CurrentPageURL.equals("https://demo.actitime.com/login.do")) {
			System.out.println("Correct page opened");
		} else {
			System.out.println("Incorrect page opened");
		}

		driver.close();

	}

}
