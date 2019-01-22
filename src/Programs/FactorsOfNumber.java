package Programs;

/**
  4%1==0 >> 1 is a factor
  4%2==0 >> 2 is a factor
  4%3==!0 >> 3 is not a factor
  4%4==0 >> 4 is factor
 */


public class FactorsOfNumber {
 
	public static void main(String[] args) {
	
		for(int i=1; i<100; i++){
			System.out.println("Factors of number "+ i + "are");
			
			for(int j=1; j<=i; j++){
				if(i%j==0){
					System.out.println(""+ j);
				}
				
			}
		}
	}
}
