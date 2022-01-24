package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginEdge {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", ".\\Executables\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://demo.actitime.com");
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("Page title before login: "+driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
	
		
		WebElement logout=driver.findElement(By.id("logoutLink"));
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		System.out.println("Page title after login: "+driver.getTitle());
		logout.click();
		driver.close();

	}

}
