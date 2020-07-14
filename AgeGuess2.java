import java.util.Random;
import java.util.Scanner;

public class AgeGuess2 {

	public static void main(String[] args) {
		// Creating Scanner and Random
		Scanner scan = new Scanner(System.in);
		Random num = new Random();
				
		// Creating variables and initialize age
		String name;
		int ageGuess;
		int age = num.nextInt(100);
		
		
		// Asking user to input name using scan
		System.out.print("Enter your name: ");
		name = scan.nextLine();

		// Asking user to input age using scan
		System.out.print("Guess your age: ");
		ageGuess = scan.nextInt();
		
		// Displaying info from obtain inputs
		System.out.print("Your name is " + name + " and your age is " + ageGuess +
				". The correct age is " + age);
	}

}
