import java.util.Scanner;

public class IntArray {

	/**
	 * The class illustrates arrays of integers in Java 
	 * Author: Elena Machkasova
	 * For: CSci 2101
	 */
	public static void main(String[] args) {
		int[] simpleArray = { 3, -1, 4 };

		// this prints the address of the array,
		// not the elements. You need a loop to print
		// elements
		System.out.println(simpleArray);

		// a method that prints an array element by element
		// (see below)
		printIntArray(simpleArray);

		// the loop adds 1 to each element of simpleArray
		for (int i = 0; i < simpleArray.length; ++i) {
			simpleArray[i] = simpleArray[i] + 1;
		}

		printIntArray(simpleArray);

		// creating an array whose size is given by a variable:

		// reading in the array size
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter the array size:");
		int n = read.nextInt();

		// creating a new array:
		int[] arr = new int[n];

		// all elements are initialized to the default int value 0:
		printIntArray(arr);

		// setting elements to numbers from n to 1 (decreasing):
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = n - i;
		}

		printIntArray(arr);

		System.out.println(sumArray(arr));
		
		//close the scanner
		read.close();
	}

	/**
	 * 
	 * The method prints its argument <code>arr</code>
	 * 
	 * element by element on one line, separated by commas, with [ before the first
	 * element and ] after the last one
	 *
	 */
	public static void printIntArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i]);
			if (i != arr.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}

	/**
	 * The method takes an array of integers and returns its sum
	 **/
	public static int sumArray(int[] arr) {
		int sum = 0;
		// enhanced 'for' loop, a.k.a. for-each loop
		// can be used when indices don't matter
		// and the array is not modified
		for (int item : arr) {
			sum += item; // the same as: sum = sum + item;
		}
		return sum;
	}

}