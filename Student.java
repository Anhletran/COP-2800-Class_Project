
import java.util.Scanner;
import java.util.ArrayList;
/*
Unit 3 Project 4: Student (Starter with TODOs)
Create a Student class with name, grade, course list; add/remove courses via menu.
*/
public class Student {
    // TODO 1: attributes: name, grade, courses (ArrayList<String>)
    private String name;
    private String grade  ;
    private ArrayList<String> courses;

// TODO 2: constructor Student(String name, String grade)
public Student(String name, String grade) {
    this.name = name;
    this.grade = grade;
    this.courses = new ArrayList<>();
}
// TODO 3: addCourse(String course)
public void addCourse(String course) {
    if (!courses.contains(course)) {
        courses.add(course);
        System.out.println("Course '" + course + "' added successfully.");
    } else {
        System.out.println("Course '" + course + "' already exists.");
    }
}

    // TODO 4: removeCourse(String course)
    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println("Course '" + course + "' removed successfully.");
        } else {
            System.out.println("Course '" + course + "' not found in the list.");
        }
    }
// TODO 5: listCourses()
public void listCourses() {
    if (courses.isEmpty()) {
        System.out.println("No courses registered.");
    } else {
        System.out.println("Student " + name + " add : ");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i));
        }
    }
}
// TODO 6: toString()
public String toString() {
    return "Student: " + name +
            ", Grade: " + grade +
            ", Number of Courses: " + courses.size();
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// TODO 7: Prompt for name and grade; create Student
        System.out.print("Enter student name: ");
        String name = input.nextLine().trim();

        System.out.print("Enter student grade (e.g., A, B+, 10th): ");
        String grade = input.nextLine().trim();

        Student student = new Student(name, grade);
        System.out.println("Student created successfully!");
// TODO 8: Menu loop (Add, Remove, List, Exit)
        boolean running = true;

        while (running) {
            System.out.println("\n=== Student Course Management ===");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. List Courses");
            System.out.println("4. Show Student Info");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter course name to add: ");
                    String courseToAdd = input.nextLine().trim();
                    student.addCourse(courseToAdd);
                    break;

                case "2":
                    System.out.print("Enter course name to remove: ");
                    String courseToRemove = input.nextLine().trim();
                    student.removeCourse(courseToRemove);
                    break;

                case "3":
                    student.listCourses();
                    break;

                case "4":
                    System.out.println(student);
                    break;

                case "5":
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-5.");
            }
        }

        input.close();
    }
}
