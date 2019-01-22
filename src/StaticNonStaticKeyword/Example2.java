package StaticNonStaticKeyword;

public class Example2 {

	public void test1(){
		System.out.println("This is Non Static method");
	}
	
	public static void test2(){
		System.out.println("This is static method");
	}
	
	public static void main(String[] args) {
		Example2 obj= new Example2();
		obj.test1();
		
		Example2.test2();
	}
	
}
