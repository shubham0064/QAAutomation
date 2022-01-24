package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ActitimeLoginWithAppData {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.cssSelector("#demoCredentials tbody>tr:first-child>td:last-child"));
		
//		String name = username.getText();
//		System.out.println(name);
//		String[] splitname =name.split(" ");
//		System.out.println("Index 0: "+splitname[0]);
//		System.out.println("Index 1: "+splitname[1]);

		// or
//		String name1 = username.getText().split(" ")[1];
//		System.out.println("Index 1: "+name1);
		WebElement password = driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:nth-of-type(2)>td"));
		driver.findElement(By.id("username")).sendKeys(username.getText().split(" ")[1]);
		driver.findElement(By.name("pwd")).sendKeys(password.getText().split(" ")[1]);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
