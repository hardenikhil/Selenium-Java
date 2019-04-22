package CollectionFramework.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {

	public static void main(String[] args) {
		//Interface              class
		Queue<String> queue= new PriorityQueue<>();
		queue.add("Test1");
		queue.add("Test2");
		queue.add("Test3");
		queue.add("Test4");
		queue.add("Test5");
		
		//element() & peek() will get the the head element but will not remove the element
		System.out.println("Head"+ queue.element());
		System.out.println("Head"+ queue.peek());
		
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//remove() & poll() will remove the head element
		queue.remove();
		queue.poll();
		
		System.out.println("After remove the element");
		Iterator<String> itr1 = queue.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
	}
}
