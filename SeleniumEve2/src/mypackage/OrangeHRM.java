package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		String PageTitle = driver.getTitle();
		System.out.println("Page Title: " +PageTitle);
		
		int TitleLength = driver.getTitle().length();
		System.out.println("Page Title Length: " +TitleLength);
		
		String CurrentPageURL = driver.getCurrentUrl();
		System.out.println("Current Page URL: " + driver.getCurrentUrl());

		if (CurrentPageURL.equals("https://opensource-demo.orangehrmlive.com/")) {
			System.out.println("Correct page opened");
		} else {
			System.out.println("Incorrect page opened");
		}
		
		WebElement userNameInputField=driver.findElement(By.id("txtUsername"));
		userNameInputField.sendKeys("Admin");
		
		WebElement passwordInputField=driver.findElement(By.id("txtPassword"));
		passwordInputField.sendKeys("admin123");
		
		WebElement loginButton=driver.findElement(By.id("btnLogin"));
		loginButton.click();
		
		driver.close();
	}

}
