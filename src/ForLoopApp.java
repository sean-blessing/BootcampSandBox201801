import java.util.Scanner;

public class ForLoopApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the For Loop Demo");
		Scanner sc = new Scanner(System.in);
		String message = "Let's Go!... ";
		System.out.println("How many times should I run?");
		int max = sc.nextInt();
		for (int i=0; i < max; i++) {
			System.out.println("Run #:"+i);
			message+="run"+i+" ";
		}
		
		System.out.println("Message = "+message);
		sc.close();
		System.out.println("Bye");
	}

}
