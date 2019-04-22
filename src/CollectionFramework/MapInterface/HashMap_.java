package CollectionFramework.MapInterface;
import java.util.HashMap;
import java.util.Map;

/**
---Map contains value on the basis of KEY & VALUE Pair. Each key & value pair is known as Entry
---Only contains unique key
---Contains only one null key but multiple null values
---Insertion order not maintained
---Uses method map.put(1,"one") & map.get(1)
 */



public class HashMap_ {
	
	public static void main(String[] args) {
	//  Interface                     Class
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(10, "Test1");
		map.put(20, "Test2");
		map.put(30, "Test3");
		map.put(40, "Test4");
		
		for(Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
		
		
	}

}
