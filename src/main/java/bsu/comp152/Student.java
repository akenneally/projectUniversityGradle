package bsu.comp152;

/** A class to create Student objects
  * Starter code Laura K. Gross, COMP 152, Bridgewater State University
  * Completed by: [student name], [student email]
  * date: [date of completion]
 */

public class Student {
    // class/static variable
    public static int nextID = 2000;
    // instance fields/variables
    private int studentID;
    private double gpa;
    private String name;
    private Professor advisor;
    private int numberOfCredits;

    // constructor
    public Student(String studentName, Professor initialAdvisor){
        name = studentName;
        gpa = 0.0;
        // TODO:
        //  Initialize other instance variables as on project sheet!
    }

    // setters

    public void takeClass(int credits, double grade){
        // TODO:
        //  Update the instance variables gpa and numberOfCredits,
        //  taking the new course into account as on project sheet
        //  and as discussed in recording!
        // numberOfCredits =
        // gpa =
    }

    public void changeAdvisor(Professor newAdvisor){
        // TODO:
        //  Update the instance variable advisor to the new value from the parameter!
    }

    // getters

    public double getGPA() {
        return gpa;
    }

    public int getCreditHours() {
        return numberOfCredits;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{name=" + name +
                ", studentID=" + studentID +
      // TODO: Write the getName method in the professor class!
                //  ", advisor=" + advisor.getName() +
                ", gpa=" + gpa + "}";
    }

    public Professor getAdvisor() {
        return advisor;
    }
}