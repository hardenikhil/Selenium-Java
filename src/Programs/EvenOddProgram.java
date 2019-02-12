package Programs;

import java.util.Scanner;

public class EvenOddProgram {

	public static void main(String[] args) {

		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
		/**Wihtout using moduler 
		 * (num/2)*2==number >>> Then it is even
		 * 
		 */
	}
}
