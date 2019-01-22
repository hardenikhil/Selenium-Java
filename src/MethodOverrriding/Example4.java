package MethodOverrriding;

public class Example4 extends Example3
{
	public static void test2()
	{
		System.out.println("This is static from child class");
	}
	
	public static void main(String[] args) 
	{
		Example4 obj= new Example4();
		obj.test3();
		obj.test2();
	// cannot overrider test1() coz of private 
	}
	
	

}
