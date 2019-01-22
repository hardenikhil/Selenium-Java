package Interface;

public class BankTestclass {

	public static void main(String[] args) {
		
		Bank obj= new BankHDFC();
		obj.Rateofinterest();
		
		Bank obj2=new BankSBI();
		obj2.Rateofinterest();
	}

}
