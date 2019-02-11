package Programs;

public class ReverseInteger {

	public static void main(String[] args) {
		
		
		int num = 123;
		String stringnum= String.valueOf(num);
		String rev= " ";
		
		for(int i=stringnum.length()-1; i>=0; i--){
			rev= rev + stringnum.charAt(i);
		}
		System.out.println(rev);
		
		/**int num= 12345;
		int rev= 0;
		
		while(num != 0){
			rev= rev*10 + num%10;
			num= num/10;
		}
		System.out.println("Reverse num is "+ rev);
	    **/	
	}
}
