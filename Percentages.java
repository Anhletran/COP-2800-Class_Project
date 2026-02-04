import java.util.Scanner;
/*
Module 3 In-Class Activity: METHODS PRACTICE
Program: Percentages.java (Starter with TODOs)
Goal:
Prompt the user for two double values.
Pass both to computePercent(a, b) which prints:
a is X percent of b.
Then call the method again with reversed values.
Example:
If inputs are 2.0 and 5.0:
2.0 is 40.0 percent of 5.0
5.0 is 250.0 percent of 2.0
Important:
- Handle division by zero (b == 0).
- Format output cleanly (recommend 1–2 decimals).
*/
public class Percentages {
    // TODO 1: Create a method named computePercent(double first, double second)
// It should:
// - If second == 0, print a clear message and return
// - Compute percent = (first / second) * 100
// - Print: "<first> is <percent> percent of <second>"
    public static void computePercent(double first, double second){
        if (second == 0){
            System.out.println(" Can not be Caculated ");
        }
        double percent = (first/second)*100;
        System.out.println( first +" is " + percent +" percent of " +second);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// TODO 2: Prompt and read two doubles
// Example prompts:
// "Enter first number: "
// "Enter second number: "

        System.out.println ("Enter first number:") ;
        double first = input.nextDouble();
        System.out.println ("Enter Second number:") ;
        double second = input.nextDouble();
// TODO 3: Call computePercent(first, second)
        computePercent(first,second);
// TODO 4: Call computePercent(second, first)
        computePercent(second,first);
        input.close();
    }
}

