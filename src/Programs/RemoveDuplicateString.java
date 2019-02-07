package Programs;

import java.util.HashSet;
import java.util.Set;

/**
Input= Nikhil
Output= Nikhl

 */
public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		String str= "Sandeeep";
		System.out.println(removeduplicate(str));
}
	public static String removeduplicate(String str){
	
		Set<Character> set= new HashSet<>();
		StringBuffer sf= new StringBuffer();
		
		for(int i=0; i<str.length(); i++){
			Character ch= str.charAt(i);//charat(0)= N
			if(!set.contains(ch)){     // If N is not present then add in SET
				set.add(ch);           // N is added
				sf.append(ch);         // Append each characters
			}
		}
		return sf.toString();
		
	}
}

