
public class InheritanceDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Book jakesBook = new Book("java", "Murach's Java", 54.50, "Joel Murach");
		Product chrissBook = new Product("java", "Murach's Java", 54.50);
		
		System.out.println(chrissBook);
		System.out.println(jakesBook);
		
		System.out.println("Bye");
	}

}
