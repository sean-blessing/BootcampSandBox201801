import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator App!!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an int(a):  ");
		int a = sc.nextInt();
		System.out.println("Enter an int(b):  ");
		int b = sc.nextInt();
		
		int result1 = a+b;
		int result2 = a-b;
		int result3 = a*b;
		int result4 = b/a;
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		System.out.println("result4: "+result4);
		
		System.out.println("Bye!");

	}

}
