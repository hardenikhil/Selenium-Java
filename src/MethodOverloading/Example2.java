package MethodOverloading;

public class Example2 {

	public void add(int i, int j){
		System.out.println("add(int i, int j)");
		//if you remove this method still this method will get called coz double accepts integer
	}
	
	public void add(double d1, double d2){
		System.out.println("add(double d1, double d2)");
	}
	
	public void add(int n, long l){
		System.out.println("add(int n, long l)");
	}
	
	public void add(long n, int l){
		System.out.println("add(long n, int l)");
	}
	
	
	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.add(30.22, 55.43);
		obj.add(10, 20);
	}
}
