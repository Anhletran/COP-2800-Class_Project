import java.util.Scanner;
/**
 * Part A: Array Loop Trio (Student Starter with TODOs)
 *
 * Requirements:
 * 1) Use a for loop to compute the sum of EVEN numbers in an array.
 * 2) Use a while loop to search for a target number and print its index (or not
 found).
 * 3) Use a do-while loop to prompt until the user enters 0.
 */
public class Part1_ArrayLoops_Starter {
    public static void main(String[] args) {
// Provided dataset (feel free to change values for testing)
        int[] numbers = {2, 7, 4, 9, 12, 3, 8, 15, 6, -10};
// =========================
// 1) FOR LOOP: Sum of evens
// =========================
        int sumOfEvens = 0;
// TODO: Write a for loop that checks each element.
// If the value is even (value % 2 == 0), add it to sumOfEvens.
        for ( int i = 0; i<  numbers.length ; i++)
        {
            if ( numbers[i] % 2==0)
            {
                sumOfEvens += numbers[i];
            }

        }
        System.out.println("Sum of even numbers: " + sumOfEvens);
// =========================
// 2) WHILE LOOP: Search target
// =========================
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
// TODO: read target from user
        int target = 0;
        int index = -1;
        int i = 0;
        target= scanner.nextInt();
// TODO: Use a while loop to search for target in numbers.
// If found, set index = i and break.
        while ( i< numbers.length)
        {
            if ( numbers[i]== target)
            {
                index =i;
                break;
            }
            i++;
        }
        if (index != -1) {
            System.out.println("Found " + target + " at index: " + index);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
// =========================
// 3) DO-WHILE: Prompt until 0
// =========================
        int input;
// TODO: Use a do-while loop.
// Prompt: "Enter a number (0 to exit): "
// Print: "You entered: <input>"
// Stop when input == 0
        do {
            System.out.print(" Enter a number (0 to exit): ");
            input = scanner.nextInt();
        } while (input !=0);
            System.out.println("Exited do-while input loop.");
            scanner.close();

    }
}
