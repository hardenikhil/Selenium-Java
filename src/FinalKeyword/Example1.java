package FinalKeyword;

/**
--Final keyword is used to restrict the user to change the implementation of method or change the initialized value of 
variables
--Final var that have no value is called blank final var. It can be initialised in constructor only
--Applicable for variable/method/class
--Final method can be inherit but can't be override
--we can't declare constructor final as we cant inherit constructor 
 */
public class Example1 {
	
	final int k=10;
	
	//we can't chnage the value of final variable
	public void test1(){
		//k=20;
		System.out.println("value of k is "+ k);
	}

}
