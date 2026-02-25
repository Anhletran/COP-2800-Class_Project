public class Card {
    // TODO 1: Create fields:
    // - suit (char): 's','h','d','c'
    // - value (int): 1..13
    private char suit;
    private int value;

    // TODO 2: Create a constructor that accepts suit and value.
    // - assign suit directly
    // - call setValue(value) to enforce validation
    public Card(char suit, int value) {
        // TODO: this.suit = suit;
        // TODO: setValue(value);
        this.suit = suit;
        setValue(value);
    }

    public char getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    /**
     * TODO 3: Implement setValue(int value)
     * Rules:
     * - If value < 1 OR value > 13, set this.value to 1
     * - Otherwise set this.value to the provided value
     */
    public void setValue(int value) {
        // TODO
        if (value < 1 || value > 13) {
            this.value = 1;
        } else {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        return value + " of " + suitToName(suit);
    }

    private String suitToName(char s) {
        return switch (s) {
            case 's' -> "Spades";
            case 'h' -> "Hearts";
            case 'd' -> "Diamonds";
            case 'c' -> "Clubs";
            default -> "Unknown";
        };
    }
}