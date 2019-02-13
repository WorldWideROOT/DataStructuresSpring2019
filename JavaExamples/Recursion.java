
public class Recursion {

	/**
	 * illustrates a recursive factorial
	 */
	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(factorial(10));

		// you can also compute factorial in a loop
	}

	/**
	 * Parameters: integer n Returns: n! for non-negative n, 1 for negative n
	 **/
	public static int factorial(int n) {
		if (n <= 1)
			return 1;
		return n * factorial(n - 1);
	}
	
	// Write a recursive method to compute the greatest common divisor of a and b
	// using Euclid's algorithm: 
	// https://en.wikipedia.org/wiki/Greatest_common_divisor#Using_Euclid's_algorithm

}
