package CollectionFramework.ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//<<<<<<<<<<<<  Only the difference is we can Iterate Forward & Backward  >>>>>>>>>>>>>>>.

public class Example1 {

 public static void main(String[] args) {
	 
	 ArrayList<String> A1= new ArrayList<String>();
	 
	 A1.add("Test1");
	 A1.add("Test2");
	 A1.add("Test3");
	 A1.add("Test4");
	 
	 System.out.println("Going Forward");
	 ListIterator<String> itr= A1.listIterator();
	 while(itr.hasNext()){
		 System.out.println(itr.next());
	 }
	 
	 System.out.println("Going Backward");
	 while(itr.hasPrevious()){
		 System.out.println(itr.previous());
	 }
		
	
	 
	 
	
 }
}
