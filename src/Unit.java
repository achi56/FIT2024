import java.util.ArrayList;

public class Unit {
	private String unitCode;
	private String unitName;

    ArrayList<Student> students = new ArrayList<Student>();
	
	public Unit(String initCode, String initName) {
		unitName = initName;
		unitCode = initCode;
	}

    public void enrolStudent(Student newStudents){
        students.add(newStudents);
    }

	public String description() {
		return (unitCode + " " + unitName);
	}
}
