package Staticblock;

/**
--Static block is used to initialized static variables
--Static block is executed when the class is loaded 
--Class can have multiple static block
--Static block does not depend on object creation
--SIB will run once in the class 
 */
public class Example1 {

	static int num;
	static String mystr;
	
	static{
		num= 15;
		mystr= "static keyword in jave";
	}
	
	public static void main(String[] args) {
		System.out.println("The value of number is "+ num );
		System.out.println("The value of mystr is "+ mystr);
	}
}
