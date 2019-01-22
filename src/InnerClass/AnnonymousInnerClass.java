package InnerClass;

/**
----Class which has no name is called annonymous class
----We can use interface methods directly without implementation
 */
public class AnnonymousInnerClass {

	public static void main(String[] args) {
	
//  Object of Interface
	AnnonymousExample obj= new AnnonymousExample(){
		public void run(){
			System.out.println("Annonoymous inner class implemented");
		}
	};
	
	obj.run();
    }
}
