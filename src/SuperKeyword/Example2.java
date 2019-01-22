package SuperKeyword;

public class Example2 extends Example1
{
	public String colour= "Black";
	
	void display(){
		System.out.println("colour display is: "+ colour);
		System.out.println("colour display is: "+ super.colour);
	}
	
	public static void main(String[] args) {
		
		Example2 obj= new Example2();
		obj.display();
	}

}
