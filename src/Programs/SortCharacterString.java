package Programs;

import java.util.Arrays;

public class SortCharacterString {

	public static void main(String[] args) {
		
		String str= "java";
		char ch[]= str.toCharArray();
		Arrays.sort(ch);
		//String sorted= new String(ch);
		//System.out.println(sorted);
		System.out.println(Arrays.toString(ch));
	}
	
}
	