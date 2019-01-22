package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

/**
---Map contains value on the basis of KEY & VALUE Pair. Each key & value pair is known as Entry
---Only contains unique key
---Map is helpful to search, update or delete element on basis of key
---Methods of Map>>> getKey() & getValue()
 */
public class Example1 {
	
	public static void main(String[] args) {
	//  Interface                     Class
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(10, "Test1");
		map.put(20, "Test2");
		map.put(30, "Test3");
		map.put(40, "Test4");
		
		for(Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
		
		
	}

}
