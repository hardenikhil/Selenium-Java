package SeleniumBasic;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.reporters.jq.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureError extends BaseClass{

	WebDriver driver;
	
	public CaptureError(){
		this.driver= super.driver;
	}
	
	public void CaptureError(){
	
		WebElement Signin= driver.findElement(By.xpath("//a[@class='cx-nav__tab cx-nav__tab--primary cx-nav__tab--register']"));
		Signin.click();
		
		//Enter username
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("newuser238@gmail.com");
		
		//Enter password
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("owner");
		
		driver.findElement(By.xpath("//div[@class='cx-form__block']//button[@class='cx-cta cx-cta--btn cx-cta--btn-primary']")).click();
		
		//Capture Error message
		String Actual= driver.findElement(By.xpath("//p[@class='cx-body--regular cx-form__error']")).getText();
	
		String Expected= "Please Enter Correct Username & Password";
		
		Assert.assertEquals(Actual, Expected);
		}
	
	public static void main(String[] args) {
		CaptureError obj= new CaptureError();
		obj.CaptureError();
		System.out.println("AssertionError");
	}

}
