package mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TricentisShop {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
//		List<WebElement> category = driver.findElements(By.cssSelector("div[class='header-menu']>ul>li"));
//		System.out.println("category count"+category.size());
//		for(int i = 0;i<category.size();i++) {
//			System.out.println(category.get(i).getText());
//		}
		
		List<WebElement> category1 = driver.findElements(By.cssSelector("div[class='block block-category-navigation'] div>ul>li>a"));
		System.out.println("category1 count: "+category1.size());
		for(int i = 0;i<category1.size();i++) {
			System.out.println(category1.get(i).getText());
		}
	}

}
