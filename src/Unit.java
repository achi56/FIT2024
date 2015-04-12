import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Unit {
	private String unitCode;
	private String unitName;
    private String unitChief;
    private AssessmentScheme scheme;
    //public AssessmentScheme scheme = new AssessmentScheme();


    HashMap<Integer,Student> enrolledStudents = new HashMap<Integer, Student>();
    HashMap<Integer, StaffMember> unitStaff = new HashMap<Integer, StaffMember>();


	public Unit(String initCode, String initName, String initChief) {
		unitName = initName;
		unitCode = initCode;
        unitChief = initChief;
        scheme = new AssessmentScheme();

	}

    public void addExam(Exam exam){
        scheme.assessment.add(exam);

    }

    public AssessmentScheme getScheme() {
        return scheme;
    }

    public void addAssignment(Assignment assignment) {
        scheme.assessment.add(assignment);
    }

    public void enrolStudent(int studentID, Student newStudents){
        enrolledStudents.put(studentID, newStudents);
    }

    public void addStaff(int staffID, StaffMember newStaff) {
        unitStaff.put(staffID, newStaff);
    }

    public Boolean isEnrolled(Student student) {
        if (enrolledStudents.containsValue(student)) {
            return true;
        }
        return false;

    }
    public void unenrolStudent(Student student) {
        enrolledStudents.values().removeAll(Collections.singleton(student));
    }

	public String description() {
		return (unitCode + " " + unitName + " " + "Chief Examiner is: " + unitChief);
	}
}
