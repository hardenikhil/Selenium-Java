package SeleniumAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMBase 
{

	WebDriver driver;
	
	By register=By.xpath("//a[@class='cx-nav__tab cx-nav__tab--primary cx-nav__tab--register']");
	By username=By.xpath("//input[@id='login-username']");
	By password=By.xpath("//input[@id='login-password']");
	By Signin=By.xpath("//div[@class='cx-form__block']//button[@class='cx-cta cx-cta--btn cx-cta--btn-primary']");
	
	//constructor 
	public POMBase(WebDriver driver)
	{
		this.driver=driver;
	}

	public void loginpage(String userid, String pass)
	{
		driver.findElement(register).click();
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(Signin).click();
	}	
}
