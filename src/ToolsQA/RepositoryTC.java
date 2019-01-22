package ToolsQA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RepositoryTC {

	public void library() throws IOException
	{
		File src= new File("C://Users//nikhil.harde//Practice//Repository.properties");
		FileInputStream fis= new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println("Property File has been loaded successfully");
		
		System.setProperty(pro.getProperty("browser"), pro.getProperty("path"));
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
	}
	
	public void RepositoryTC()
	{
		
	}
	

}
