package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayContainDuplicateorNot {

	public static void main(String[] args) {
		
		String array[]= {"java", "c#", "ruby", "pearl", "java"};//create array
		
		List duplicatelist= Arrays.asList(array);   //Convert Array into list
		
		Set duplicateset= new HashSet<>(duplicatelist);  //convert list into Hashset
		
		if(duplicateset.size()!= duplicatelist.size()){
			System.out.println("Array contains duplictae");
		}else{
			System.out.println("Array does not contains duplicate");
		}
	}
}
