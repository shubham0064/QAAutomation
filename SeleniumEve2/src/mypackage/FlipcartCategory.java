package mypackage;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartCategory {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		try {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		}catch(NoSuchElementException e){
			
		}

		List<WebElement> category = driver.findElements(By.cssSelector("div[class='_37M3Pb'] div:nth-of-type(2)"));
		System.out.println("Category count: "+category.size());
		for(int i = 0; i<category.size();i++) {
			System.out.println(category.get(i).getText());
		}
	}

}
