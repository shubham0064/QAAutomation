package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vtiger {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String logintitle = driver.getTitle();
   
		System.out.println("Login page title: " + logintitle);

		WebElement userNameInputField = driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");

		WebElement userNamePasswordField = driver.findElement(By.id("password"));
		userNamePasswordField.clear();
		userNamePasswordField.sendKeys("Test@123");
// For Login button
		
//		WebElement loginbutton = driver.findElement(By.tagName("button"));
//		loginbutton.click();
		//or
		WebElement loginbutton = driver.findElement(By.className("button"));
		loginbutton.click();
		Thread.sleep(2000);
		//or

//		WebElement loginbutton = driver.findElement(By.xpath("//button[normalize-space()='Sign in']"));
//		loginbutton.click();
//
//for logout username logo
		
		driver.findElement(By.className("userName")).click();
		Thread.sleep(2000);
		//or
//		WebElement outbutton = driver.findElement(By.xpath("//a[@role='button']"));
//		outbutton.click();
		System.out.println("Home Page Title: " + driver.getTitle());

		//for signout
		
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(2000);
		//or
//		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();

	//	driver.close();
	}

}
