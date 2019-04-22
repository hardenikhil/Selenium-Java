package StringBuffer;

/**
 --String buffer is used to create mutable string. We can modify string once it is created
 --String buffer class is same string class except its mutable
 */
public class Example1 {
	
	public static void main(String[] args) {
		String s1= "Test";
		s1.concat("123");
		System.out.println(s1);
		
		//Append Method
		StringBuffer sb= new StringBuffer("Test");
		sb.append("456");
		System.out.println(sb);
		
		//Insert Method
		StringBuffer sb1= new StringBuffer("Test");
		sb1.insert(1, "Nik");
		System.out.println(sb1);
		
		//Replace Method
		StringBuffer sb2= new StringBuffer("Test");
		sb2.replace(1, 3, "nik");
		System.out.println(sb2);
		
		//Delete method
		StringBuffer sb3= new StringBuffer("Test");
		sb3.delete(1, 3);
		System.out.println(sb3);
		
		//Reverse method
		StringBuffer sb4= new StringBuffer("Test");
		sb4.reverse();
		System.out.println(sb4);
		
		//Capacity
		StringBuffer sb5= new StringBuffer("Test");
		System.out.println(sb5.capacity());
		
	}	
	
	


}
