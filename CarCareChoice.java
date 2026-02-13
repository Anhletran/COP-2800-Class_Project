import java.util.Scanner;
public class CarCareChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Display menu
        System.out.println("=== Chapa's Car Care Shop ===");
        System.out.println("Available services:");
        System.out.println("- oil change ($25)");
        System.out.println("- tire rotation ($22)");
        System.out.println("- battery check ($15)");
        System.out.println("- brake inspection ($5)");
        System.out.print("\nEnter a service: ");
// TODO 1: Read user input as a full line (String)
        String service = null;
        service = input.nextLine();
// TODO 2: Normalize input (trim + lowercase)
        String normalized = null;
        normalized = service.trim().toLowerCase();
// TODO 3: Determine price based on service using switch or if/else
        boolean valid = true;
        int price = 0;
// TODO 4: Implement the decision logic here
// Prices:
// "oil change" -> 25
// "tire rotation" -> 22
// "battery check" -> 15
// "brake inspection" -> 5
// Otherwise, set valid=false
        switch (normalized) {
            case "oil change":
                price = 25;
                break;
            case "tire rotation":
                price = 22;
                break;
            case "battery check":
                price = 15;
                break;
            case "brake inspection":
                price = 5;
                break;
            default:
                valid = false;
                break;
        }
// TODO 5: Output result
        if (valid) {
            System.out.println("\nService Selected: " + service);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("\nError: Invalid service item. Please choose from the menu.");
        }
        input.close();
    }
}