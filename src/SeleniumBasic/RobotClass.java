package SeleniumBasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C://Users//nikhil.harde//Java//Practice//driverpath//chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Windows.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
	
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_CAPS_LOCK);
	
	driver.get("https://www.google.com");
	
	
	
	}
}
