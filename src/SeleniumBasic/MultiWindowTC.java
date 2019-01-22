package SeleniumBasic;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiWindowTC extends BaseClass
{
	WebDriver driver;
	
	MultiWindowTC(){
		this.driver=super.driver;
	}

	public void multiwindowTC() throws Exception{
	
	//Click on Fordpass Sec Nav tab
	driver.findElement(By.xpath("//a[@id='tab_FordPass']")).click();
	driver.findElement(By.xpath("//div[@class='cx-nav__flyout-home-link']//a[@href='/fordpass.html']")).click();
	driver.findElement(By.xpath("//img[@alt='Google Play']")).click();
	
	//Now we will switch to multiple window
	String parent= driver.getWindowHandle();
	Set<String> child= driver.getWindowHandles();
	Iterator<String> I1 = child.iterator();
	while(I1.hasNext()){
		String child_window = I1.next();
		
	if(!parent.equals(child_window)){
		driver.switchTo().window(child_window);
		driver.get("https://owner.lincoln.com");
	}
	}
	
	driver.switchTo().window(parent);
}
	public static void main(String[] args) throws Exception {
		MultiWindowTC obj= new MultiWindowTC();
		obj.multiwindowTC();
	}
	
}
	
	
	
