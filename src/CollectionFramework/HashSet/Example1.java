package CollectionFramework.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**

--Hashset will stores the element by using mechanism using hashing
--Hashset contains unique elements only
--does not maintain insertion order

<<< Difference between List & Set
----List contains duplicate element where as Set contains unique element
 */
public class Example1 {

	public static void main(String[] args) {
		
	HashSet<String> set= new HashSet<String>();
	
	//<<<<<<<<<<<<<<<<< HashSet will not store element in proper insertion order >>>>>>>>>>>>>>
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
