import java.util.Scanner;

/*
Unit 3 Project 1: MinutesConversion (Starter with TODOs)
Goal: Convert minutes (int) into hours and days (double) using methods and formatted output.
*/

public class MinutesConversion {

    // TODO 1: convertToHours(int minutes) -> double
    public static double convertToHours(int minutes){
        return minutes /60.0;
    }

    // TODO 2: convertToDays(int minutes) -> double
    public static double convertToDays(int minutes){
        return minutes/ 1440.0;
    }

    // TODO 3: buildOutput(int minutes, double hours, double days) -> String
    public static String buildOutput(int minutes, double hours, double days){
        return " Convert "+ minutes +" into "+ hours +" hours and "+ days +" days";

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of minutes (integer >= 0): ");
        // TODO 4: Read minutes
        int minutes = input.nextInt();
        // TODO 5: Validate minutes >= 0 else print error and return
        if (  minutes <=0)
        {
            System.out.println(" Please Enter the validate input");
        }

        // TODO 6: Compute hours and days using methods
        double hours = convertToHours(minutes);
        double days = convertToDays(minutes);
        // TODO 7: Print formatted output
        String explanation = buildOutput(minutes, hours, days);
        System.out .println(explanation);
        input.close();
    }
}
