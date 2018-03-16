import java.util.Scanner;

/*
 * This app will draw an arrowhead to 
 * the size specified by the user
 */
public class ArrowheadApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the arrowhead app!");
		Scanner sc = new Scanner(System.in);
		System.out.print("You need to provide the size for the arrowhead.\n"
					   + "How big (# of lines)?");
		int aSize = sc.nextInt();
		// we need to build the arrowhead with the point occurring mid-way
		// so we need to determine where the midpoint is.
		// regardless if size is odd or even, we will divide by 2 and add 1
		int midPoint = (aSize / 2) + 1;
		
		// construct top half of arrow
		for (int i=1;i <= midPoint;i++) {
			String row = "";
			for (int c = 1; c <= i; c++) {
				row += ">";
			}
			System.out.println(row);
		}
		// construct bottom half of arrow
		for (int i=midPoint-1;i > 0;i--) {
			String row = "";
			for (int c = 1; c <= i; c++) {
				row += ">";
			}
			System.out.println(row);
		}
		sc.close();
		System.out.println("Bye!");
	}

}
