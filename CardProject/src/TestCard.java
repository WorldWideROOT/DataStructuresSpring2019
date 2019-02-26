public class TestCard {

    /**
     * test the Card object
     */
    public static void main(String[] args) {
        Card aceSpades = new Card("Spades", "A");
        // expect: Spades
        System.out.println(aceSpades.getSuit());
        // expect: A
        System.out.println(aceSpades.getValue());
        // expect: 14
        System.out.println(aceSpades.getNumericValue());

        Card fiveHearts = new Card("Hearts", "5");
        // expect: Hearts
        System.out.println(fiveHearts.getSuit());
        // expect: 5
        System.out.println(fiveHearts.getValue());
        // expect: 5
        System.out.println(fiveHearts.getNumericValue());

        // user-friendly printing of a card: implement toString
        System.out.println(aceSpades);
        System.out.println(fiveHearts);

        /*
         * // this should cause the program to exit Card invalidValue = new
         * Card("Hearts", "S");
         */

        // Comparison of cards by value
        // expect: a value > 0
        System.out.println(aceSpades.compareTo(fiveHearts));
        // expect: a value < 0
        System.out.println(fiveHearts.compareTo(aceSpades));
        // expect: a value = 0
        System.out.println(aceSpades.compareTo(aceSpades));

    }

}