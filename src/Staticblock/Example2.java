package Staticblock;

/**
 --Static block does not depend on Object creation
 */
public class Example2 {

	static{
		System.out.println("This is SIB 1");
	}
	
	static{
		System.out.println("This is SIB 2");
	}
	
	static{
		System.out.println("This is SIB 3");
	}
	
	public static void main(String[] args) {
		
	}
}
