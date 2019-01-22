package Interface;

public class StaticInterfaceTest {

	public void speed()
	{
		System.out.println("It will run at 80km/h");
	}
	
	public static void main(String[] args) 
	{
		StaticInterfaceTest obj= new StaticInterfaceTest();
		obj.speed();
		int i= StaticInterface.gethorsepower(2333, 10);
		System.out.println(i);
	}
}
