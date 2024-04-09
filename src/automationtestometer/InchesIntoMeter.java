package automationtestometer;
import java.util.Scanner;
public class InchesIntoMeter {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter length in inches: ");
	        double inches = scanner.nextFloat();

	        // Convert inches to meters
	        double meters = (inches * 0.0254);

	        System.out.println(inches + " inches is equal to " + meters + " meters.");

	        scanner.close();
	    }
	}


