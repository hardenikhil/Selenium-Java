package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Crossbrowser 
{
  WebDriver driver;
	
  	@Test
	@Parameters("browser")
	public void test(String browser) 
	{
	 if(browser.equalsIgnoreCase("chrome"))
	  {
		 System.setProperty("webdriver.chrome.driver", "C://eclipse//chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://owner.ford.com");
		 driver.quit();
	  }
	 else if(browser.equalsIgnoreCase("ff"))
	  {
		 WebDriver driver= new FirefoxDriver();
		 driver.get("https://www.google.com");
	  }
			 
	}
}
