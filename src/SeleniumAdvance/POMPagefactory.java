package SeleniumAdvance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;
	
public class POMPagefactory 
{
	WebDriver driver; 
	
	 public POMPagefactory(WebDriver driver1)
	 {
		this.driver=driver; 
	 }
	

	@FindBy(how=How.XPATH,using="//li[@class='cx-nav--margin-left-auto']")
	@CacheLookup
	WebElement register;
	
	@FindBy(how=How.XPATH,using="//input[@id='login-username']")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='login-password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//div[@class='cx-form__block']//button[@class='cx-cta cx-cta--btn cx-cta--btn-primary']")
	@CacheLookup
	WebElement button;
	
	public void ford(String uid, String pw)
	{
		register.click();
		username.sendKeys(uid);
		password.sendKeys(pw);
		button.click();
	}
	
}
