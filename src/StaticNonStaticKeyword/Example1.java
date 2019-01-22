package StaticNonStaticKeyword;

/**
---Non Static member are accessed by object
---Static member are access by class name
 */

public class Example1 {

	public int i = 90;
	
	public static int j = 80;
	
	public static void main(String[] args) {
		
		Example1 obj= new Example1();
		System.out.println(obj.i);
		System.out.println(obj.j); //You can also call static variable or method from Object
		
		System.out.println(Example1.j); //you can only call static member by class name
		//you cannot call non-static member by class name
	}
}
