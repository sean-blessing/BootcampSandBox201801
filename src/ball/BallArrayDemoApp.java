package ball;

import java.util.Arrays;

public class BallArrayDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Ball[] binOfBalls = new Ball[7];
		Ball ball1 = new Ball("black", "L");
		binOfBalls[0] = ball1;
		Ball ball2 = new Ball("red", "M");
		binOfBalls[1] = ball2;
		Ball ball3 = new Ball("blue", "S");
		binOfBalls[2] = ball3;
		Ball ball4 = new Ball("red", "L");
		binOfBalls[3] = ball4;
		Ball ball5 = new Ball("red", "L");
		binOfBalls[4] = ball5;
		Ball ball6 = new Ball("green", "S");
		binOfBalls[5] = ball6;
		Ball ball7 = new Ball("blue", "M");
		binOfBalls[6] = ball7;
		
		//binOfBalls[7] = new Ball("asdfasd","f");  --> generates an ArrayIndexOutOfBoundsException
		displayArray(binOfBalls);
		
		Arrays.sort(binOfBalls);
		
		System.out.println("Sorted Results:");
		displayArray(binOfBalls);
		
		System.out.println("Bye");

	}

	private static void displayArray(Ball[] balls) {
		for (Ball b : balls) {
			System.out.println(b.toString());
		}
		
	}
}
