/**
 * Created by Aaron on 16/03/2015.
 */
public class Student {
    private int studentID;
    private String firstName;
    private String lastName;


    public Student(int newStudentID) {
    studentID = newStudentID;
    }

    public Student(int newStudentID, String newFirstName, String newLastName){
        studentID = newStudentID;
        firstName = newFirstName;
        lastName = newLastName;

    }

    public void setFirstName(String initfirstName) {
        firstName = initfirstName;
    }

    public void setLastName(String initlastName){
        lastName = initlastName;
    }

    public String description() {
        return (studentID + " " + firstName + " " + lastName);
    }

}
