package CollectionFramework.SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/**
---Contains only unique element
---Store elements using Hashing Mechanism
---Maintains insertion order
---Not synchronized
---Allows only one null values
 */
public class LinkedHashSet_ {

	public static void main(String[] args) {
		
	LinkedHashSet<String> set= new LinkedHashSet<String>();
	
	//<<<<<<<<<<<<<<<<< LinkedHashSet will store element in proper insertion order >>>>>>>>>>>>>>
	set.add("Test1");
	set.add("Test2");
	set.add("Test3");
	set.add("Test4");
	
	Iterator<String> itr = set.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	}
}

