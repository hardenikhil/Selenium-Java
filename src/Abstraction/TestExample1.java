package Abstraction;

public class TestExample1 extends Example1{

	@Override
	void test1() {	
		
	}

	@Override
	void test2() {
		
	}
	
	public static void main(String[] args) {
		
		Example1 obj= new TestExample1();
		obj.test1();
		obj.test2();
		obj.test3();
	}

}
