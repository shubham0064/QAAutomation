package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", ".//Executables//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println("Title: "+driver.getTitle());
		
		driver.findElement(By.xpath("//a[normalize-space()='Amazon Pay']")).click();
		System.out.println("Amazon Pay Title: "+driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		String HomePageTitle= driver.getTitle();
		System.out.println("HomePageTitle: "+driver.getTitle());
		
		if(HomePageTitle.equals(Title)) {
			System.out.println("Title Matched");
		}else {
			System.out.println("Not matched");
		}
		driver.close();
	}
	
}

