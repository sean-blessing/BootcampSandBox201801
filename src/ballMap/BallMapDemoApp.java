package ballMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import consolehelper.util.Console;

public class BallMapDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		HashMap<Integer, Ball> binOfBalls = new HashMap<Integer, Ball>();
		Ball ball1 = new Ball(1, "black", "L");
		binOfBalls.put(ball1.getId(), ball1);
		Ball ball2 = new Ball(2, "red", "M");
		binOfBalls.put(ball2.getId(), ball2);
		Ball ball3 = new Ball(3, "blue", "S");
		binOfBalls.put(ball3.getId(), ball3);
		Ball ball4 = new Ball(4, "red", "L");
		binOfBalls.put(ball4.getId(), ball4);
		Ball ball5 = new Ball(5, "red", "L");
		binOfBalls.put(ball5.getId(), ball5);
		Ball ball6 = new Ball(6, "green", "S");
		binOfBalls.put(ball6.getId(), ball6);
		Ball ball7 = new Ball(7, "blue", "M");
		binOfBalls.put(ball7.getId(), ball7);
		
		int id = 0;
		while (id!=-1) {
			id = Console.getInt("Enter id (-1 to quit):  ");
			Ball b = binOfBalls.get(id);
			System.out.println(b);
		}
//		Ball ball1 = new Ball(1, "black", "L");
//		binOfBalls.add(ball1);
//		Ball ball2 = new Ball(2, "red", "M");
//		binOfBalls.add(ball2);
//		Ball ball3 = new Ball(3, "blue", "S");
//		binOfBalls.add(ball3);
//		Ball ball4 = new Ball(4, "red", "L");
//		binOfBalls.add(ball4);
//		Ball ball5 = new Ball(5, "red", "L");
//		binOfBalls.add(ball5);
//		Ball ball6 = new Ball(6, "green", "S");
//		binOfBalls.add(ball6);
//		Ball ball7 = new Ball(7, "blue", "M");
//		binOfBalls.add(ball7);
//		
//		//binOfBalls[7] = new Ball("asdfasd","f");  --> generates an ArrayIndexOutOfBoundsException
//		displayArray(binOfBalls);
//		
//		//Arrays.sort(binOfBalls);
//		
//		System.out.println("Sorted Results:");
//		displayArray(binOfBalls);
//		
		System.out.println("Bye");

	}

	private static void displayArray(ArrayList<Ball> balls) {
		for (Ball b : balls) {
			System.out.println(b.toString());
		}
		
	}
}
