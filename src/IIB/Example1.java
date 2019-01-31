package IIB;

/**
---IIB- Instance Initialization Block
---IIB executes when the constructor is called but before the execution of constructor
---So it executes as many times as constructor gets executed
---IIB will execute First then constructor 
 */
public class Example1 {
	
	{
		System.out.println("This is IIB 1");
	}
	
	{
		System.out.println("This is IIB 2");
	}
	
	Example1(){
		System.out.println("This is Constructor");
	}
	
	public static void main(String[] args) {
		Example1 obj= new Example1();
	}
}
