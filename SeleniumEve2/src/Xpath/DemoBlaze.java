package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlaze {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		List<WebElement> phones = driver.findElements(By.xpath("//div[@id='tbodyid']//following::h4//a"));
		// System.out.println("size: "+phones.size());

		List<WebElement> price = driver.findElements(By.xpath("//div[@id='tbodyid']//following::h5"));
		// System.out.println("size: "+price.size());

		for (int i = 0; i < phones.size(); i++) {
			for (int j = 0; j < price.size(); j++) {
			}
			System.out.println(phones.get(i).getText() + ":" + price.get(i).getText());
		}
		WebElement nxtbtn = driver.findElement(By.xpath("//button[text()='Next']"));

		do {
			nxtbtn.click();
			Thread.sleep(5000);
		} while (nxtbtn.isDisplayed());

		List<WebElement> nextpage = driver.findElements(By.xpath("//div[@id='tbodyid']//following::div//h4//a"));

		System.out.println("____________");
		Thread.sleep(5000);

		System.out.println("new: " + nextpage.size());
		Thread.sleep(5000);
		for (int k = 0; k < nextpage.size(); k++) {
			System.out.println(nextpage.get(k).getText());
		}

		driver.close();
	}
}
