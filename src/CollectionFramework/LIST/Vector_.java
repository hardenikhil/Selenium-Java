package CollectionFramework.LIST;

import java.util.Enumeration;
import java.util.Vector;

/**

1. Vector is same as arraylist except that vector is synchronized
2. Vector maintains insertion order
3. Vector allows duplicate
 */

public class Vector_ {
	 
	   public static void main(String args[]) {
	     
	      Vector<String> vector = new Vector<String>();
	 
	     
	      vector.addElement("c");
	      vector.addElement("c++");
	      vector.addElement("java");
	   
	      System.out.println("Size of Vector is: "+vector.size());
	      System.out.println("Capacity before increment is: "+vector.capacity());
	      vector.addElement("machine learning");
	      vector.addElement("big data");
	      vector.addElement("cloud");
	 
	   
	      System.out.println("Size after addition: "+vector.size());
	      System.out.println("Capacity after increment is: "+vector.capacity());
	 
	         Enumeration en = vector.elements();
	      System.out.println("\nElements are:");
	      while(en.hasMoreElements())
	         System.out.print(en.nextElement() + " ");
	   }
	}