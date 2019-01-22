package Programs;

import java.util.Scanner;

//Sidha or ulta naam is same= palindrome
public class PalindromeString {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner scn= new Scanner(System.in);
		String orignal= scn.nextLine();
		
		int len= orignal.length();
		
		String rev= "";
		
		for(int i=len-1; i>=0; i--){
			rev= rev+orignal.charAt(i);
		}
		
		if(orignal.equals(rev)){
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}
		
	}
}

