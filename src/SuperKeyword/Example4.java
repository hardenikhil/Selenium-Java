package SuperKeyword;

public class Example4 extends Example3{

	String name;
	
	Example4(String name, int salary, int age){
		//super() will call default constructor from parent class
		super(salary, age);
		this.name=name;
	}
	
	Example4(){
		super(); //This will call contructor from parent first
		System.out.println("I am child constructor");
	}
	
	public void display(){
		System.out.println("Name is :"+ name+ " salary is :"+ salary +" Age is :"+ age);
	}
	
	public static void main(String[] args) {
		Example4 obj= new Example4("Nikhil", 2000, 27);
		obj.display();
		
		Example4 obj1= new Example4();
		
	}
	
	
}
