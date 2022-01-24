package KeyboardMouseOp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		Actions action = new Actions(driver);
		
		
		WebElement trash = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		
		List<WebElement> images = driver.findElements(By.xpath("//ul[@class='gallery ui-helper-reset ui-helper-clearfix ui-droppable']/li"));
		Thread.sleep(2000);
		for(int i=0;i<images.size();i++) {
			Thread.sleep(2000);
			action.dragAndDrop((images.get(i)), trash).build().perform();
		}
		driver.close();
	}
}

//		WebElement img1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
//		WebElement img2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
//		WebElement img3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
//		WebElement img4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
//		Thread.sleep(2000);
//		action.dragAndDrop(img1, trash).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(img2, trash).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(img3, trash).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(img4, trash).build().perform();
//		Thread.sleep(2000);
		
		
