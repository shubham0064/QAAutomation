package mypackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspnCrickInfo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		List<WebElement> menubar = driver.findElements(By.cssSelector("ul[class='navbar-nav mr-auto']>li"));
		System.out.println("Show Menubar Count: "+menubar.size());
		
		String pagetitle = driver.getTitle();
	
		for(int i=0;i<menubar.size();i++) {
			System.out.println(menubar.get(i).getText());
		}
		
	}

}
