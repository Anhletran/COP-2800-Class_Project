import java.util.Scanner;
/**
 * Part B: Mini-Project — Inventory Management System (Student Starter with TODOs)
 *
 * Requirements:
 * 1) Use a for loop to display product names and quantities.
 * 2) Use a while loop to allow continuous updates until exit.
 * 3) Use a do-while loop to validate quantity input (must be an int >= 0).
 */
public class Part2_InventorySystem_Starter {
    public static void main(String[] args) {
        String[] products = {"Laptop", "Smartphone", "Tablet", "Headphones",
                "Smartwatch"};
        int[] quantities = {10, 15, 8, 20, 12};
        Scanner scanner = new Scanner(System.in);
// TODO: Print the initial inventory using a for loop
// Example:
// 1. Laptop - Qty: 10
// 2. Smartphone - Qty: 15
// ...
        System.out.println("Initial Inventory:");

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - Qty: " + quantities[i]);
        }

        boolean running = true;
// TODO: Use a while loop to repeat a menu until user exits:
// Menu options:
// 1) Display Inventory
// 2) Update Quantity
// 0) Exit
// Hints:
// - Read choice as int
// - Use if/switch to handle options
// - For Update:
// - Ask which product number (1..N)
// - Validate product selection
// - Use do-while to validate new quantity:
// - must be integer (use scanner.hasNextInt())
// - must be >= 0
// - Update quantities[productIndex]


        while (running) {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1) Display Inventory");
            System.out.println("2) Update Quantity");
            System.out.println("0) Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display inventory
                    System.out.println("\nCurrent Inventory:");
                    for (int i = 0; i < products.length; i++) {
                        System.out.println((i + 1) + ". " + products[i] + " - Qty: " + quantities[i]);
                    }
                    break;

                case 2:
                    // Update quantity
                    System.out.println("\nSelect product to update:");
                    for (int i = 0; i < products.length; i++) {
                        System.out.println((i + 1) + ". " + products[i] + " - Current Qty: " + quantities[i]);
                    }

                    System.out.print("Enter product number (1-" + products.length + "): ");
                    int productNum = scanner.nextInt();

                    // Validate product selection
                    if (productNum >= 1 && productNum <= products.length) {
                        int newQuantity;
                        int productIndex = productNum - 1;

                        // Use do-while to validate quantity input
                        do {
                            System.out.print("Enter new quantity for " + products[productIndex] + " (must be >= 0): ");

                            if (scanner.hasNextInt()) {
                                newQuantity = scanner.nextInt();
                                if (newQuantity >= 0) {
                                    // Valid input
                                    break;
                                } else {
                                    System.out.println("Error: Quantity must be >= 0. Please try again.");
                                }
                            } else {
                                System.out.println("Error: Please enter a valid integer.");
                                scanner.next(); // Clear invalid input
                                newQuantity = -1; // Set to invalid value to continue loop
                            }
                        } while (true);

                        // Update the quantity
                        quantities[productIndex] = newQuantity;
                        System.out.println("Quantity updated successfully!");
                    } else {
                        System.out.println("Error: Invalid product number. Please try again.");
                    }
                    break;

                case 0:
                    // Exit
                    running = false;
                    System.out.println("Exiting Inventory System...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 0.");
            }
        }
        System.out.println("Goodbye!");
        scanner.close();
    }
}
