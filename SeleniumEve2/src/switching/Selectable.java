package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.SeleniumUtils;

public class Selectable extends SeleniumUtils {

	@Test
	public void select() throws InterruptedException {
		WebDriver driver = setUp("chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Selectable']")).click();

		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		WebElement item1 = driver.findElement(By.xpath("//ol[@class='ui-selectable']/li[1]"));
		WebElement item7 = driver.findElement(By.xpath("//ol[@class='ui-selectable']/li[7]"));

		action.clickAndHold(item1).dragAndDrop(item1, item7).build().perform();
		action.release();

		Thread.sleep(2000);
		driver.close();

	}
}
