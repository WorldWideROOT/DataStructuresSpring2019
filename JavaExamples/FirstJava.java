/**
The class demonstrates basic features of Java
Author: Elena Machkasova
**/
// every Java program is a class. The class name must be the 
// same as the file name
public class FirstJava {
	
	// main is the starting point of a Java application 
	public static void main(String [] args) {
		// this is where the program code goes
		
		// ********** Primitive types *************** //
		
		// declaring and initializing integer (int) variables n, m.
		// all variables must have a type.
		// Here int is the type, n is the name, and 5 is the value
		int n = 5;

		// printing out the value of n.
		// Note that the + here attaches the value of n
		// to the printed string
		System.out.println("n = " + n);
		
		int m = 6;
		
		// compute the sum of n and m and store it in n
		n = n + m;
		System.out.println("n = " + n);
		
		n++;
		System.out.println("n = " + n);
		
		// other types of variables
		// float - "floating decimal point"
		// used for real numbers, but not the default type
		// you are unlikely to use it
		float f = 3; 
		System.out.println("f = " + f);
		
		// double = double precision floating point
		// the default type for real numbers
		double x = 3.456; 
		x = x + n;
		System.out.println("x = " + x);
		
		// implicit type conversions:
		System.out.println(2/3);
		System.out.println(2.0/3);
		System.out.println(2/3.0);
		System.out.println(2.0/3.0);
		
		// character type (char)
		// Note: a character value is one symbol in single quotes
		char c1 = 'A'; // a letter
		char c2 = 'a';
		char c3 = '5'; // a digit
		char c4 = '?'; // a symbol
		System.out.println(c1);
		System.out.println("The characters are: " + c1 + c2 + c3 + c4);

		// booleans (true/false)
		boolean b = true;
		System.out.println("b = " + b);
		b = x < 5;
		System.out.println("b = " + b);
		
		// simple 'if' statements
		if (x < 5) {
			System.out.println("x < 5");
		} else {
			System.out.println("x >= 5");
		}
		
		// other comparisons:
		if (x == 5) {
			System.out.println("x is equal to 5");
		} else {
			System.out.println("x is not equal to 5");
		}
		
		// character comparison
		if (c1 == c2) {
			System.out.println(c1 + " is the same as " + c2);
		} else {
			System.out.println(c1 + " is not the same as " + c2);
		}

		// ********** Object types *************** //
		
		// java strings are objects
		// Strings have multiple symbols in double quotation marks
		String name = "Mary Smith";
		System.out.println(name);
		// strings are objects so we can call methods on them
		// here toLowerCase is a method
		System.out.println(name.toLowerCase());
		
		// did the string "name" change? 
		// System.out.println(name);
		
		String name2 = name;
		//System.out.println(name2);		
		
		// continue playing with strings here
	}
}
