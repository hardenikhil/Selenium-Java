package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootStrapDropDownTC extends BaseClass{
	
	WebDriver driver;
	
	BootStrapDropDownTC()
	{
		this.driver= super.driver;
	}
	
	public void BootStrapTC(){
		
		driver.findElement(By.xpath("//input[@id='cityField']")).click();
		List<WebElement> list= driver.findElements(By.xpath("//input[@id='cityField']"));
		for(WebElement ele : list){
			System.out.println("Values" + ele.getAttribute("innerHTML") );
			if(ele.getAttribute("innerHTML").contains("Nagpur")){
				ele.click();
				break;
			}
			
			
		
		}
		
	}
}
