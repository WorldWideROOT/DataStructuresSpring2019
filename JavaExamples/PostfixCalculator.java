import java.util.Stack;
import java.util.Scanner;

public class PostfixCalculator {
	/**
	 * The program reads input of digits and symbols +,-,*,/ that form valid postfix
	 * expressions of binary arithmetic operations. In postfix notation an operation
	 * follows its operands: 7 8 + means 7 + 8 and evaluates to 15. 2 3 + 7 * means
	 * (2 + 3) * 7 and evaluates to 35. Postfix notation doesn't use parentheses.
	 * 
	 * In this program for simplicity we only use single digit numbers as input and
	 * don't use spaces.
	 * 
	 * Example: 653*+83-+ = (6 + (5 * 3)) + (8 - 3) = 26
	 * 
	 * Minimum requirements: 
	 * The program correctly evaluates a well-formatted postfix expression. 
	 * It doesn't need to handle spaces in data (it may give
	 * incorrect results or break with an error). 
	 * If the input is not well-formed then an error may occur or
	 * an incorrect result may be returned.
	 * 
	 * Optional features to implement: error messages when the
	 * input is not well-formed to indicate what went wrong. For instance,
	 * when there are not operands, such as 657+, your program
	 * can print something like: "Missing an operand." 
	 * Note that this is a difficult problem since you don't always have
	 * enough information to explain what the error is. 
	 **/

	public static void main(String[] args) {
		// create a new scanner to read the data in
		Scanner read = new Scanner(System.in);
		// prompt the use for data
		System.out.println("Please enter your input string");
		// read the entire expression
		String input = read.next(); // reads until a whitespace or new line
		// print it back to make sure that it was read correctly
		System.out.println(input);

		// create a new stack. It stores the intermediate results
		// of the expression
		Stack<Integer> holder = new Stack<>();

		for (int i = 0; i < input.length(); ++i) {
			// getting the next character of the string
			char c = input.charAt(i);

			// variables to store the operands are declared outside
			// of if/else for easier reuse
			int num1 = 0, num2 = 0;

			// checking if the character is a digit
			if (Character.isDigit(c)) {
				// fill in your code here
			} else {
				// fill in your code here
			}

		}

		// print the result here

	}

}
