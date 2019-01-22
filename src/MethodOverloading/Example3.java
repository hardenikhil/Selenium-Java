package MethodOverloading;

/**
 * ---Method overloading can have same method name but different return type
 */

public class Example3 {

	public void test() {

	}

	public int test(int i) {
		return i;
	}

	public boolean test(String flag) {
		if (flag.contains("test")) {
			return true;
		} else {
			return false;
		}
	}
}