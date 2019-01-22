package ThisKeyword;

/**
 >>>>>This keyword works as reference to the currect class object
 * It can be used to refer current class instance variable
 * This can be used to invoked current class constructor
 * This can be used to invoked current class method (implicitly)
 * This can be passed as an argument in method call
 * This can ne used to return current class instance
 * Only for non-static
 */

//Example of refer current class instance variable
public class Example1 {
	
	int i;
	int j;
	
	//when your global variable & local variables are same
	Example1(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	public static void main(String[] args) {
		Example1 obj= new Example1(2,6);
		System.out.println(obj.i);
		System.out.println(obj.j);
	}
}
