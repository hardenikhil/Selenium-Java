package SeleniumBasic;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;

public class Log4j_ {

	public static void main(String [] args){
		
	Logger logger= Logger.getLogger("Log4j");
	PropertyConfigurator.configure("Log4j.properties");
	
	System.setProperty("webdriver.chrome.driver", "C://Users//nikhil.harde//Java//Practice//driverpath//chromedriver.exe");
	logger.info("browser has been initiated");
	
	WebDriver driver= new ChromeDriver();
	logger.info("Open chrome driver");
	
	driver.get("http://www.google.com");
	logger.info("navigate to URL google");
	
	}
}
