package TestNG;

import org.testng.annotations.Test;

public class GroupingTestNG {

	@Test(groups={"Sanity"})
	public void test1(){
		
	}
	
	@Test(groups={"Regression", "Sanity"})
	public void test2(){
		
	}
	
	@Test(groups={"Regression"})
	public void test3(){
		
	}
}
