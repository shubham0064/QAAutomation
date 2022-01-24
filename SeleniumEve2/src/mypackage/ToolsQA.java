package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		System.out.println("Current page title: " + driver.getTitle());

		WebElement name = driver.findElement(By.id("userName-label"));
		System.out.println("Name is Displayed: " + name.isDisplayed());
		driver.findElement(By.id("firstName")).sendKeys("Shubham");
		driver.findElement(By.id("lastName")).sendKeys("Unde");

		WebElement email = driver.findElement(By.id("userEmail-label"));
		System.out.println("Email is Displayed: " + email.isDisplayed());
		driver.findElement(By.id("userEmail")).sendKeys("shubhamunde3010@gmail.com");

		WebElement gender = driver.findElement(By.className("col-md-3"));
		System.out.println("Gender is displayed: " + gender.isDisplayed());

		WebElement male = driver.findElement(By.className("custom-control-label"));
		System.out.println("Male radio button is displayed: " + male.isDisplayed());
		male.click();
		System.out.println("Male radio button is enabled: " + male.isEnabled());

		WebElement mobilenumber = driver.findElement(By.id("userNumber-label"));
		System.out.println("Mobilenumber is Displayed: " + mobilenumber.isDisplayed());
		driver.findElement(By.id("userNumber")).sendKeys("9284874020");

		WebElement subject = driver.findElement(By.id("subjects-label"));
		System.out.println("Subject is Displayed: " + subject.isDisplayed());
		driver.findElement(By.id("subjectsInput")).sendKeys("Hello World...!");
		Thread.sleep(2000);

		WebElement hobbies = driver.findElement(By.className("form-label"));
		System.out.println("Hobbies is Displayed: " + hobbies.isDisplayed());

		WebElement sportsbtn = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		sportsbtn.click();
		System.out.println("Sports buttn is enabled: " + sportsbtn.isEnabled());
		System.out.println("Sports buttn is displayed: " + sportsbtn.isDisplayed());
		
		WebElement sportselect = driver.findElement(By.cssSelector("input[id='hobbies-checkbox-1']"));
		System.out.println("sports buttn is selected: "+sportselect.isSelected());
		
		WebElement currentadd = driver.findElement(By.id("currentAddress-label"));
		System.out.println("current add is displayed: "+currentadd.isDisplayed());
		
		WebElement currentaddfield = driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
		currentaddfield.sendKeys("SHRIRAMPUR");
		System.out.println("current add is written: "+currentaddfield.isDisplayed());
		
		//scrolling
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
	
		driver.findElement(By.id("submit")).click();
		System.out.println("Home page title is: "+driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		

	}

}
