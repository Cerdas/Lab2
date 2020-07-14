import java.util.Scanner;

public class NumDisplay {

	public static void main(String[] args) {
		
		// Creating Scanner
		Scanner scan = new Scanner(System.in);
		
		// Entering a value into num
		System.out.print("Enter a number between 0 - 9: ");
		int num = scan.nextInt();
		
		// Creating a switch function to print out the spelling
		// of the number input and to handle numbers outside the
		// range
		switch(num)
		{
		case 9:
			System.out.print("Nine");
			break;
		case 8:
			System.out.print("Eight");
			break;
		case 7:
			System.out.print("Seven");
			break;
		case 6:
			System.out.print("Six");
			break;
		case 5:
			System.out.print("Five");
			break;
		case 4:
			System.out.print("Four");
			break;
		case 3:
			System.out.print("Three");
			break;
		case 2:
			System.out.print("Two");
			break;
		case 1:
			System.out.print("One");
			break;
		default:
			System.out.print("Not a valid number");
		}
		
	}

}
