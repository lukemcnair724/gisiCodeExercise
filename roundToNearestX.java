/*
	Author: Luke McNair
	Date: 7/9/2014
	Description: Function to round a Number to the nearest X
*/

class roundToNearestX {

	public static void main(String[] args) {
	
		// Check for two parameters
		if (args.length != 2) {
			System.out.println("Input should be two integer parameters only.  i.e. Command should be in the following format, where Number is rounded to nearest X: java roundToNearestX Number X");
			return;
		}
		
		try {
			
			// Parse the program input
			double num = Double.parseDouble(args[0]);
			int x = Integer.parseInt(args[1]);
			
			// Check that X is a positive integer
			if (x < 1) {
				System.out.println("Parameter X must be a positive integer");
				return;
			}
			
			// Call custom rounding function
			roundToNearestX(num, x);
		
		}
		// Check that parameters are not strings
		catch (NumberFormatException e) {
			System.out.println("Parameters should be in the following format: Number must be a number and X must be a positive integer");
		}
		
	}
	
	// Custom rounding function
	static void roundToNearestX(double num, double x) {
	
		double factor = Math.round(num / x);	// Determine multiplicative factor
		Double result = x * factor;				// Result will be X multiplied by factor determined in previous step
		int intResult = result.intValue();		// Convert double to integer for printing purposes
		
		if (intResult == 0)
			System.out.println("Result must not round number to zero");		// Requirement: result must not round to zero.
		else
			System.out.println(intResult);									// All checks have passed, so print result
	
	}
	
}
