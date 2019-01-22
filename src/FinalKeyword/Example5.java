package FinalKeyword;

public class Example5 {

	final int i;
	final static int j;
	
	//non-static final is initialized in constructor
	Example5(){
		i= 4;
	}
	
	//static final member can be initialized in IIB
	static{
		j= 5;
	}
	
}
