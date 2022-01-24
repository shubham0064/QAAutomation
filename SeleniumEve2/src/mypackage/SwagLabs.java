package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.cssSelector("div[class='login_credentials']"));
		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys(userName.getText().substring(24, 37));
		
		WebElement password = driver.findElement(By.cssSelector("div[class='login_password']"));
		System.out.println("pass "+password.getText().split(":")[1]);
		driver.findElement(By.cssSelector("input[class='input_error form_input'][id='password']")).sendKeys(password.getText().split(":")[1]);
//		driver.findElement(By.cssSelector("input[class='input_error form_input'][id='password']")).sendKeys(password.getText().substring(24, 36));
		driver.findElement(By.cssSelector("input[class='submit-button btn_action']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
