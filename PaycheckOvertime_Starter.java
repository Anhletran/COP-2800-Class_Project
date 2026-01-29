import java.util.Scanner;

/*
Exercise 2 100): ");

 */
public class PaycheckOvertime_Starter{
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        final double OVERTIME_THRESHOLD =40.0;
        final double OVERTIME_MULTIPLIER = 1.5;

        System.out.println ( " === Please Enter Your Information ===== ");

        System.out.println(" \n Enter Employee Name: ");
        String name = input.nextLine();

        System.out.println( " \n Hours Worked ");
        double hours =0.0;
        hours = input.nextDouble();

        System.out.println( " \n  Hourly rate: ");
        double rate= 0.0;
        rate = input.nextDouble();

        System.out.println (" \n Retirement contribution percentage (0-100): ");
        // TODO: input.nextInt()
        int percent = 0;
        percent = input.nextInt();
// TODO 5: Read Y/N char for whether to print a detailed

        System.out.print("Print detailed pay stub? (Y/N): ");
        char printFlag = 'N'; // TODO: read and normalize to upper case
        printFlag = input.next().toUpperCase().charAt(0);
// TODO 6: Validate inputs using if/else:
// hours >= 0, rate >= 0, percent in [0,100]
// If invalid, print a clear message and exit (return).
        if (hours < 0) {
            System.out.println("Error: Hours worked cannot be negative.");
            return;
        } else if (rate < 0) {
            System.out.println("Error: Hourly rate cannot be negative.");
            return;
        } else if (percent < 0 || percent > 100) {
            System.out.println("Error: Retirement percentage must be between 0 and 100.");
            return;
        }
// TODO 7: Compute regularHours and overtimeHours
        double regularHours = 0.0;
        double overtimeHours = 0.0;
       /* if (hours <= OVERTIME_THRESHOLD) {
            regularHours = hours;
            overtimeHours = 0.0;
        } else {
            regularHours = OVERTIME_THRESHOLD;
            overtimeHours = hours - OVERTIME_THRESHOLD;
        } */
         regularHours = Math.min(hours, OVERTIME_THRESHOLD);
         overtimeHours = Math.max(hours - OVERTIME_THRESHOLD, 0.0);

// TODO 8: Compute grossPay using overtime rules
        double grossPay = 0.0;
        grossPay = (regularHours * rate) + (overtimeHours * rate * OVERTIME_MULTIPLIER);
// TODO 9 (Type conversion demo): retirementRate = percent / 100.0
        double retirementRate = 0.0;
        retirementRate = percent / 100.0;

// TODO 10: Compute deduction and net pay
        double retirementDeduction = 0.0;
        double netPay = 0.0;
        retirementDeduction = grossPay * retirementRate;
        netPay = grossPay - retirementDeduction;
// TODO 11: Print results (always print net pay)
// If printFlag == 'Y', print a detailed pay stub using printf (2 decimals)

        System.out.println("\n--- Pay Results ---");
        System.out.printf("Net pay: $%.2f%n", netPay);
        if (printFlag == 'Y') {
            System.out.println("\n--- Detailed Pay Stub ---");
            System.out.printf("Employee: %s%n", name);
            System.out.printf("Hours worked: %.1f%n", hours);
            System.out.printf("Regular hours (0-40): %.1f%n", regularHours);
            System.out.printf("Overtime hours: %.1f%n", overtimeHours);
            System.out.printf("Hourly rate: $%.2f%n", rate);
            System.out.printf("Regular pay: $%.2f%n", regularHours * rate);
            System.out.printf("Overtime pay: $%.2f%n", overtimeHours * rate * OVERTIME_MULTIPLIER);
            System.out.printf("Gross pay: $%.2f%n", grossPay);
            System.out.printf("Retirement deduction (%d%%): $%.2f%n", percent, retirementDeduction);
            System.out.printf("Net pay: $%.2f%n", netPay);
        }
// System.out.printf("Net pay: $%.2f%n", netPay);
// TODO 12: Add comments explaining your formulas and decisions.


input.close();
}
}