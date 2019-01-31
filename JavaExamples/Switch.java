/**
The program illustrates a switch statement for CSci 2101
**/
public class Switch {
	public static void main(String [] args) {
		char letter = 'B';
		double GPA = 0.0;
		
		// a switch statement is typically used 
		// on characters (char) and small ranges of integers
		switch(letter) {
			case 'A': 
				GPA = 4.0;
				break;
			case 'B':	
				GPA = 3.0;
				break;
			case 'C':	
				GPA = 2.0;
				break;
			case 'D': 
				GPA = 1.0;
				break;
			case 'F': 
				GPA = 0.0; // not really needed, but makes the program clearer
				break;
			case 'I': case 'K':
				System.out.println("You are still working on this class");
				break;
			default:
				System.out.println("Unknown grade");
				
		}
		System.out.println("Your GPA is " + GPA);
	}
}