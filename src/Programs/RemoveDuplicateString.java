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
		StringBuffer sf= new StringBuffer(); //for append the string
		
		for(int i=0; i<str.length(); i++){
			Character ch= str.charAt(i);//charat(0)= s
			if(!set.contains(ch)){     // If s is not present then add in SET
				set.add(ch);           // s is added
				sf.append(ch);         // Append each characters
			}
		}
		return sf.toString();
		
	}
}

