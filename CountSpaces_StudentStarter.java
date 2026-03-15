public class CountSpaces_StudentStarter {
    public static void main(String[] args) {
        String quote = "Believe you can and you're halfway there.";

        // TODO 1: Create a counter variable for spaces
        int spaceCount = 0;

        // TODO 2: Loop through each character in the quote
        for (int i = 0; i < quote.length(); i++) {
            char ch = quote.charAt(i);

            // TODO 3: If the character is a space, increase the counter
            if (ch == ' ') {
                spaceCount++;
            }
        }

        // TODO 4: Print the quote
        System.out.println("Quote: " + quote);

        // TODO 5: Print the total number of spaces
        System.out.println("Total spaces: " + spaceCount);
    }
}

