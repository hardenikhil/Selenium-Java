package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		//  Interface                     Class
			Map<Integer, String> map= new HashMap<Integer, String>();
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
