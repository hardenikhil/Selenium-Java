package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLog 
{
	@Test
	public void log() 
	{
	  System.setProperty("webdriver.chrome.driver", "C://eclipse//chromedriver.exe");
	  Reporter.log("Driver Path has been Set");
	  
	  WebDriver driver= new ChromeDriver();
	  Reporter.log("Object has been created");
	  
	  driver.manage().window().maximize();
	  Reporter.log("Windows maximizes");
	  
	  driver.get("https://www.google.com");
	  Reporter.log("Driver navigating to URL");
	  
	  driver.quit();
	  Reporter.log("Application closed");
	  
	  
	}
}
