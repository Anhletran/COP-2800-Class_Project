import java.time.LocalDate;
import java.util.Scanner;
/*
Unit 3 Project 3: Employee (Starter with TODOs)
Create an Employee class with name, salary, hireDate; compute years of service.
*/
public class Employee {
    // TODO 1: attributes: name, salary, hireDate
    private String name;
    private double salary;
    private LocalDate hireDate;
// TODO 2: constructor Employee(String name, double salary, LocalDate hireDate)
    public Employee(String name, double salary, LocalDate hireDate) {
    this.name = name;
    this.salary = salary;
    this.hireDate = hireDate;
}

    // TODO 3: getYearsOfService() -> int
    public int getYearsOfService() {
            return LocalDate.now().getYear() - hireDate.getYear();
    }

// TODO 4: toString()
    public String toString() {
    return "Employee: " + name +
            "\nSalary: $" + String.format("%,.2f", salary) +
            " \nHire Date: " + hireDate;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// TODO 5: Prompt for name, salary, hire date (YYYY-MM-DD)
        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        input.nextLine();

        System.out.print("Enter hire date (YYYY-MM-DD): ");
        String hireDateStr = input.nextLine().trim();

        // Parse date
        LocalDate hireDate = LocalDate.parse(hireDateStr);
// TODO 6: Create Employee object
        Employee emp1 = new Employee(name, salary, hireDate);
// TODO 7: Print employee and years of service
        System.out.println("\n" + emp1);
        System.out.println("Years of Service: " + emp1.getYearsOfService());
        input.close();
    }
}
