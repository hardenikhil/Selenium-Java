package ToolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMBaseClass 
{
	private static WebElement element= null;

    public static WebElement signin(WebDriver driver)
	{
    	element = driver.findElement(By.xpath("//a[@class='cx-nav__tab cx-nav__tab--primary cx-nav__tab--register']"));
		return element;
	}
	
    public static WebElement username(WebDriver driver)
    {
    	element = driver.findElement(By.xpath("//input[@id='login-username']"));
		return element;	
    }
    
    public static WebElement password(WebDriver driver)
    {
    	element = driver.findElement(By.xpath("//input[@id='login-password']"));
		return element;	
    }
    
    public static WebElement loginbutton(WebDriver driver)
    {
    	element = driver.findElement(By.xpath("//div[@class='cx-form__block']//button[@class='cx-cta cx-cta--btn cx-cta--btn-primary']"));
		return element;	
    }
}
