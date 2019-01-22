package Encapsulcation;

public class Example2 {

	//only by using object of parent class we can set age & get age
	public static void main(String[] args) {
		
	//object of parent class
	Example1 obj= new Example1();
	obj.setAge(50);
	System.out.println(obj.getAge());
	}
}
