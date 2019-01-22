package Programs;

public class SwapTwoInterger {

	public static void main(String[] args) {
		
		/**int x= 5;
		int y= 10;
		
		System.out.println("First Value of X= "+ x);
		System.out.println("First Value of Y= "+ y);
		System.out.println("===================");
		
		x= x+y;//15
		y= x-y;//15-10=5  
		x= x-y;//15-5= 10
		
		System.out.println("New Value of X= "+ x);
		System.out.println("New Value of Y= "+ y);**/
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Numbers before Swap num1="+ num1);
		System.out.println("Numbers before Swap num2="+ num2);
		
		int temp= num1;
		num1= num2;
		num2= temp;
		
		System.out.println("Numbers after Swap num1= "+ num1);
		System.out.println("Numbers after Swap num2= "+ num2);
		
	}
}
