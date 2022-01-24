package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String PageTitle = driver.getTitle();
		System.out.println("Page Title: " + PageTitle);

		int TitleLength = driver.getTitle().length();
		System.out.println("Page Title Length: " + TitleLength);

		String CurrentPageURL = driver.getCurrentUrl();
		System.out.println("Current Page URL: " + driver.getCurrentUrl());

		if (CurrentPageURL.equals("https://demosite.executeautomation.com/Login.html")) {
			System.out.println("Correct page opened");
		} else {
			System.out.println("Incorrect page opened");
		}

		WebElement userNameInputField = driver.findElement(By.name("UserName"));
		userNameInputField.sendKeys("execution");

		WebElement passwordInputField = driver.findElement(By.name("Password"));
		passwordInputField.sendKeys("admin");

		
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//input[@name='Login']"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();

		// driver.close();
	}

}
