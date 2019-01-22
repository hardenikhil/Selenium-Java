package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 @option default is used when parameter is not mentioned in xml file
 */
public class Parameterstest {
	@Test
	@Parameters({"data" })

	public void test1(@Optional("default") String data) {
		System.out.println(data);
	}
}
