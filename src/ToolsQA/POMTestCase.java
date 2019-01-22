package ToolsQA;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class POMTestCase extends RepositoryTC
{
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws IOException 
	{
		RepositoryTC obj= new RepositoryTC();
		obj.library();
		
		POMBaseClass.signin(driver).click();
		POMBaseClass.username(driver).sendKeys("newuser1@gmail.com");
		POMBaseClass.password(driver).sendKeys("owner1");
		POMBaseClass.loginbutton(driver).click();
	}
  
}
