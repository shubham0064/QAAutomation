package mypackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().setSize(new Dimension(700, 900));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		Thread.sleep(2000);
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("btnLogin")).click();
//		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
