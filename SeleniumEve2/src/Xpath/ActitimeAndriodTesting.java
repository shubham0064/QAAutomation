package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeAndriodTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("Page title before login: "+driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		String taskpage = driver.getCurrentUrl();
	
//		if(taskpage.equals("https://demo.actitime.com/tasks/tasklist.do")) {
//			System.out.println("Correct page opened");
//		}else {
//			System.out.println("Incorrect page opened");
//		}
		
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Tasks']")).click();
		
		Thread.sleep(2000);
		WebElement customer = driver.findElement(By.cssSelector("div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer'] div[class='selectedItem']"));

		customer.click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("tr[class='selectCustomerRow'] div:nth-child(5)")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer'] div[class='selectedItem']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer'] div:nth-child(5)")).click();
		
		WebElement taskname = driver.findElement(By.cssSelector("tbody:nth-child(3)>tr:nth-child(1)>td:nth-child(1) > input:nth-child(1)"));
		taskname.click();
		taskname.sendKeys("Testing1");
		
		driver.findElement(By.cssSelector("div[class='taskTableContainer']>table>tbody>tr:nth-child(1)>td:nth-child(5)>div:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div[class='taskTableContainer']>table>tbody>tr:nth-child(1)>td:nth-child(5)>div:nth-child(1)>div>div>div:nth-child(1)>div>div:nth-child(11)>div")).click();
		
		driver.findElement(By.cssSelector("table:nth-child(1)>tbody:nth-child(3)>tr:nth-child(1)>td:nth-child(6)>label:nth-child(1)>span:nth-child(3)")).click();
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();//create task
		
		String taskurl = driver.getCurrentUrl();
		if(taskurl.equals("https://demo.actitime.com/tasks/tasklist.do")) {
			System.out.println("Task created");
		}else {
			System.out.println("Task not created");
		}
		
		driver.findElement(By.cssSelector("tbody tr:nth-child(8) td:nth-child(1) div:nth-child(1) div:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("div[@class='delete button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("div[class='content'] span[class='submitTitle buttonTitle']")).click();
		Thread.sleep(2000);
		
		WebElement confirmdelete = driver.findElement(By.cssSelector("div[class='rightContainer'] table[class='containerTable']"));
		Thread.sleep(2000);
		confirmdelete.click();
		Thread.sleep(2000);
		confirmdelete.sendKeys("Testing1");
		driver.close();
	}

}
