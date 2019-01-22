package Constructor;

//Contructor overloading
public class Example2 {
	
	public Example2(){
		System.out.println(" I am example2()");
	}
	
	public Example2(int a){
		System.out.println(" I am example2(int a)");
	}
	
	public Example2(int a, int b){
		System.out.println(" I am example2(int a, int b)");
	}
	
	public static void main(String[] args) {
		Example2 obj= new Example2();
		Example2 obj1= new Example2(2);
		Example2 obj2= new Example2(2,4);
	}

}
