
public class FloatEqu {

	public static void main(String[] args) {

		// Creating variables and initializing 
		double x = (1.0 / 10) * (1.0 / 10);
		double y = (1.0 / 100);
		
		// Checking to see if x and y are equal
		if(x == y) {
			System.out.println("Equal!");
		}
		else {
			System.out.println("Not Equal!");
		}

		// Creating tolerance 
		double TOLERANCE = 0.001;
		
		// Checking to see if x and y are equal
		// with tolerance
		if(Math.abs(x - y) < TOLERANCE) {
			System.out.print("Equal with tolerance!");
		}
		else {
			System.out.print("Not Equal with tolerance!");
		}
	}

}
