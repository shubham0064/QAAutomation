package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.SeleniumUtils;

public class Droppable extends SeleniumUtils {

	@Test
	public void select() throws InterruptedException {
		WebDriver driver = setUp("chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();

		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
		
		action.dragAndDrop(drag, drop).build().perform();
		driver.close();
		
	}
	
}