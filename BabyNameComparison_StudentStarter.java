import java.util.Scanner;
public class BabyNameComparison_StudentStarter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Baby Name Comparison Generator ===");
        System.out.print("Enter first name 1: ");
        String name1 = input.nextLine().trim();
        System.out.print("Enter first name 2: ");
        String name2 = input.nextLine().trim();
        System.out.print("Enter first name 3: ");
        String name3 = input.nextLine().trim();


        // TODO 1: Validate that none of the names are blank
        if (name1.isEmpty() || name2.isEmpty() || name3.isEmpty()) {
            System.out.println("Error: Please enter three names.");
        } else {
            int count = 0;

            // TODO 2: Display all possible two-name combinations
            System.out.println("\nPossible Combinations:");


            System.out.println(name1 + " " + name2); count++;
            System.out.println(name1 + " " + name3); count++;


            System.out.println(name2 + " " + name1); count++;
            System.out.println(name2 + " " + name3); count++;


            System.out.println(name3 + " " + name1); count++;
            System.out.println(name3 + " " + name2); count++;

            // TODO 4: Print the total number of combinations
            System.out.println("\nTotal combinations generated: " + count);
        }
        input.close();
    }
}