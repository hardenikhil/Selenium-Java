package Programs;

public class PrintNumWithoutLoop {

	public static void main(String[] args) {
		printnumber(1);
	}
	
	public static void printnumber(int n){
		if(n<10){
			System.out.println(n);
			printnumber(n+1);
		}
	}
}
