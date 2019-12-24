package start;
import java.util.Scanner;
import rule.FEater;

public class FEaterStart {
	private static Scanner sc;

	public static void main(String args[]) {
		String temp;
		sc = new Scanner(System.in);
		
		System.out.println("Welcome to FEater friend!");
		System.out.println("W:move up");
		System.out.println("A:move left");
		System.out.println("S:move down");
		System.out.println("D:move right");
		System.out.println("Q:i quit!");
		System.out.println("Attention! there `s STEP LIMIT for you, and you can get 5 more STEP and 1 score when you get a F");
		System.out.println("please enter the level you want to challenge!");

		int level = sc.nextInt();
		FEater game = new FEater();
		
		System.out.println("Loading...Enter any key to cotinue...");
		temp = sc.next();
		game.play(level);
		
		System.out.println("Nice joy time, isn`t it?");
		temp = sc.next();
		return;
	}
}
