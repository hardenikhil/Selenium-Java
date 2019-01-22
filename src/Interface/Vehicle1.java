package Interface;

public class Vehicle1 implements DefaultExample{

	@Override
	public String getbrand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String speedup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String slowdown() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		Vehicle1 obj= new Vehicle1();
		obj.getbrand();
		obj.slowdown();
		obj.speedup();
		
		
	}

}
