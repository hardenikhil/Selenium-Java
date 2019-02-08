package Programs;

import java.util.Scanner;

public class CountNumberofVowels {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String");
	String str= sc.nextLine();
	
	int count= 0;
	
	//Change string to character arrays
	char[] character= str.toCharArray();
	
	for(char c : character){
	switch(c){
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		count++;
		break;
	}
	
	}
	System.out.println("Number of count is str= "+ count);
}
}
