import java.util.Scanner;

public class SwitchApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the switch app");

		Scanner sc = new Scanner(System.in);
		String color = "";
		while (!color.equals("exit")) {
			System.out.print("Enter a color:  ");
			color = sc.next();
			switch (color) {
			case "red":
				System.out.println("You selected red.");
				break;
			case "blue":
				System.out.println("blue selected");
				break;
			case "green":
				System.out.println("Is it St. Patty's Day yet???");
				break;
			default:
				System.out.println("Booo... don't like your color");
				break;
			}
		}
		sc.close();
		System.out.println("Bye!");
	}

}
