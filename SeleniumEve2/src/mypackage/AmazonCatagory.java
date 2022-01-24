package mypackage;

import java.util.List;
import java.util.Locale.Category;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCatagory {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		List<WebElement> catagory = driver.findElements(By.cssSelector("#nav-xshop>a"));
		System.out.println("catagory count: "+catagory.size());
		
		for(int i=0;i<catagory.size();i++) {
			if(catagory.get(i).isDisplayed()) {
				System.out.println(catagory.get(i).getText());
			}else {
				System.out.println("By using innerHTML Attribute: "+catagory.get(i).getAttribute("innerHTML"));
			}
		}

	}

}
