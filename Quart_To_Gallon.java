/*
In-Class Activity (Student Starter with TODOs)
Part A: Quarts to Gallons

Goal:
Declare a named constant for quarts per gallon (4), set quartsNeeded=18,
then compute gallons and leftover quarts and print the required sentence.

Run:
  javac QuartsToGallons_Starter.java
  java QuartsToGallons_Starter
*/

public class Quart_To_Gallon {
    public static void main(String[] args) {

        // TODO 1: Declare a named constant for quarts per gallon
        // final int QUARTS_PER_GALLON = 4;
        final int QUARTS_PER_GALLON =4;

        // TODO 2: Declare quartsNeeded and assign 18
        int quartsNeeded = 18;

        // TODO 3: Compute gallons and leftover quarts using / and %
        int gallons = 0; // quartsNeeded / QUARTS_PER_GALLON
        int quarts = 0;  // quartsNeeded % QUARTS_PER_GALLON

        gallons = quartsNeeded/QUARTS_PER_GALLON;
        quarts =  quartsNeeded % QUARTS_PER_GALLON;

        // TODO 4: Display EXACT format:
        // A job that needs 18 quarts requires 4 gallons plus 2 quarts.
        System.out.println("A job that needs " + quartsNeeded + " quarts requires "
                + gallons + " gallons plus " + quarts + " quarts.");
    }
}