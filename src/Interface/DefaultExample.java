package Interface;

//default method is allowed in interface
public interface DefaultExample {

	String getbrand();
	
	String speedup();
	
	String slowdown();
	
	default String turnalarmon()
	{
		return "Turning alarm ON";	
	}
	
	default String turnalarmoff()
	{
		return "Turning Alaram OFF";
	}
}
