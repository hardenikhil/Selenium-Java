package Programs;

public class Test {
	
	public void test1(){
		System.out.println("This is Test 1");
	}
	
	public void test2(){
		System.out.println("This is Test 2");
	}
	
	public static void test3(){
		System.out.println("This is Test 3");
	}

	public static void main(String[] args) {
		Test obj= new Test();
		test3();
		//test1();
		
	}

}
