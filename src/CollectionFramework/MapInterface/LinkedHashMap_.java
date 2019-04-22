package CollectionFramework.MapInterface;

import java.util.LinkedHashMap;

/**

--LinkedHashMap is based on HashTable and LinkedList implementation
--It also stores elements in the key-value pair like any other Map
--Maintains the Insertion order of elements
--It can have Null Key and Null Values

 */

public class LinkedHashMap_ {

	public static void main(String[] args) {
		//  Interface                     Class
		    LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
			map.put(10, "Test1");
			map.put(20, "Test2");
			map.put(30, "Test3");
			map.put(40, "Test4");
			System.out.println("Before Remove the key"+ map);
			//remove command will remove the element
			map.remove(10);
			System.out.println("After Remove the key"+ map);
  }
}
