
import java.util.Scanner;
public class EvenOdd {

    /**
     * TODO 3: Create a method that returns true when n is even, otherwise false.
     * Hint: Use the modulus operator (%).
     */
    public static boolean isEven(int n) {
// TODO: return (n % 2 == 0);
        return (n % 2 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// TODO 1: Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

// TODO 2: Read the integer from the user
        int num = 0; // TODO: replace with sc.nextInt();
        num = sc.nextInt();
// TODO 4: Call isEven(num) and display whether the number is even or odd
        if (isEven(num)) System.out.println(num + " is even.");
        else System.out.println(num + " is odd.");
// Example:
// if (isEven(num)) System.out.println(num + " is even.");
// else System.out.println(num + " is odd.");
        sc.close();
    }
}
