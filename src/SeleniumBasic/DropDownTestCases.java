package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTestCases extends BaseClass{

	WebDriver driver;
	
	DropDownTestCases()
	{
		this.driver= super.driver;
	}

	public void DropDownSelect(){
		
		driver.findElement(By.xpath("//a[@id='tab_Support']")).click();
		
		driver.findElement(By.xpath("//div[@class='cx-nav__flyout-home-link']/a[@href='/support.html']")).click();
		
		WebElement d1= driver.findElement(By.xpath("//select[@id='vehicleYear']"));
		Select s1= new Select(d1);
		s1.selectByIndex(2);
		
		WebElement d2= driver.findElement(By.xpath("//select[@id='vehicleModel']"));
		Select s2= new Select(d2);
		s2.selectByIndex(3);
		
		WebElement d3= driver.findElement(By.xpath("//select[@id='vehicleSYNCType']"));
		Select s3= new Select(d3);
		s3.selectByIndex(0);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
