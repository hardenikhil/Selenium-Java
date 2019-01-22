package StaticNonStaticKeyword;

public class Example4 {
	
	public static int counter= 0;
	
	public int i=0;
	
	//Contructor is used for purely object creation
	Example4(){
		counter++;
		i++;
		
		System.out.println("Value of i is= "+i +" value of counter is ="+counter);
	}
	
	public static void main(String[] args) {
		Example4 obj1= new Example4();
		Example4 obj2= new Example4();
		Example4 obj3= new Example4();
	}
}
