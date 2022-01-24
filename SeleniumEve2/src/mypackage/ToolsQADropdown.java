package mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQADropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		List<WebElement> category = driver.findElements(By.cssSelector("div[class='accordion']>div"));
		System.out.println("Count of category: "+category.size());
		for(int i=0;i<category.size();i++) {
			System.out.println(category.get(i).getText());
		}

	}

}
