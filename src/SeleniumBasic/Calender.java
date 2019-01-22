package SeleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args)throws Exception 
	{
	String a= "webdriver.chrome.driver";
	String b= "C://eclipse//chromedriver.exe";
		
	System.setProperty("a","b");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.goibibo.com/");
		
	driver.findElement(By.xpath("//div[@class='shCalenderBox col-md-5 col-sm-5 col-xs-12 pad0 marginTB10 marginAdjust']/div[1]/descendant::div[@class='col-md-12 col-sm-12 col-xs-12 pad0']")).click();
	List<WebElement> alldates= driver.findElements(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']"));
	
		for(WebElement element:alldates)
		{
			String date=element.getText();
			if(date.equalsIgnoreCase("27"))
			{
				element.click();
				break;
			}
		}
	
	}

}
