package Programs;
/**
54321
5432
543
54
5
*/

public class Pattern5 {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++)
		{
		  for(int j=6; j>=i; j--)
		  {
			  System.out.print(j);  
		  }
		  System.out.println();
		}
		
	}

}
