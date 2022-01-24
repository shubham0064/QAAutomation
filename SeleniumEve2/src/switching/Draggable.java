package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.SeleniumUtils;

public class Draggable extends SeleniumUtils {

	@Test
	public void select() throws InterruptedException {
		WebDriver driver = setUp("chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();

		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
		
		action.moveToElement(drag).dragAndDropBy(drag, 100, 250).build().perform();
		
		driver.close();
	}
	
}