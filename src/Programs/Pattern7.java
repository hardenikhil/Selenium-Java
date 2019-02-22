package Programs;

/***  2  3  4  5  6  7  8  9  10 
 2  *  6  8  10  12  14  16  18  20 
 3  6  *  12  15  18  21  24  27  30 
 4  8  12  *  20  24  28  32  36  40 
 5  10  15  20  *  30  35  40  45  50
 */

public class Pattern7 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++){
			for(int j=1; j<=10; j++){
				if(i==j){
					System.out.print(" * ");
				}else{
					System.out.print(" " +i*j+ " ");
				}
				
			}
			System.out.println();
		}
		
	}
}
		
	
		
		
