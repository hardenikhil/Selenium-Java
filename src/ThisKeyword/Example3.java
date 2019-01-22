package ThisKeyword;

//Example of invoked current class method (implicitly)
public class Example3 {
	
	public void test1(){
		System.out.println("This is Test 1");
	}
	
	public void test2(){
		System.out.println("This is Test 2");
		this.test1();
	}
	
	public static void main(String[] args) {
		Example3 obj= new Example3();
		obj.test2();
	}

}
