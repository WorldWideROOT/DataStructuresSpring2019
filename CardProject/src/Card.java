public class Card {
    private String suit;
    private String value;
    private String [] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private int numericValue;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        setNumericValue();
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    private void setNumericValue() {
        for (int i = 0; i < values.length; ++i) {
            if (values[i].equals(value)) {
                numericValue = i + 2;
            }
        }
    }

    public int getNumericValue() {
        return numericValue;
    }

    public int compareTo(Card other) {
        return this.numericValue - other.numericValue;
    }

    public String toString() {
        return value + " of " + suit;
    }
}
