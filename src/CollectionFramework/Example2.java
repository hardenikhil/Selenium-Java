package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
/**
 <<<<<<<<<<< Array List Syntax >>>>>>>>>>>>>
 */
public class Example2 {

	public static void main(String[] args) {
		
		//You can create reference of Interface class & object of class
		//======================================================================
		// LIST INTERFACE>>>>>>>>>>>>>
		
		List list = new ArrayList<>();
		List list1 = new LinkedList<>(); //Can consider any data type
		
		list.add(2);
		list.add(true);
		list.add("Character");
		
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new LinkedList<>(); //can consider only integer data type
		
		//You can create reference & object of same class
		//<> means you can add data type in it
		ArrayList<String> a1 = new ArrayList<String>();
		LinkedList<String> L1 = new LinkedList<String>();
		
		//<Object> means it can consider any data tye
		ArrayList<Object> a2 = new ArrayList<Object>();
		LinkedList<Object> L2 = new LinkedList<Object>();
		
		a2.add(2);
		a2.add(true);
		a2.add("Hey");
		
		//=====================================================================
		// SET INTERFACE >>>>>>>>>>>>>>>>>>>>>>>>
		Set set = new HashSet<>();
		Set set1= new LinkedHashSet<>();
		Set set2 = new TreeSet<>();
		
		Set<Integer> set3 = new HashSet<Integer>();
		Set<String> set4 = new LinkedHashSet<String>();
		Set<Object> set5 = new TreeSet<Object>();
		
		HashSet<Integer> set6 = new HashSet<Integer>();
		LinkedHashSet<String> set7 = new LinkedHashSet<String>();
		TreeSet<Object> set8 = new TreeSet<Object>();
		
		//=====================================================================
		// MAP INTERFACE
		
		Map map = new HashMap<>();
		Map map1 = new LinkedHashMap<>();
		Map map2 = new TreeMap<>();
		
		Map<Integer, String> map3 = new HashMap<Integer, String>();
		Map<Integer, String> map4 = new LinkedHashMap<Integer, String>();
		Map<Integer, String> map5 = new TreeMap<Integer, String>();
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> map7 = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> map8 = new TreeMap<Integer, String>();
		
		Map<Integer, String> table = new Hashtable<Integer, String>();
		Hashtable<Integer, String> table1 = new Hashtable<Integer, String>();
	}
}
