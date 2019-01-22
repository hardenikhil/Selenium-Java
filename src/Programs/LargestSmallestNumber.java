package Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		
		int array[] = {-10, 22, 50, -88, 9867 };//compare -10,22 > 22,50 > 50-88 > -88,9867
		
		Arrays.sort(array);//{-88, -10, 22, 50, 9867}
		System.out.println(Arrays.toString(array));
		//System.out.println("First largest element is "+ array[array.length-1]);
		
		/**int largest = array[0];
		int smallest = array[0];
		
		for(int i=1; i<array.length; i++ ){
			if(array[i] > largest){
				largest= array[i];
			}
			else if(array[i] < smallest ){
				smallest= array[i];
			}
		}
		System.out.println("Largest number is =" + largest);
		System.out.println("Smallest number is =" + smallest);**/
	}
}
