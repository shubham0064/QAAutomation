package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeAndroidTesting2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		String pagetitle = driver.getTitle();
		System.out.println("Page title is: "+pagetitle);
		//locate username store in webelement
		WebElement username = driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:first-child>td:last-child"));
		//locate password store in webelement
		WebElement password = driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:nth-child(2)>td"));
		//input usernme n pass in login page
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(username.getText().split(" ")[1]);
		driver.findElement(By.cssSelector("input[type='password'][placeholder='Password']")).sendKeys(password.getText().split(" ")[1]);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(2000);
		//locate tasks button
		driver.findElement(By.cssSelector("a[href='/tasks/tasklist.do']")).click();
		//loacte addnew button
		driver.findElement(By.className("addNewContainer")).click();
		//locate new task button
		driver.findElement(By.xpath("//div[@class='dropdownContainer addNewMenu']//div[3]")).click();
		//locate company button
		driver.findElement(By.cssSelector("div[class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>div:nth-child(1)>div:first-child")).click();
		//select galaxy corp
		driver.findElement(By.cssSelector("div[class='scrollableDropdownView']>div>div>div>div:nth-child(4)")).click();
		//locate project
		driver.findElement(By.cssSelector("div[class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>div:first-child>div>div:nth-child(1)")).click();
		//select android project
		driver.findElement(By.cssSelector("div[class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']>div>div:nth-child(2)>div>div:nth-child(1)>div>div:nth-child(5)")).click();
		//locate enter task
		driver.findElement(By.cssSelector("div[class='taskTableContainer']>table>tbody>tr:nth-child(1)>td:nth-child(1)>input")).sendKeys("Testing");;
		//locate typeofwork
		driver.findElement(By.cssSelector("div[class='taskTableContainer']>table>tbody>tr:nth-child(1)>td:nth-child(5)>div:nth-child(2)>div")).click();
		//locate testing in list n enter
		driver.findElement(By.cssSelector("div[class='taskTableContainer']>table>tbody>tr:nth-child(1)>td:nth-child(5)>div:nth-child(1)>div>div>div:nth-child(1)>div>div:nth-child(11)>div")).click();
		//locate checkbox n select
		driver.findElement(By.cssSelector("div[class='taskTableContainer']>table>tbody>tr:nth-child(1)>td:nth-child(6)>label")).click();
		//locate create task n select
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		//locate testing checkbox to delete
		List<WebElement> tasklist = driver.findElements(By.cssSelector("div[class='autoScrollableWrapper scrollableContainer tasksTableVerticalScrollContainer']"));
		System.out.println("tasklistsize is: "+tasklist.size());
//		for(int i=0;i<tasklist.size();i++) {
//			System.out.println("tasklistsize is: "+tasklist.size());
//		}
	}

}
