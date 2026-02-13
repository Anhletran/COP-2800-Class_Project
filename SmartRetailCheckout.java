import java.util.Scanner;
public class SmartRetailCheckout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Smart Retail Checkout ===");
// TODO 1: Prompt for category (G/E/C/H) and read as char
        char category = 'X';
        System.out.print("Enter category (G=Grocery, E=Electronics, C=Clothing, H=Home): ");
        category = input.next().toUpperCase().charAt(0);
// TODO 2: Prompt for quantity (int). Validate: > 0
        int qty = 0;
        do {
            System.out.print("Enter quantity: ");
            qty = input.nextInt();
            if (qty <= 0) {
                System.out.println("Quantity must be greater than 0. Please try again.");
            }
        } while (qty <= 0);

// TODO 3: Prompt for unit price (double). Validate: > 0
        double price = 0.0;
        do {
            System.out.print("Enter unit price: $");
            price = input.nextDouble();
            if (price <= 0) {
                System.out.println("Price must be greater than 0. Please try again.");
            }
        } while (price <= 0);
// TODO 4: Prompt for member status (Y/N) -> boolean isMember
        boolean isMember = false;
        System.out.print(" Are you Member? (Y/N): ");
        char memberChar = input.next().toUpperCase().charAt(0);  // Read and normalize
        isMember = (memberChar == 'Y');  // Set

// TODO 5: Prompt for clearance (Y/N) -> boolean isClearance
        boolean isClearance = false;
        System.out.print("Clearance item? (Y/N): ");
        char clearanceChar = input.next().toUpperCase().charAt(0);
        isClearance = (clearanceChar == 'Y');

// TODO 6: Prompt coupon code (String), allow empty
        String coupon = "";
        System.out.print("Enter coupon code (or press Enter to skip): ");
        input.nextLine();
        coupon = input.nextLine().trim();
        double subtotal = qty * price;
// TODO 7: Base discount tiers (nested if/else ladder)
        double baseDiscountRate = 0.0;
        if (qty >= 20) {
            baseDiscountRate = 0.12;
        } else if (qty >= 10) {
            baseDiscountRate = 0.07;
        } else if (qty >= 5) {
            baseDiscountRate = 0.03;
        } else {
            baseDiscountRate = 0.0;
        }
// TODO 8: Member bonus: if isMember AND subtotal >= 200 -> add 0.05
        double discountRate = baseDiscountRate;
        if (isMember && subtotal >= 200) {
            discountRate += 0.05;
        }
// TODO 9: Apply discount (multiple statements in if)
        double discountedSubtotal = subtotal;
        if (discountRate > 0) {
            double discountAmount = subtotal * discountRate;
            discountedSubtotal = subtotal - discountAmount;
// TODO 10: Coupon rule using AND + NOT:
// if coupon == "SAVE10" AND NOT clearance -> subtract 10 (min 0)
// discountedSubtotal = Math.max(0, discountedSubtotal - 10);
            if (coupon.equals("SAVE10") && !isClearance) {
                discountedSubtotal = discountedSubtotal - 10;
            } else {
                discountedSubtotal = 0;
            }
// TODO 11: Tax rate using switch(category)
            double taxRate = 0.07;
            switch (category) {
                case 'G':
                    taxRate = 0.00; // 0% tax for Grocery
                    break;
                case 'E':
                    taxRate = 0.08; // 8% tax for Electronics
                    break;
                case 'C':
                    taxRate = 0.06; // 6% tax for Clothing
                    break;
                case 'H':
                    taxRate = 0.05; // 5% tax for Household
                    break;
                default:
                    taxRate = 0.07; // Default 7%
                    break;
            }
            double tax = discountedSubtotal * taxRate;
            double finalTotal = discountedSubtotal + tax;

// TODO 12: Risk flag with precedence:
// (subtotal > 1000 AND NOT member) OR qty > 50 OR (price > 500 AND category == 'E')
            boolean highRisk = false;
            if ((subtotal > 1000 && !isMember) || qty > 50 || (price > 500 && category == 'E')) {
                highRisk = true;
            }
// TODO 13: Conditional operator for risk label
            String riskLabel = "NORMAL";
            System.out.println("\n--- Receipt ---");
            System.out.printf("Category: %c%n", category);
            System.out.printf("Qty: %d%n", qty);
            System.out.printf("Unit Price: $%.2f%n", price);
            System.out.printf("Subtotal: $%.2f%n", subtotal);
            System.out.printf("Discount Rate: %.0f%%%n", discountRate * 100);
            System.out.printf("After Discounts: $%.2f%n", discountedSubtotal);
            System.out.printf("Tax Rate: %.0f%%%n", taxRate * 100);
            System.out.printf("Tax: $%.2f%n", tax);
            System.out.printf("Final Total: $%.2f%n", finalTotal);
            System.out.println("Risk Flag: " + riskLabel);
            input.close();
        }
    }
}
