package ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.SeleniumUtils;

public class ParallelExecutionOfMethods extends SeleniumUtils{


	@Test
	public void testVtigerLogin() throws InterruptedException {
		WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Test@123", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testActitimeLogin() {
		WebDriver driver =setUp("Firefox", "https://demo.actitime.com/login.do");
		driver.switchTo().activeElement().sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		driver.close();
	}
}