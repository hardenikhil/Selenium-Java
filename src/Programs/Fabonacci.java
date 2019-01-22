package Programs;

/**
0 1 1 2 3 5 8 13 21 34 55
*/

public class Fabonacci {

	public static void main(String[] args) 
	{
		int firstnum= 0;
		int secondnum= 1;
		
		System.out.print(firstnum+" ");
		System.out.print(secondnum+" ");
		
		for(int i=1; i<=10; i++)
		{
			int thirdnum= firstnum+secondnum;
			System.out.print(thirdnum+ " ");
			
			firstnum=secondnum;
			secondnum=thirdnum;
		}
		

	}

}
