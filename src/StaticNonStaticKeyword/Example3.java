package StaticNonStaticKeyword;

public class Example3 {

	public int i = 90;
	
	public static int j = 80;
	
	public void test1(){
		System.out.println(i); //non-static method can access non-static member
		System.out.println(j);
	}
	
	public static void test2(){
		System.out.println(j); //Static method can access only Static members
	}
	
	public static void main(String[] args) {
		Example3 obj = new Example3();
		test2();
		
	  //test1();  Cannot call Non-static method into Static main method
	}
}
