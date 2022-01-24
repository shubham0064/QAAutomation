package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SauceDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", ".\\Executables\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		System.out.println("Page title: "+driver.getTitle());
		System.out.println("Page URL: "+driver.getCurrentUrl());
		driver.close();
	}

}
