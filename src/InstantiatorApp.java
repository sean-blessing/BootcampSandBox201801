
public class InstantiatorApp {

	/*
	 * The purpose of this class and method is to 
	 * test if Java creates an empty constructor 
	 * by default.  We'll use a Bicycle class.
	 */
	public static void main(String[] args) {
		// This won't work...  Bicycle does not have a 
		// default / empty arg constructor.
		Bicycle b = new Bicycle("Trek",2);
		System.out.println(b);

	}

}
