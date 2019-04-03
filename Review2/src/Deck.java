import java.util.Iterator;
import java.util.Random;

public class Deck implements Iterable<Card> {
    Card [] cards = new Card[52];
    Random rand = new Random();

    /**
     Constructor creates a deck of 52 cards
     **/
    public Deck() {
        String [] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String [] values = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        int k = 0;
        for (int i = 0; i < suits.length; ++i) {
            for (int j = 0; j < values.length; ++j) {
                cards[k] = new Card(suits[i],values[j]);
                k++;
            }
        }
    }

    /**
     shuffles the deck by switching cards numSwitches times
     **/
    public void shuffle(int numSwitches) {
        for (int i = 0; i < numSwitches; ++i) {
            // pick two random cards:
            int index1 = rand.nextInt(52);
            int index2 = rand.nextInt(52);

            // switch them:
            Card temp = cards[index1];
            cards[index1] = cards[index2];
            cards[index2] = temp;
        }
    }

    public Iterator<Card> iterator() {
        return null;
    }

    // fill in iterator code here
}
