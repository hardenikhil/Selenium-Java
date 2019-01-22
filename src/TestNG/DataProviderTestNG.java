package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {

	@DataProvider
	public Object[][] testdata(){
		Object[][] data= new Object[2][2];
		
		data [0][0]= "Test1";
		data [0][1]= "Test2";
		data [1][0]= "Test3";
		data [1][1]= "Test4";
		
		return data;
	}
	
	@Test(dataProvider="testdata")
	public void runtestdata(String s1, String s2){
		System.out.println("s1 ="+ s1 + " s2 ="+ s2);
	}
}
