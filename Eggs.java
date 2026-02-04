import java.util.Scanner;

public class Eggs {

    // TODO 1: Create constants for prices:
    private static final double PRICE_PER_DOZEN = 3.25;
    private static final double PRICE_PER_LOOSE_EGG = 0.45;

    // TODO 2: Calculate full dozens
    public static int calculateDozens(int eggs) {
        return eggs / 12;
    }

    // TODO 3: Calculate loose eggs
    public static int calculateLooseEggs(int eggs) {
        return eggs % 12;
    }

    // TODO 4: Calculate total cost
    public static double calculateTotalCost(int dozens, int looseEggs) {
        return (dozens * PRICE_PER_DOZEN) + (looseEggs * PRICE_PER_LOOSE_EGG);
    }

    // TODO 5: Build explanation
    public static String buildExplanation(int eggs, int dozens, int looseEggs, double total) {
        return "You ordered " + eggs + " eggs. That’s " +
                dozens + " dozen at $" + String.format("%2f",PRICE_PER_DOZEN) +
                " per dozen and " + looseEggs +
                " loose eggs at $" + String.format("%2f",PRICE_PER_LOOSE_EGG )+
                " each for a total of $" +  total + ".";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of eggs in the order: ");
        int eggs = input.nextInt();

        // TODO 6: Validate input
        if (eggs < 0) {
            System.out.println("Error: Number of eggs cannot be negative.");
            input.close();
            return;
        }

        // TODO 7: Use methods
        int dozens = calculateDozens(eggs);
        int looseEggs = calculateLooseEggs(eggs);
        double totalCost = calculateTotalCost(dozens, looseEggs);
        String explanation = buildExplanation(eggs, dozens, looseEggs, totalCost);

        // TODO 8: Print explanation
        System.out.println(explanation);

        input.close();
    }
}
