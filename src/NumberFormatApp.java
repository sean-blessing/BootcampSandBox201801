import java.text.NumberFormat;
import java.util.Scanner;

public class NumberFormatApp {

	public static void main(String[] args) {
		System.out.println("Hi");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter price:  ");
		double price = sc.nextDouble();
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
		String priceStr = currencyFormat.format(price);
		
		System.out.println("Price = "+price);		
		System.out.println("Price String = "+priceStr);		
		sc.close();
		System.out.println("Bye");
	}

}
