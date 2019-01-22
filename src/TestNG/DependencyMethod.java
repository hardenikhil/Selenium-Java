package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	
	@Test
	public void test1(){
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods={"test1"})
	public void test2(){
		System.out.println("Test 2 Passed");
	}
	
	@Test(dependsOnMethods={"test1", "test2"})
	public void test3(){
		System.out.println("Test 3 Passed");
	}
	
	@Test 
	public void test4(){
	 Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods={"test4"})
	public void test5(){
		System.out.println("Test 5 failed");
	}

}
