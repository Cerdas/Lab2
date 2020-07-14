import java.util.Random;
import java.util.Scanner;

public class UserNames {

	public static void main(String[] args) {
		
		// Create Scanner and Random
		Scanner scan = new Scanner(System.in);
		Random num = new Random();
		
		// Getting first and last name
		System.out.print("Enter first name: ");
		String first = scan.nextLine();
		
		System.out.print("Enter last name: ");
		String second = scan.nextLine();
		
		// Creating user name using for loop 
		// and .charAt() function
		String user = "";
		for(int i = 0; i <= 3; i++) {
			user += second.charAt(i);
		}
		user += first.charAt(0);
		user += (10 + num.nextInt(89));
		
		// Printing out beginning of sentence
		System.out.print("Your username is: " + user);
		
	}

}
