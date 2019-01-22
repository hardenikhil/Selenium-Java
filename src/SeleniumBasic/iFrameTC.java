package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class iFrameTC extends BaseClass{
	
	WebDriver driver;
	
	iFrameTC(){
		this.driver= super.driver;
	}
	
	public void iframe(){
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='phone-menu-left-side']")).click();
	}
	
	public static void main(String[] args) {
		iFrameTC obj= new iFrameTC();
		obj.iframe();
	}
	
}
