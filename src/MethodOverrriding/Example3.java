package MethodOverrriding;

public class Example3 {

	//We cannot override private members 
	private void test1()
	{
		System.out.println("This is private parent class");
	}
	
	public static void test2()
	{
		System.out.println("This is static from parent class");
	}
	
	final void test3()
	{
		System.out.println("This is final from parent class");
	}
	
	
}
