package SeleniumBasic;

import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {

	public static void main(String[] args)throws Exception 
	{
	String a= "webdriver.chrome.driver";
	String b= "C://eclipse//chromedriver.exe";
		
	System.setProperty("a","b");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.goibibo.com/");
	
	Actions act= new Actions(driver);
	WebElement city1= driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']"));
	city1.sendKeys("Nagpur");
	Thread.sleep(2000);
	act.moveToElement(city1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
	
	WebElement city2= driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']"));
	city2.sendKeys("Pune");
	Thread.sleep(2000);
	act.moveToElement(city2).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("//div[@class='shCalenderBox col-md-5 col-sm-5 col-xs-12 pad0 marginTB10 marginAdjust']//div[1]//div[1]//input[1]")).click();
	List<WebElement> alldates= driver.findElements(By.xpath("//div[contains(@class,'fltHmCal')]//div[2]//div[3]//div[5]//div[5]"));
	
		for(WebElement ele:alldates)
		{
			String date= ele.getText();
			if(date.equalsIgnoreCase("28")){
				ele.click();
				break;
			}
			System.out.println("selected date is"+ date );
			
			
		}
	
		//Take a Screenshot
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File ("C://Users//nikhil.harde//Practice//Screenshot//date.jpeg"));
		
	}

}