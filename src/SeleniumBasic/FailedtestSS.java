package SeleniumBasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.ReporterConfig.Property;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailedtestSS {
  
	WebDriver driver;
	
	@Test
	public void FailedtestSS() throws IOException 
	{
		File src= new File("C://Users//nikhil.harde//Practice//Repository.properties");
		FileInputStream fis= new FileInputStream(src);
		Properties pro= new Properties();
		pro.load(fis);
		System.out.println("Property File has been loaded");
		
		System.setProperty(pro.getProperty("browser"), pro.getProperty("path"));
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gncm.in/");
		driver.findElement(By.xpath("//a[@title='Log In']")).click();
		driver.findElement(By.xpath("//ul[@class='form-list']//input[@id='email']")).sendKeys("xyz");
		driver.findElement(By.xpath("//button[@id='loginsubmit']")).click();
	}
		
	@AfterMethod
	public void failtestcase(ITestResult result)
	{
		
			if(ITestResult.FAILURE==result.getStatus())
			{
			try{
				TakesScreenshot ts=(TakesScreenshot)driver;
				File src=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:/Users/nikhil.harde/Practice/Screenshot/" +result.getName()+".png"));
				System.out.println("Screen Shot has been taken");
			   }
			
		catch (IOException e) 
		{
			System.out.println("error message after getting exception"+ e.getMessage());
		} 
	
	}
			
}
}


