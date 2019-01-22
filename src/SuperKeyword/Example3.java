package SuperKeyword;

public class Example3 
{
	int salary;
	int age;
	
	//This is parent class
	Example3(){
		System.out.println("I am from parent constructor");
	}
	
	Example3(int salary, int age){
		this.salary= salary;
		this.age= age;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public int getAge(){
		return age;
	}
}
