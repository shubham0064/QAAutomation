package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.SeleniumUtils;

public class HandlingFrames1 extends SeleniumUtils {
@Test
	public void testFrames() throws InterruptedException {

		WebDriver driver = setUp("chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("ja");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo")).click();
	}
}
