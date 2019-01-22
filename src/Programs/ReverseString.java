package Programs;

public class ReverseString {

	public static void main(String[] args) {
		
	String s= "Selenium";// total num of length is 7
	int len= s.length();
	String rev= " ";
	//have to store reverse character
	
	for(int i=len-1; i>=0; i--){
		rev = rev + s.charAt(i);
	}
	System.out.println(rev);
	
}
}