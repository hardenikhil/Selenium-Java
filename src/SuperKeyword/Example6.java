package SuperKeyword;

public class Example6 extends Example5
{
	public void run(){
		System.out.println("I am method from child class");
	}
	
	public void display(){
		run();
		super.run();
	}
	
	public static void main(String[] args) {
		Example6 obj= new Example6();
		obj.display();
	}

}
