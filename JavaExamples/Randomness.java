import java.util.Random;

public class Randomness {
	public static void main(String [] args) {
		// objects (other than Strings) are created using "new"
		Random rand = new Random(); // create a random number generator
		
		// Change this program so that it has a different probability
                // of rain, such as 3/8 (pick your own)
		
		System.out.println("Will it snow tonight?");
		
		int guess = rand.nextInt(2); // an int in 0, 1 range
		
		if (guess == 0) {
			System.out.println("It will not snow tonight");	
		} else {
			System.out.println("It will snow tonight!");	
		}
	}
}