/*
Exercise 1 — Trip Cost & Fuel Analyzer (Student Starter with TODOs)
Focus: variables, primitive types, operators, input, if/else, formatted output

Compile/Run:
  javac TripCostAnalyzer_Starter.java
  java TripCostAnalyzer_Starter
*/

import java.util.Scanner;

public class TripCostAnalyzer_Starter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // TODO 1: Create at least one named constant (final)
        // Example: final double MIN_POSITIVE = 0.0001;
        final double MIN_POSITIVE = 0.0001;

        System.out.println("=== Trip Cost & Fuel Analyzer ===");

        // TODO 2: Read inputs (double, double, double, int)
        System.out.print("Distance (miles): ");
        double distance = 0.0; // TODO: input.nextDouble()
        distance =input.nextDouble();

        System.out.print("Fuel efficiency (mpg): ");
        double mpg = 0.0; // TODO: input.nextDouble()
        mpg = input.nextDouble();

        System.out.print("Gas price per gallon ($): ");
        double pricePerGallon = 0.0; // TODO: input.nextDouble()
        pricePerGallon = input.nextDouble();
        System.out.print("Passengers (whole number): ");
        int passengers = 0; // TODO: input.nextInt()
        passengers = input.nextInt();

        // TODO 3: Validate inputs using if/else:
        // - distance > 0
        // - mpg > 0
        // - pricePerGallon >= 0
        // - passengers >= 0
        // If invalid, print a clear message and exit (return).
        if (distance <= 0 )
        {
            System.out.println( " Error:  Distance must be greater than 0 miles.");
            return;
        }
        else if (mpg <=0)
        {
            System.out.println(" Error: Fuel efficiency must be greater than 0 MPG.");
            return;
        }
        else if (pricePerGallon <= 0)
        {
            System.out.println (" Error: The Gas price can not be negative.");
            return;
        }
        else if (passengers <=0 )
        {
            System.out.println (" Error: The Passengers can not be negative.");
            return;

        }

            // TODO 4: Compute gallonsNeeded, totalCost, costPerMile
            double gallonsNeeded = 0.0;  // distance / mpg
            gallonsNeeded = distance / mpg;
            double totalCost = 0.0;      // gallonsNeeded * pricePerGallon
            totalCost = gallonsNeeded * pricePerGallon;
            double costPerMile = 0.0;    // totalCost / distance
            costPerMile = totalCost / distance;
            // TODO 5: If passengers > 0, compute costPerPassenger = totalCost / passengers
            double costPerPassenger = 0.0;
            if (passengers > 0) {
                costPerPassenger = totalCost / passengers;
            }

            // TODO 6: Print results using printf (2 decimals)
            System.out.println("\n--- Results ---");
            // System.out.printf("Gallons needed: %.2f%n", gallonsNeeded);
            System.out.printf("Gallons needed: %.2f%n", gallonsNeeded);
            System.out.printf(" Total Cost Trip needed: %.2f%n", totalCost);
            System.out.printf(" Cost Per Mile needed: %.2f%n", costPerMile);
            System.out.printf(" Cost Per Passengers needed: %.2f%n", costPerPassenger);

            // TODO 7: Add comments explaining why you chose your data types and formulas.
            // I choose double for distance, mpg, pricePerGallon , gallonsNeed, totalCost, costPerMiles,
        // costPerPassengers because all these variable will hold real number
            // I choose int for passenger because only this values will hold whole number
            //gallonsNeeded = distance / mpg; we will divide miles by MPG to get gallons
            //totalCost = gallonsNeeded * pricePerGallon;  we will multiply gallons by price for total cost
            //costPerMile = totalCost / distance; we will divide total cost by miles for per-mile cost
            //costPerPassenger = totalCost / passengers;we will  divide total cost by passengers to share cost
            input.close();

    }
}
