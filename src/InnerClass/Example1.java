package InnerClass;

/**

----One class within other class is called as inner class
----Inner class can access the private member of outer class


 */
public class Example1 {

	private int a= 90;
	
	//This is inner class
	class Test{
		
		void display(){
			System.out.println("Value of a is"+ a);
		}
		
		void display2(int a){
			System.out.println("Value of a is "+ a);
		}
	}
	
	public static void main(String[] args) {
		//Object for main class
		Example1 obj= new Example1();
		
		//Object for inner class
		Example1.Test obj1= obj.new Test();
		
		obj1.display();
		obj1.display2(10);
	}
}
