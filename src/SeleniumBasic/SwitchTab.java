package SeleniumBasic;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//nikhil.harde//Java//Practice//driverpath//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.api.com");
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		driver.get("https://owner.ford.com");
		
		
		}

}
