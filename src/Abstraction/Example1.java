package Abstraction;

/**
 
 * Abstract class has implemented & Unimplemeneted methods
 * Can't create object of abstract class
 * Can create constructor of abstract class
 * when out of 5 module only 3 module is ready i.e. out of 100 30% work implemented then we can go for abstract class
 * multiple inheritence is not allowed
 * If abstract class extends abstract class then no error for unimplemented methods
 * Can't create private abstract method
 
 */
public abstract class Example1 {

	abstract void test1();
	
	abstract void test2();
	
	void test3(){
		System.out.println("This is test 3");
	}
}
