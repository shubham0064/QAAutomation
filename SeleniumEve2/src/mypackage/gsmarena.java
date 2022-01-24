package mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		List<WebElement> phones = driver
				.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li>a"));
		System.out.println("Phones count: " + phones.size());

		for (int i = 0; i < phones.size(); i++) {
			System.out.print(phones.get(i).getText());
		}

		System.out.println("_______________________________________________");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix'] li:nth-child(1)>a")).click();
		List<WebElement> samsung = driver.findElements(By.cssSelector("div[class='makers']>ul>li"));
		System.out.println("Samsung phones count: " + samsung.size());

		for (int j = 0; j < samsung.size(); j++) {
			System.out.print(" " + samsung.get(j).getText());
		}
		WebElement nxtbtn = driver.findElement(By.cssSelector("a[class='pages-next']"));

//		Thread.sleep(5000);
//
//		if (nxtbtn.isDisplayed()) {
		nxtbtn.click();
		Thread.sleep(5000);

		List<WebElement> samsung1 = driver.findElements(By.cssSelector("div[class='makers']>ul>li"));
		// if (samsung1.size() > 0) {
		for (int k = 0; k < samsung1.size(); k++) {
			System.out.print(" " + samsung1.get(k).getText());
			nxtbtn = driver.findElement(By.cssSelector("a[class='pages-next']"));

			if (nxtbtn.isDisplayed()) {
				nxtbtn.click();
				samsung1 = driver.findElements(By.cssSelector("div[class='makers']>ul>li"));
				for (int l = 0; l < samsung1.size(); l++) {
					System.out.print(" " + samsung1.get(l).getText());
				}
			}

		}

	}

}