package CollectionFramework.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
----Contains unique element 
----Maintains ASCENDING Order
 */
public class Example1 {

	public static void main(String[] args) {
		TreeSet<Integer> T1= new TreeSet<Integer>();
		T1.add(90);
		T1.add(30);
		T1.add(60);
		T1.add(10);
		
		Iterator<Integer> itr = T1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
