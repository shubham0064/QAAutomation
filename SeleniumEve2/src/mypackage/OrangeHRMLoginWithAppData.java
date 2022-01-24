package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginWithAppData {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.cssSelector("div[style='position: relative; top: 210px; left: 655px; z-index:100;']>span"));
		driver.findElement(By.id("txtUsername")).sendKeys(username.getText().substring(13,18));
		
		WebElement password = driver.findElement(By.cssSelector("div[style='position: relative; top: 210px; left: 655px; z-index:100;']>span"));
		driver.findElement(By.id("txtPassword")).sendKeys(password.getText().substring(32,40));
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
	}

}
