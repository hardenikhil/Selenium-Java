package Programs;


public class LengthOfString {

	public static void count(String str){
		//create character array of given string
		char[] ch= str.toCharArray();
		for(int i=0 ; i<ch.length; i++){
		
			//give empty slot to s
			String s= "";
		
			//if char is having space then
			while(i<ch.length && ch[i]!=' '){
				s= s+ ch[i];
				i++;
			}
		if(s.length()> 0){
			System.out.println(s + "->"+ s.length());
			}
		}
		
	}
	public static void main(String[] args) {
		String str= "Hello World";
		count(str);
	}

	
}
