/**
   
   An example of using Java predefined sorting methods for 
   arrays. 
   This approach works on arrays of any type T that implement 
   Comparable<T> (i.e. objects that are comparable to themselves).
   The Java Arrays.sort method calls compareTo to find out the
   order of the objects. 
   *
   * @author Elena Machkasova for CSCi 2101
   *
 **/
import java.util.Arrays;
import java.util.Random;

public class UsingJavaSorting {

	public static void main(String[] args) {
		String [] strings = {"kiwi", "banana", "strawberry", "lemon",
				"pear", "apple", "blueberry"};
		
		System.out.println("Before sorting:");
		for (String str: strings) {
			System.out.print(str + " ");
		}
		System.out.println(); // new line
		
		// using a predefined sorting method:
		Arrays.sort(strings);
		
		System.out.println("After sorting:");
		for (String str: strings) {
			System.out.print(str + " ");
		}
		System.out.println(); // new line
		
		int [] numbers = new int[100];
		
		Random rand = new Random();
		
		for (int i = 0; i < numbers.length; ++i) {
			numbers[i] = rand.nextInt(10);
		}

		System.out.println("Before sorting:");
		for (int number: numbers) {
			System.out.print(number + " ");
		}
		System.out.println(); // new line
		
		Arrays.sort(numbers);
		
		System.out.println("After sorting:");
		for (int number: numbers) {
			System.out.print(number + " ");
		}
		System.out.println(); // new line
		
	}

}
