package ThisKeyword;

//Example of Only for non-static methods
public class Example5 {

	public void test1(){
		this.test3();
		this.test2();
	}
	
	public static void test2(){
		//this. is not allowed because of static
	}
	
	public void test3(){
		this.test1();
		this.test2();
	}
}
