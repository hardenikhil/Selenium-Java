package Constructor;
/**
 1. Java constrcutor is similar to method & it is called when we create object of class
 2. constructor name is same as class name
 3. constructor cannot have return type
 4. java compiler will keep defaulf constructor
 5. The purpose of constructor is to initialize the object of class
 6. Overloading is possible in constructor
 */
public class Example1 {

	int a;
	int b;
	
	public Example1(){
		System.out.println("Example1()");
	}
	
	public Example1(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Example1(int a, int b)");
	}
	
	public static void main(String[] args) {
		Example1 obj1= new Example1();
		Example1 obj2= new Example1(2,5);
	}
}
