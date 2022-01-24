package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		WebElement userNameInputField=driver.findElement(By.id("email"));
		userNameInputField.sendKeys("shubhamunde3010@gmail.com");
		
		WebElement userNamepassField=driver.findElement(By.id("pass"));
		userNamepassField.sendKeys("shubham0064#");
		
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
		Thread.sleep(2000);
//		WebElement loginButton=driver.findElement(By.xpath("//button[contains(@id,'u_0_d')]"));
//		loginButton.click();
		
//		String homepagetitle = driver.getTitle();
//
//		if (homepagetitle.equals("Facebook – log in or sign up")) {
//			System.out.println("Title is as expected");
//		} else {
//			System.out.println("Title unexpected");
//		}
//
//		System.out.println("Home Page Title: " + homepagetitle);
//		System.out.println("Title length: "+driver.getTitle().length());

		driver.close();
	}

}
