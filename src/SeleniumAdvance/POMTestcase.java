package SeleniumAdvance;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POMTestcase 
{
  @Test
  public void fordlogin() throws IOException, Exception 
  {
	  File src=new File("C://Users//nikhil.harde//Practice//Repository.properties");
	  FileInputStream fis= new FileInputStream(src);
	  Properties pro=new Properties();
	  pro.load(fis);
	  
	  System.setProperty(pro.getProperty("browser"), pro.getProperty("path"));
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(pro.getProperty("url"));
	  
	  POMBase basepage= new POMBase(driver);
	  basepage.loginpage("newuser1@gmail.com", "owner1");
	  driver.wait();
	  
  }
}
