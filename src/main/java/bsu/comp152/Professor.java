package bsu.comp152;
import java.util.ArrayList;

/** A class to create Professor objects
 * Starter code Laura K. Gross, COMP 152, Bridgewater State University
 * Completed by: [student name], [student email]
 * date: [date of completion]
 */
public class Professor {

    // instance fields/variables

    private ArrayList<Student> adviseeList;
    // TODO: Define remaining instance variables on project sheet.

    // constructor
    // TODO: Write constructor header.
    // TODO: Initialize the instance variable name with the profName parameter.
    // TODO: Initialize the instance variable department with the dept parameter.
    // Initialize the instance variable adviseeList via
    // adviseeList = new ArrayList<Student>(); // (Don't initialize to null.)

    // accessors and mutators

    /**
     * A method to remove an advisee from the advisee list
     * @param formerAdvisee
     */
    public void removeAdvisee(Student formerAdvisee){
        if (adviseeList == null){
            return;
        }
        // Search for the student in the advisee List.
        // If the student is found, remove the student from the advisee list.

        // Initialize a counter to 0.
        int counter = 0;
        // Declare a Student object called advisee, and initialize advisee to
        // the first student in the advisee list.
        Student advisee = adviseeList.get(0);
        // While the student ID of the advisee is not equal to the student id for the parameter,
        // increment the counter, and get the advisee at the index value given by the counter.
        while (advisee.getStudentID() != formerAdvisee.getStudentID()){
            counter++;
            advisee = adviseeList.get(counter);
        }
        adviseeList.remove(counter);
    }

    // TODO: Define remaining instance methods on project sheet.
}
