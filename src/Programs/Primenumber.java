package Programs;

import java.util.Scanner;

/**
 * 5%2= 1---Is a prime number 4%2= 0----Is not a prime number
 */
public class Primenumber {

	public static void main(String[] args) {

		boolean prime = true;

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// If num is 4 then loop between 1 to 4
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
			}

		}
		if(prime==true){
			System.out.println("Number is prime number");
		}else{
			System.out.println("Number is not Prime number");
		}
	}

}
