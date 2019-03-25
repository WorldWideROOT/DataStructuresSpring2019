/**
   
   An example of using Java predefined sorting methods for 
   arrays. 
   This approach works on arrays of any type T that implement 
   Comparable<T> (i.e. objects that are comparable to themselves).
   The Java Arrays.sort method calls compareTo to find out the
   order of the objects.
   Similarly Collections.sort can be used to sort an ArrayList or
   any other data structure that implements List interface.
   *
   * @author Elena Machkasova for CSCi 2101
   *
 **/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

		System.out.println("Array before sorting:");
		for (int number: numbers) {
			System.out.print(number + " ");
		}
		System.out.println(); // new line
		
		Arrays.sort(numbers);
		
		System.out.println("Array after sorting:");
		for (int number: numbers) {
			System.out.print(number + " ");
		}
		System.out.println(); // new line

		// Sorting an array list
		ArrayList<Integer> numbers2 = new ArrayList<>();

		for (int i = 0; i < 100; ++i) {
			numbers2.add(rand.nextInt(10));
		}

		System.out.println("Array list before sorting:");
		for (int number: numbers2) {
			System.out.print(number + " ");
		}
		System.out.println(); // new line

		Collections.sort(numbers2);

		System.out.println("Array list after sorting:");
		for (int number: numbers2) {
			System.out.print(number + " ");
		}
		System.out.println(); // new line
	}

}
