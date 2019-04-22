package WrapperClass;
/**
---Wrapper class is used for converting primitive data into object e.g. int-Integer,< Int into String >
---Used in collections... HashMap<Integer, String> hm = new HashMap<Integer, String>();
---We can store NULL values
---We can create wrapper class using two types
   1. Using wrapper class constructor or New keyword
   2. Using Valueof method
 */

public class Example1 {

	public static void main(String[] args) {
		
	//Using Wrapper class constructor or New keyword
		
	Integer int1= new Integer(55);//int 
	
	Integer str= new Integer("String"); //String
	
	Float fl= new Float(20.0); //float
	
	Character c1= new Character('c'); //Only for characters
	
	//====================Convert int into String=========================
	int num= 123;
	
	String int2= String.valueOf(num);
	System.out.println("string is"+ num);
		
	}
	
}
