package MethodOverloading;

/**
 * ---Method overloading will allow us to create more than one method with same
 * name by chaging the method argument ---Called as compile time polymorphism
 * 
 */
public class Example1 {
	public void calculatearea(int length) {
		System.out.println("Calculate(int lenght)");
	}

	public void calculatearea(int length, int height) {
		System.out.println("Calculate(int lenght, int height)");
	}

	public void calculatearea(int length, int height, int width) {
		System.out.println("Calculate(int lenght, int height, int width)");
	}
	
	public static void main(String[] args) {
		Example1 obj= new Example1();
		obj.calculatearea(10,20,30);
	}
}
