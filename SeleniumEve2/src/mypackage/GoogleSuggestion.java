package mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggestion {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(By.name("q")).sendKeys("testing");
		List<WebElement> testing = driver.findElements(By.cssSelector("div[class='OBMEnb'][role='presentation']>ul>li"));
		System.out.println("Count: " + testing.size());

		for (int i = 0; i < testing.size(); i++) {
			System.out.println(testing.get(i).getText());
		}

	}

}
