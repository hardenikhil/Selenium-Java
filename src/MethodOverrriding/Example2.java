package MethodOverrriding;

public class Example2 extends Example1 
{
	//This is a Child Class
	public void child()
	{
		System.out.println("I am from Child class");
	}
	
	public void test2()
	{
		System.out.println("child class test 2");
	}
	
	public static void main(String[] args) {
		
		Example2 obj= new Example2();
		obj.parent();
		obj.child();
	}
}
