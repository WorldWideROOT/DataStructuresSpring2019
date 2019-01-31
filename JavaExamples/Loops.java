public class Loops {
	public static void main(String [] args) {
		int n = 10;
		int i = 0;
		// a very boring loop: just prints numbers in order
		while (i <= n) {
			System.out.print(i + " ");
			i = i + 1;
		}
		System.out.println(); // go to a new line 
		
		// write a loop to print the numbers from 10 to 0 
		// in decreasing order
		
		i = n; 
		while (i >= 0) {
			System.out.print(i + " ");
			i = i - 1;			
		}
		System.out.println(); // go to a new line 
		
		// same thing as a 'while' loop
		for(i = 0; i <= n; i++) { //i++ is a shortcut for i = i + 1
			System.out.print(i + " ");
		}
		System.out.println(); 
			
		// print the numbers in the decreasing order:
		for(i = n; i >= 0; i--) { //i++ is a shortcut for i = i + 1
			System.out.print(i + " ");
		}
		System.out.println();

		// write a loop that prints every other number,
		// from 1 to 15

		// and then the same numbers, but backward
		
		String str = "aardvarks don't eat bananas";
		
		int count = 0;
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == 'a') {
				count++;
			} 
		}

		System.out.println("'" + str + "' has " + count + " letters 'a'");
	       
	}
}
