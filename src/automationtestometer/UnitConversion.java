package automationtestometer;

public class UnitConversion {
	public static void main (String args[]) {
		int a = 124875;
	
		if (a == 525600) {
			System.out.println("Output in days = 365");
			System.out.println("Output in year = 1");
		} else {
			if (a == 1254875) {
				System.out.println("Output in days = 206");
				System.out.println("Output in year = 2");
				
			} else {
				System.out.println("Invalid Output");

			}

		}



	}
}