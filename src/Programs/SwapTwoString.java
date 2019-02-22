package Programs;

public class SwapTwoString {

	public static void main(String[] args) {
		
		String a= "Hello";
		String b= "World";
		
		System.out.println("value of a before swap is a = "+ a);
		System.out.println("value of b before swap is b = "+ b);
		
		//apend a & b string
		a= a+b;// a= helloworld
		
		//store initial string a in b
		b= a.substring(0, a.length()-b.length() ); //b= Hello
		
		//store initial string b in a
		a= a.substring(b.length());  // a= world
		
		System.out.println("value of a after swap is a = "+ a);
		System.out.println("value of b after swap is b = "+ b);
	}
}
