import java.util.Scanner;
import java.util.Stack;

public class MatchingParentheses {

	/**
	 * A solution for the matching parentheses problem.
	 * A given string consists of characters (without white spaces) and 
	 * may have any number of parentheses and curly braces. The program 
	 * checks if all parentheses and braces form matching 
	 * non-overlapping pairs. There may be any symbols in-between 
	 * parentheses and/or braces. 
         *
         * For instance, the following two 
	 * strings are valid sequences: 
	 * ab(c{}de(fghi))jk
	 * (a(b)c)d{e(f)}g
         *
	 * The following sequences are not valid:
	 * ab(c{de(fghi))jk (missing a closing curly brace)
	 * (a(b))c)d{e(f)}g (an extra closing parenthesis after c)
	 * (a{b)c} (overlapping parentheses and braces)
	 * }{ (a closing brace before an opening one)
	 * a(b(c) (missing a closing parenthesis)
         *
	 * The program prints the given string and the word "valid"
	 * or "invalid". If the string is invalid, additionally a brief 
	 * message is printed indicating what the problem is. For instance,
	 * when an opening parenthesis doesn't have a closing one, a message 
	 * might say "Missing a closing parenthesis". 
	 */
	
	public static void main(String[] args) {
		Stack<Character> symbols = new Stack<>();
		
		// reading input. Assumption: no whitespaces
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter your input string");
		String input = read.next(); // reads until a whitespace or new line
		
		// checking the input/output
		System.out.println(input);
		
		// this variable might be helpful
		boolean isValid = true;
		

	}

}