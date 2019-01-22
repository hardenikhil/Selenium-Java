package Programs;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number");
		int number= scanner.nextInt();
		
		for(int i=1; i<=number; i++)
		{
		  for(int j=5; j>=i; j--)
		  {
			  System.out.print(j);  
		  }
		  System.out.println();
		}
		
	}

}
