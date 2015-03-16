import java.util.*;

public class University {


    ArrayList<Unit> units = new ArrayList<Unit>();
    ArrayList<Student> students = new ArrayList<Student>();


	public void run() {
		System.out.println("Welcome to Java University");
		System.out.println();
		createUnits();
		displayUnits();
		System.out.println();
		System.out.println("Thanks you for using Java University");
	}

	public void createUnits() {
		units.add(new Unit("FIT2024","Software Engineering Practice"));
        units.add(new Unit("FIT1010", "Introduction to Software Engineering"));
        units.add(new Unit("FIT2004", "Algorithms and Data Structures"));
        units.get(0).enrolStudent(new Student(1234));
        units.get(1).enrolStudent(new Student(4567, "Joe", "Bloggs"));
        units.get(1).enrolStudent(new Student(3455, "Harvey", "Spectar"));
        units.get(2).enrolStudent(new Student(9876, "Fred", "George"));
	}


	public void displayUnits() {
        for (int i = 0; i < units.size(); i++) {
            System.out.println(units.get(i).description());
            System.out.println("Enrolled Students:");
            for (int x = 0; x < units.get(i).students.size(); x++) {
                System.out.println(units.get(i).students.get(x).description());
            }
            System.out.println("");

        }
    }


}
