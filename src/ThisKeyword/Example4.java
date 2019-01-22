package ThisKeyword;

//Example of to return current class instance
public class Example4 {

	public Example4 test1(){
		return this;
	}
	
	public Example4 test2(){
		return new Example4();
	}
}
