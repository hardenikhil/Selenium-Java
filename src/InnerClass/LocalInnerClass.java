package InnerClass;

/**
 ---Local inner class is class which is present within the method 
 */
public class LocalInnerClass {

	void display(){
		class Test{
			void sum(){
				System.out.println("This is sum method od local inner class");
			}
		}
		Test obj= new Test();
		obj.sum();
	}
	
	//You need to create local inner class object to run inner class method
	public static void main(String[] args) {
		LocalInnerClass obj1= new LocalInnerClass();
		obj1.display();
	}
}
