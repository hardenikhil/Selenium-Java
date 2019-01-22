package Programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElemArray {

	public static void main(String[] args) {
	
	String array[]= {"java", "ruby", "c", "javascript", "java", "c"};
	
	Set<String> store= new HashSet<String>();//Set store unique value
	for(String name : array){
		if(store.add(name)== false){
			System.out.println("Duplicate string is== "+ name);
		}
		
	}
}
}
