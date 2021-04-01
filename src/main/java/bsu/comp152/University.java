package bsu.comp152;
import java.util.Scanner;

/** A class to create University objects
 * Starter code Laura K. Gross, COMP 152, Bridgewater State University
 * Completed by: [student name], [student email]
 * date: [date of completion]
 */
public class University {

    // Give the whole class access to the console.
    public static Scanner keyboard = new Scanner(System.in);

    // TODO: Define two instance variables studentList and faculty.

    // TODO: Define a constructor as on project sheet.

    // TODO: Define the hireProfessor method as on project sheet.

    // TODO: Define the admitStudent method as on project sheet.

    // TODO: Define the findStudent method as on project sheet.

    // TODO: Define the graduateStudents method as on project sheet.

    public void runUniversity() {
        int choice;
        do {
            // Display top-level menu:
            System.out.println("1 - Hire a professor");
            System.out.println("2 - Admit a student");
            System.out.println("3 - Process graduation");
            System.out.println("4 - Look up a student");
            System.out.println("5 - Exit main menu");
            System.out.print("Which would you like to do? ");

            choice = keyboard.nextInt();
            // Consume newline character.
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    hireAProfessor();
                    break;
                case 2:
                    // TODO: Call a private method to admit a student.
                    break;
                case 3:
                    // TODO: Call the instance method graduateStudents.
                    break;
                case 4:
                    lookUpAStudent();
                    break;
                case 5:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        } while (choice != 5);
    }

    private void hireAProfessor() {
        // TODO: Write the needed code here.
    }

    private void lookUpAStudent(){
        // TODO: Prompt the user to enter the student ID.
        // TODO: Call findStudent to obtain the ArrayList that is either empty or contains the found Student.
        // TODO: If the student was found, print the student's details (using toString).
        // Enter the student menu for this student:
        int choice;
        do {
            System.out.println("1 - Enter credits and grade for student");
            System.out.println("2 - Assign advisor to student");
            System.out.println("3 - Exit");
            System.out.print("Which would you like to do? ");

            choice = keyboard.nextInt();
            // Consume the newline character.
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    // TODO: Do the required things as on the project sheet.
                    break;
                case 2:
                    // TODO: Do the required things as on the project sheet.
                    break;
                case 3:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        } while (choice != 3);
        // TODO: If the student was not found, print a message to that effect.
    }
}
