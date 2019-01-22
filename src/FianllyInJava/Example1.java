package FianllyInJava;

/**
---Finally will executed whether we have handled the exceptions or not

 */

public class Example1 {

	public static void main(String[] args) {
		
		try {
			int i= 9/0;
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		finally{
			System.out.println("I am Finally");
		}
	}
}
