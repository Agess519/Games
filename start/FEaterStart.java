package start;
import java.util.Scanner;
import rule.FEater;

public class FEaterStart {
	private static Scanner sc;

	public static void main(String args[]) {
		String temp;
		sc = new Scanner(System.in);
		
		System.out.println("Welcome to FEater friend! please enter the level you want to challenge!");
		int level = sc.nextInt();
		FEater game = new FEater();
		
		System.out.println("Loading...Remember 'q' is used to quit~ Enter any key to cotinue...");
		temp = sc.next();
		game.play(level);
		
		System.out.println("Nice joy time, isn`t it?");
		temp = sc.next();
		return;
	}
}
