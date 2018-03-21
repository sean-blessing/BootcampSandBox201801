
public class SubstringApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Substring App");
		// Get a string from the user and the # of characters
		// to pull from the end
		
		String str = Console.getString("Enter a string:  ",true);
		int strLength = str.length();
		int num = Console.getInt("How many letters from end of string?", 0, strLength);
		int beginIndex = strLength - num;
		String substring = str.substring(beginIndex);
		
		System.out.println("Substring = "+substring);
		
		System.out.println("Bye");
	}

}
