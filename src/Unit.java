import java.util.Collections;
import java.util.HashMap;

public class Unit {
	private String unitCode;
	private String unitName;

    //ArrayList<Student> students = new ArrayList<Student>();
    HashMap<Integer,Student> enrolledStudents = new HashMap<Integer, Student>();

	public Unit(String initCode, String initName) {
		unitName = initName;
		unitCode = initCode;
	}

    public void enrolStudent(Integer studentID, Student newStudents){
        enrolledStudents.put(studentID, newStudents);
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
		return (unitCode + " " + unitName);
	}
}
