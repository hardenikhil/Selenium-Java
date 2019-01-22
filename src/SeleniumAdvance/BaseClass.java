package SeleniumAdvance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver;
	
	BaseClass(){
		
		try {
			File src= new File("C://Users//nikhil.harde//Practice//driverpath//path.repository");
			FileInputStream fis= new FileInputStream(src);
			Properties pro= new Properties();
			pro.load(fis);
			System.out.println("Property File Loaded successfully");
			
			System.setProperty(pro.getProperty("browser"), pro.getProperty("driverpath"));
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(pro.getProperty("iframe"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

