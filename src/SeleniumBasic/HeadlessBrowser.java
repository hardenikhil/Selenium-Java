package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args)throws InterruptedException {
		
	//Initialize HTML unit driver
	HtmlUnitDriver driver= new HtmlUnitDriver();
	
	//Go to Website
	driver.get("https://demo.applitools.com/");
	
	System.out.println("Get the title of the page = "+ driver.getTitle());
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test");
	
	driver.findElement(By.xpath("//a[@id='log-in']")).click();
	
	//Get title of the page after login
	System.out.println("Title of the page after login ="+ driver.getTitle());
	
	}

}
