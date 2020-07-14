import java.text.DecimalFormat;
import java.util.Scanner;

public class DistCalc {

	public static void main(String[] args) {
		
		// Creating Scanner and Decimal format
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".000");
		
		// Entering x and y values for two points
		System.out.print("Enter number for first point x: ");
		double x1 = scan.nextInt();
		
		System.out.print("Enter number for first point y: ");
		double y1 = scan.nextInt();
		
		System.out.print("Enter number for second point x: ");
		double x2 = scan.nextInt();
		
		System.out.print("Enter number for second point y: ");
		double y2 = scan.nextInt();
		
		// Creating variables to solve for distance formula using
		// power and sqrt functions
		double xbar = Math.pow((x2 - x1),2);
		double ybar = Math.pow((y2 - y1),2);
		double dist = (double) Math.sqrt(xbar + ybar);
		
		// Printing out dist with 3 decimals
		System.out.print("Distance = " + df.format(dist));
	}

}
