package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangehrmAddInfo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.cssSelector("input[id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.cssSelector("input[id='txtPassword']"));
		password.clear();
		password.sendKeys("admin123");
		driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[id='menu_pim_viewMyDetails']>b")).click();
		WebElement edit = driver.findElement(By.cssSelector("input[id='btnSave']"));
		edit.click();
		
		WebElement fname = driver.findElement(By.name("personal[txtEmpFirstName]"));
		fname.clear();
		fname.sendKeys("Shubham");
		
		WebElement mname = driver.findElement(By.name("personal[txtEmpMiddleName]"));
		mname.clear();
		mname.sendKeys("Dattatray");
		
		WebElement lname = driver.findElement(By.name("personal[txtEmpLastName]"));
		lname.clear();
		lname.sendKeys("Unde");
		
		WebElement empid = driver.findElement(By.name("personal[txtEmployeeId]"));
		empid.clear();
		empid.sendKeys("0112");
		
		WebElement otherid = driver.findElement(By.name("personal[txtOtherID]"));
		otherid.clear();
		otherid.sendKeys("4455");
		
		WebElement license = driver.findElement(By.name("personal[txtLicenNo]"));
		license.clear();
		license.sendKeys("MH17 20160007788");
		
		WebElement ssn = driver.findElement(By.name("personal[txtNICNo]"));
		ssn.clear();
		ssn.sendKeys("1234");
		
		WebElement sin = driver.findElement(By.name("personal[txtSINNo]"));
		sin.clear();
		sin.sendKeys("4321");
		
		driver.findElement(By.id("personal_optGender_1")).click();
		
		WebElement mstatus = driver.findElement(By.cssSelector("select[id='personal_cmbMarital']"));
		mstatus.click();
		Select select = new Select(mstatus);
		System.out.println("Is Dropdown multiselect: "+select.isMultiple());
		System.out.println("size of options: "+select.getOptions().size());
		for(int i = 0;i<select.getOptions().size();i++) {
			System.out.println("print all options: "+select.getOptions().get(i).getText());
		}
		Thread.sleep(2000);
		select.selectByVisibleText("Single");
		//nationality
		
		WebElement nationality = driver.findElement(By.name("personal[cmbNation]"));
		nationality.click();
		Select nselect = new Select(nationality);
		System.out.println("Is nationality multiselect: "+nselect.isMultiple());
		System.out.println("nationality size: "+nselect.getOptions().size());
//		for(int i=0;i<nselect.getOptions().size();i++) {
//			System.out.println("Nationalities are: "+nselect.getOptions().get(i).getText());
//		}
		
		nselect.selectByVisibleText("Indian");
		Thread.sleep(2000);
		WebElement nickname = driver.findElement(By.cssSelector("input[id='personal_txtEmpNickName']"));
		nickname.clear();
		nickname.sendKeys("Nick");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='personal[chkSmokeFlag]']")).click();
		Thread.sleep(2000);
		WebElement military = driver.findElement(By.name("personal[txtMilitarySer]"));
		military.clear();
		military.sendKeys("No");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='btnSave']")).click();
		
		//custom edit
		driver.findElement(By.cssSelector("input[id='btnEditCustom']")).click();
		WebElement customedit = driver.findElement(By.name("custom1"));
		customedit.click();
		Select bgroup = new Select(customedit);
		bgroup.selectByIndex(5);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='btnEditCustom'][value='Save']")).click();
		
		//Contact Details
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Contact Details']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='btnSave']")).click();
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.name("contact[street1]"));
		address.clear();
		address.sendKeys("Shrirampur");
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.cssSelector("select[id='contact_country']"));
		country.click();
		Thread.sleep(2000);
		Select cselect = new Select(country);
		cselect.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement workemail = driver.findElement(By.name("contact[emp_work_email]"));
		workemail.clear();
		Thread.sleep(2000);
		workemail.sendKeys("shubhamunde3010@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='btnSave']")).click();
		
		
	}

}
