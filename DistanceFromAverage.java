import java.util.Scanner;
public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX = 15;
        final double SENTINEL = 99999;
        double[] values = new double[MAX];
        int count = 0;
        System.out.println("=== Distance From Average ===");
        System.out.println("Enter up to " + MAX + " double values.");
        System.out.println("Type " + (int)SENTINEL + " to stop.\n");
// TODO 1: Loop while count < MAX
        while ( count < MAX)
        {
            System.out.println(" Enter the value " + (count + 1 )+": ");
            double value = input.nextDouble();
            if ( value == SENTINEL) {
                break; }
            else {
                values[count] = value;
                count++;
            }

        }
// - prompt user each time
// - read double
// - if value == SENTINEL -> stop loop
// - else store and increment count
// TODO 2: If count == 0, print:

        if (count == 0) {
            System.out.println("Error: No numbers entered.");
            input.close();
            return;
        }
// "Error: No numbers entered."
// and exit
// TODO 3: Compute average (sum / count)
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += values[i];
        }
        double average = sum / count;
// TODO 4: Display:
        System.out.println("\n--- Results ---");
        System.out.printf("Number of entries: %d%n", count);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("\nValues and distances from average:");
        System.out.println("----------------------------------------");
        System.out.printf("%-10s %-15s%n", "Value", "Distance from Avg");
        System.out.println("----------------------------------------");

        for (int i = 0; i < count; i++) {
            double distance = values[i] - average;
            System.out.printf("%-10.2f %-15.2f%n", values[i], distance);
        }
// - count
// - average
// - each entered value and its distance from average (value - average)
// Tip: use printf for formatting
        input.close();
    }
}