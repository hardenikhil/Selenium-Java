package ThisKeyword;

//Example of invoked current class constructor
public class Example2 {

	Example2(){
		System.out.println("Default constructor");
	}
	
	Example2(int i){
		this();
		System.out.println("The value of i= "+ i);
	}
	
	Example2(int i, int j){
		this(i);
		System.out.println("The value of i= "+ i+ " The value of j= "+ j);
	}
	
	public static void main(String[] args) {
		Example2 obj= new Example2(5,6);
	}
}

