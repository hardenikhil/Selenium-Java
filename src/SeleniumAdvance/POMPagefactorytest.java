package SeleniumAdvance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POMPagefactorytest 
{
WebDriver driver;	
	
  @Test
  public void fordlogin() throws IOException, Exception 
  {
	  File src= new File("C://Users//nikhil.harde//Practice//Repository.properties");
	  FileInputStream fis= new FileInputStream(src);
	  Properties pro = new Properties();
	  pro.load(fis);
	  System.out.println("Properties file is loaded properly");
	 
	  System.setProperty(pro.getProperty("browser"), pro.getProperty("path"));
	  driver= new ChromeDriver();
	  driver.get(pro.getProperty("url"));
	  driver.manage().window().maximize();
	  
	  POMPagefactory obj= PageFactory.initElements(driver, POMPagefactory.class);
	  obj.ford("newuser1@gmail.com", "owner1");
	  
  }
}
