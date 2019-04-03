
public class Card implements Comparable<Card>{
    private String Suits;
    private String Value;
    private int numVal;

    public Card(String suit, String value) {
        switch(suit) {
            case "Spades":
                Suits = suit;
                break;
            case "Hearts":
                Suits = suit;
                break;
            case "Clubs":
                Suits = suit;
                break;
            case "Diamonds":
                Suits = suit;
                break;
            default:
                System.out.println("Error: Illegal Suits");
                System.exit(0);
        }
        boolean find = false;
        String[] chaArr = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (int i = 0 ; i < 13 ; i++) {
            if (chaArr[i].equals(value)) {
                find = true;
                Value = value;
                numVal = i + 2;
            }
        }
        if (!find) {
            System.out.println("Error: Illegal Value");
            System.exit(0);
        }
    }

    public String getSuit() {
        return Suits;
    }

    public String getValue() {
        return Value;
    }

    public Integer getNumericValue() {
        return numVal;
    }

    public int compareTo(Card other) {
        return this.numVal - other.numVal;
    }

    public String toString() {
        return Value + " of " + Suits;
    }
}