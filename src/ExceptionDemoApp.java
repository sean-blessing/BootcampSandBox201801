import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Exception Demo App");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Please enter an integer:  ");
			try {
				int i = sc.nextInt();
			}
			catch (InputMismatchException ime) {
				System.out.println("Error...  please enter a valid integer.");
				sc.nextLine();
				continue;
			}
			
			System.out.println("Null Pointer example..");
			String s = null;
			System.out.println("Length of string = "+s.length());
			
			System.out.println("Continue?(y/n)");
			choice = sc.next();
		}
		printTest();
		sc.close();
		System.out.println("bye!");
	}
	
	private static void printTest() {
		System.out.println("print this");
	}
}
