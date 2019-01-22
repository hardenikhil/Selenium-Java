package Encapsulcation;

/**
----Encapsulation is a process of binding code & data into a single using 
----Can create Encapsulation class by making data member private & can setter & getter method to use
----By providing setter & getter method you can make class read only or write only
----we can provide data  security
 **/

public class Example1 {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
