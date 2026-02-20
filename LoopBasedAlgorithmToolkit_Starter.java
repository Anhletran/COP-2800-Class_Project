import java.util.Scanner;
/**
 * Unit 5 - Loop-Based Algorithm Toolkit (STUDENT STARTER)
 * Complete each TODO section. Keep your code clean and well-commented.
 *
 * Requirements reminder:
 * - Use all 3 loop types (for, while, do-while) across the program
 * - Use break OR continue at least once
 * - Include comments explaining loop logic and exit conditions
 */
public class LoopBasedAlgorithmToolkit_Starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// ============================================================
// 1) Generate the FIRST 100 PRIME NUMBERS
// TODO:
// - Generate and print the first 100 primes.
// - Optimize: test divisors only up to sqrt(n) (i * i <= n).
// - Use break to exit the divisor loop when a factor is found.
// Hint:
// - Keep a primeCount variable and a candidate number starting at 2.
        System.out.println("=== FIRST 100 PRIME NUMBERS ===");
        int primeCount = 0;        // Number of primes found
        int candidate = 2;          // First number to test

        while (primeCount < 100) {
            boolean isPrime = true;

            // OPTIMIZATION: Only test divisors up to sqrt(candidate)
            // If no divisor found by then, candidate is prime
            for (int divisor = 2; divisor * divisor <= candidate; divisor++) {
                if (candidate % divisor == 0) {
                    isPrime = false;
                    break;          // BREAK USAGE: Exit loop as soon as factor found
                }
            }

            if (isPrime) {
                System.out.printf("%4d ", candidate);
                primeCount++;

                // Format output: 10 numbers per line
                if (primeCount % 10 == 0) {
                    System.out.println();
                }
            }

            candidate++;
        }

        System.out.println("\n");
// ============================================================
        System.out.println(); // spacing
// ============================================================
// 2) Compute the GCD of TWO USER INPUTS (Euclidean Algorithm)
// TODO:
// - Prompt user for two integers a and b.
// - Use a while loop to compute gcd(a, b).
// - Print the GCD result.

        System.out.println("=== GCD CALCULATOR ===");
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        int originalA = a, originalB = b;  // Store for output

        // WHILE LOOP USAGE: Euclidean Algorithm
        // Continue until remainder becomes 0
        while (b != 0) {
            int remainder = a % b;
            a = b;          // Set a to previous divisor
            b = remainder;  // Set b to remainder
            // Loop repeats with new values until b becomes 0
        }

        System.out.println("GCD of " + originalA + " and " + originalB + " is: " + a + "\n");
// ============================================================
// ============================================================
// 3) Convert DECIMAL to HEXADECIMAL
// TODO:
// - Prompt user for a non-negative integer.
// - Convert to hex using repeated division by 16.
// - Use a do-while loop so the conversion runs at least once (handles 0).
// - Print the hex value.
// Hint:
// - digits = "0123456789ABCDEF"
// - remainder -> digits.charAt(remainder)
        System.out.println("=== DECIMAL TO HEX CONVERTER ===");
        System.out.print("Enter a non-negative integer: ");
        int decimal = scanner.nextInt();

        String hexDigits = "0123456789ABCDEF";
        String hexResult = "";
        int originalDecimal = decimal;


        do {
            int remainder = decimal % 16;
            hexResult = hexDigits.charAt(remainder) + hexResult;  // Prepend digit
            decimal = decimal / 16;
        } while (decimal > 0);  // Continue until quotient becomes 0

        System.out.println("Hexadecimal of " + originalDecimal + " is: " + hexResult + "\n");

// ============================================================
// ============================================================
// 4) Palindrome Check (STRING)
// TODO:
// - Prompt user for a string.
// - Check if it is a palindrome (case-insensitive).
// - Use a for loop comparing characters from both ends.
// - Use break if a mismatch is found.
// - Print true/false (or a friendly message).
        System.out.println("=== PALINDROME CHECKER ===");
        scanner.nextLine();  // Clear buffer
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Convert to lowercase for case-insensitive comparison
        String normalized = text.toLowerCase();
        boolean isPalindrome = true;

        // FOR LOOP USAGE: Compare characters from both ends
        // Loop only needs to go halfway through the string
        for (int i = 0; i < normalized.length() / 2; i++) {
            int j = normalized.length() - 1 - i;  // Character from the end

            if (normalized.charAt(i) != normalized.charAt(j)) {
                isPalindrome = false;
                break;  // BREAK USAGE: Exit loop as soon as mismatch found
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + text + "\" IS a palindrome!\n");
        } else {
            System.out.println("\"" + text + "\" is NOT a palindrome.\n");
        }
// ============================================================
// ============================================================
// 5) Nested loops: MULTIPLICATION TABLE
// TODO:
// - Print a 10x10 multiplication table using nested loops.
// - Use printf to align values (e.g., %4d).
// ============================================================
        System.out.println("=== 10x10 MULTIPLICATION TABLE ===");

        // Print header row
        System.out.print("    ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n    " );


        for (int row = 1; row <= 10; row++) {
            System.out.printf("%2d ", row);  // Row label

            for (int col = 1; col <= 10; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();  // New line after each row
        }

        scanner.close();
    }
}
