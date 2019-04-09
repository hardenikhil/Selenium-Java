package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author nikhil.harde
 */

public class SelectDropDownClass {

	public static void main(String[] args) throws InterruptedException {
		
		//We need to set path of the chrome driver
		System.setProperty("webdriver.chrome.driver", "C://Users//nikhil.harde//Java//Practice//driverpath//chromedriver.exe");
		
		//Creating object to launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Go to URL
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//get the xpath of drop down
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='select-demo']"));
		
		//select options fromt the drop down
		Select st= new Select(dropdown);
		
		//select by index number
		//st.selectByIndex(2);

		//By visible Text
		//st.selectByVisibleText("Friday");
		
		//select by value
		st.selectByValue("Thursday");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
}
