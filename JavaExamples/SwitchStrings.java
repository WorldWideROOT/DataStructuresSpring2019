/**
The program illustrates a switch statement on strings for CSci 2101
**/
public class SwitchStrings {
	public static void main(String [] args) {
		String letter = "B+";
		double GPA = 0.0;
		
		// a switch statement works on strings in Java 7 and above
		switch(letter) {
			case "A": 
				GPA = 4.0;
				break;
			case "A-": 
				GPA = 3.7;
				break;
			case "B+":
				GPA = 3.3;
				break;
			case "B":	
				GPA = 3.0;
				break;
			case "B-":
				GPA = 2.7;
				break;
			case "C+":
				GPA = 2.3;
				break;
			case "C":	
				GPA = 2.0;
				break;
			case "C-":
				GPA = 1.7;
				break;
			case "D+":
				GPA = 1.3;
				break;
			case "D": 
				GPA = 1.0;
				break;
			case "F": 
				GPA = 0.0; // not really needed, but makes the program clearer
				break;
			case "I": case "K":
				System.out.println("You are still working on this class");
				break;
			default:
				System.out.println("Unknown grade");
				
		}
		System.out.println("Your GPA is " + GPA);
	}
}