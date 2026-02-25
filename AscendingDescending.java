
import java.util.Scanner;
public class AscendingDescending {
    /**
     * TODO 4: Create a method that sorts 3 integers in ascending order.
     * You may use:
     * - swapping logic (recommended), OR
     * - an array + simple sorting, OR
     * - conditional comparisons
     *
     * Return an int[] of length 3 in ascending order.
     */


    public static int[] sort3Ascending(int a, int b, int c) {
// TODO: implement sorting logic
        if ( a>b )
        {
            int temp = a;
            a = b;
            b = temp;
        }


        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        return new int[]{a, b, c};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// TODO 1: Prompt user to enter three integers
        System.out.print("Enter three integers separated by spaces: ");
// TODO 2: Read three integers
        int a = 0; // TODO: sc.nextInt();
        a = sc.nextInt();
        int b = 0; // TODO: sc.nextInt();
        b= sc.nextInt();
        int c = 0; // TODO: sc.nextInt();
        c=sc.nextInt();
// TODO 3: Call sort3Ascending(a,b,c)
        int[] sorted = sort3Ascending(a, b, c);

// TODO 5: Display ascending order
// Example: Ascending: 1 4 9
        System.out.println("Ascending: "
                + sorted[0] + " "
                + sorted[1] + " "
                + sorted[2]);
// TODO 6: Display descending order
// Example: Descending: 9 4 1
        System.out.println("Descending: "
                + sorted[2] + " "
                + sorted[1] + " "
                + sorted[0]);

        sc.close();
    }
}
