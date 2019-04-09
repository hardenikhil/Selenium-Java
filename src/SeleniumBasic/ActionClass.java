package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		//We need to set path of the chrome driver
		System.setProperty("webdriver.chrome.driver", "C://Users//nikhil.harde//Java//Practice//driverpath//chromedriver.exe");
		
		//Creating object to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Go to URL
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='Inpatient Ward']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //input[@id='loginButton']")).click();
		Thread.sleep(2000);
		
		WebElement ele= driver.findElement(By.xpath("//li[@class='change-location']//a"));
		ele.click();
		Thread.sleep(2000);
		
		//Action class is used to hoverover drop down option
		Actions act= new Actions(driver);
		
		WebElement opt1= driver.findElement(By.xpath("//li[@locationname='Isolation Ward']"));
		Thread.sleep(2000);
		
		act.moveToElement(opt1).build().perform();
		Thread.sleep(2000);
		
		act.click(opt1).build().perform();
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
