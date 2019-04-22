package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Example5 {

	public static void main(String[] args) {
		
		Person p1= new Person(12, "Test1", 25);
		Person p2= new Person(13, "Test2", 26);
		Person p3= new Person(14, "Test3", 27);
		
		ArrayList<Person> a1= new ArrayList<Person>();
		
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		
		Iterator<Person> itr = a1.iterator();
		while(itr.hasNext()){
			Person st = itr.next();
			System.out.println(st.rollno+ "" + st.name+ "" +st.age);
		}
	}
}
