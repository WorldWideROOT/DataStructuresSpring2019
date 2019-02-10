
public class ConvertingDigitToNumber {

	public static void main(String[] args) {
		char c = '7'; // c is a character, its value is its ASCII code:
		// http://www.asciitable.com/
		
		// When we print it, it looks like the number that it was set to:
		System.out.println(c); 
		// But arithmetic on it shows that its code is different from
		// the digit that it represents:
		System.out.println(c + 1);
		
		// ASCII codes for digits are in order, so subtracting the 
		// ASCII code of '0' gives you the numeric value of a digit:
		// '0' - '0' = 0, '1' -'0' = 1, etc. 
		int n = c - '0';
		System.out.println(n); //looks the same, but now it's a number
		// And now we can do arithmetic with the integer: 
		int m = n + 10;
		System.out.println(m);
	}

}
