package Interface;

/**

* Static Interface can be used in interface where we can right method
* Static Interface we can call by using reference of static interface not by object

 */

public interface StaticInterface {
	
	static int gethorsepower(int rpm, int torque)
	{
		return (rpm*torque)/5252;
		
	}

}
