package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Example4 {

	public static void main(String[] args) {
		//Creating Arraylist Object
		ArrayList<String> obj = new ArrayList<String>();
		
		//Adding Object in Arraylist
		obj.add("Test1");
		obj.add("Test2");
		obj.add("Test3");
		obj.add("Test4");
		
		//Traversing list thorugh Iterator
		//<<<<<<<   WITH USING ITERATOR >>>>>>>>
		Iterator<String> itr = obj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//<<<<<<<<<<<<<<<< With FOR EACH LOOP >>>>>>>>>>>>
		for(String a1: obj){
			System.out.println(a1);
		}
	}
}
