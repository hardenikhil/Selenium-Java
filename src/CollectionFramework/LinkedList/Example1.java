package CollectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
1. LinkedList is a doubly-linked list implementation of the List and Deque interfaces
   Hence it provides linked list data structure
2. LinkedList maintains the insertion order similar to ArrayList
3. LinkedList contains duplicate elements
4. It’s a non-synchronized class
5. Elements can be searched in forward and backward directions
6. Since it’s a doubly linked list, elements can be added/removed from both the sides

   Null --[ 10  ]--[ 10  ]--Null

 */
public class Example1 {

	public static void main(String[] args) {
		
		LinkedList<String> L1= new LinkedList<String>();
		
		L1.add("Test1");
		L1.add("Test2");
		L1.add("Test3");
		
		LinkedList<String> L2= new LinkedList<String>();
		
		L2.add("Test4");
		L2.add("Test5");
		L2.add("Test6");
		
		//L1.addAll(L2);
		//L1.retainAll(L2);
		//L1.retainAll(L2);
		//L1.getLast();
		//L1.getFirst();
		
		Iterator<String> itr = L1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
