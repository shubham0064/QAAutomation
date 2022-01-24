package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.SeleniumUtils;

public class Resizable extends SeleniumUtils{

	@Test
	public void sort1() throws InterruptedException {
		WebDriver driver = setUp("chrome","https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement image = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Thread.sleep(2000);
		action.dragAndDropBy(image, 200, 100).build().perform();
		
		action.dragAndDropBy(image, -250, -125).build().perform();
	
		
		
		
		
	}
	
	
}
