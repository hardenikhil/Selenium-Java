package InnerClass;

public class StaticNestedInnerClass {

	private static int a = 90;
	
	static class Test{
		void display(){
			System.out.println("The value of a is "+ a);
		}
	}
	
	public static void main(String[] args) {
		StaticNestedInnerClass.Test obj = new StaticNestedInnerClass.Test();
		obj.display();
	}
}
