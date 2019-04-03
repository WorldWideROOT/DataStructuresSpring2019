public class TestDeck {

    public static void main(String [] args) {
        Deck theDeck = new Deck();
        theDeck.shuffle(200);

        for (Card card: theDeck) {
            System.out.println(card);
        }
    }

}