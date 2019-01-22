package Interface;

//Example of Multiple Inheritance in Java
public class C implements A,B{

	@Override
	public void test2() {
		System.out.println("This is from interface B");
		
	}

	@Override
	public void test1() {
		System.out.println("This is from interface A");
		
	}
	
	public static void main(String[] args) {
		C obj= new C();
		obj.test1();
		obj.test2();

}
}