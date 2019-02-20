public class StringArray {

	/**
	 * The program illustrates an array of objects (strings)
	 */
	public static void main(String[] args) {
		String[] strings = new String[5];

		// there are no actual strings in the array
		printStringArray(strings);

		strings[0] = "lion";
		strings[1] = "tiger";
		strings[2] = "panther";
		strings[3] = "cougar";
		strings[4] = "lynx";

		printStringArray(strings);

		// write a method that finds and returns the string in the array
		// that's first alphabetically.
		// Hint: use compareTo method:
		// https://docs.oracle.com/javase/9/docs/api/java/lang/String.html#compareTo-java.lang.String-

		// which loop would you use: 'for' or enhanced 'for'?
	}

	/**
	 * 
	 * The method prints its argument <code>arr</code>
	 * 
	 * element by element on one line, separated by commas, with [ before the first
	 * element and ] after the last one
	 *
	 */
	public static void printStringArray(String[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i]);
			if (i != arr.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}

}
