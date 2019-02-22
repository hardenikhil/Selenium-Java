package Programs;


public class LengthOfString {

	public static void count(String str){
		
		char[] ch= str.toCharArray(); //converted string into array
		
		for(int i=0; i<ch.length; i++){ //H E L L O W O R L D
			
			String s=" ";
			while(i < ch.length){
				s= s + ch[i];
				i++;
			}
		/**if(s.length() > 0){
			System.out.print(s +" "+ s.length());
			
		}**/
			System.out.println(s.length());
		}
		
	}
	
	public static void main(String[] args) {
		String str= "HelloWorld";
		count(str);
	}
}