public class Methods {
	public static void main(String[] args) {

		printNumbers(1, 10, 2);
		printNumbers(-10, 0, 1);

		String str = "aardvarks don't eat bananas";

		System.out.println("The string \"" + str + "\" has " + countA(str)
				+ " letters a");

	}

	/**
	 * Parameters: three integers: start, bound, and skip. The method prints
	 * numbers starting at start, no larger than bound, incrementing by skip.
	 * The numbers are printed on a single line, then a new line is printed.
	 **/
	public static void printNumbers(int start, int bound, int skip) {
		for (int i = start; i <= bound; i = i + skip) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	/**
	 * Parameters: String s. The method takes a String and returns the number of
	 * lower-case letters 'a' in the string.
	 **/
	public static int countA(String s) {
		int count = 0;
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == 'a') {
				count++;
			}
		}
		return count; 
	}
	
	// Add the following methods:
	
	// "interleave" that takes a character and a string and returns a string 
	// that has the character interleaved after each character in the given string. 
	//For instance, interleave("abc", '*') returns "a*b*c*"
	
	// "replace" that takes a string and two characters and returns a string 
	// in which every occurrence of the first character is replaced by the second one. 
	// For instance, replace("a cat is cute", 'c', '*') results in "a *at is *ute"
	
	// "printEveryOther" that takes a string and prints its every other character, 
	// starting with the first one.
}