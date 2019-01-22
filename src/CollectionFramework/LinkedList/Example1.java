package CollectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**

--Arraylist & Linked list both are same but linkedlist have faster manipulation
--LinkedList works on Nodes 

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
