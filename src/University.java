
import java.util.*;
import java.util.Scanner;
//hong-li.song@monash.edu

public class University {


    ArrayList<Unit> units = new ArrayList<Unit>();
    ArrayList<Assessment> assessment = new ArrayList<Assessment>();



    public void run() {
		System.out.println("Welcome to Java University");
		System.out.println();
		createUnits();
		displayUnits();
		System.out.println();
		System.out.println("Thanks you for using Java University");
	}

	public void createUnits() {
        int a;
        String b;
        String c;
        Scanner in = new Scanner(System.in);

		units.add(new Unit("FIT2024","Software Engineering Practice"));
        units.add(new Unit("FIT1010", "Introduction to Software Engineering"));
        units.add(new Unit("FIT2004", "Algorithms and Data Structures"));
        //assessment.add(new AssessmentScheme());

        for (int i = 0; i < units.size(); i++) {
            System.out.println("How many students in Unit: " + units.get(i).description());
            int y = in.nextInt();
            in.nextLine();
            for (int x = 0; x < y; x++) {
                System.out.println("Enter Student ID for Student " + x);
                a = in.nextInt();
                in.nextLine();
                System.out.println("Enter First Name: ");
                b = in.nextLine();
                System.out.println("Enter Last Name: ");
                c = in.nextLine();
                units.get(i).enrolStudent(a,new Student(a,b, c));
            }

        }

	}


	public void displayUnits() {
        for (int i = 0; i < units.size(); i++) {
            System.out.println(units.get(i).description());
            System.out.println("Enrolled Students:");
            for (Integer key:units.get(i).enrolledStudents.keySet()) {
                System.out.println(units.get(i).enrolledStudents.get(key).description());
            }
            System.out.println("");

        }
    }

    public void findStudent(int unit, Student student) {
        if (units.get(unit).isEnrolled(student) == true) {
            System.out.println("Found");
        }
            else {
                System.out.println("Not Found");
            }
        }

    public void deleteStudent(int unit, Student student) {
        if (units.get(unit).isEnrolled(student) == true) {
            units.get(unit).unenrolStudent(student);
        }
    }


    public void test(){
        findStudent(1,units.get(1).enrolledStudents.get(4567));
        deleteStudent(1,units.get(1).enrolledStudents.get(4567));
        findStudent(1,units.get(1).enrolledStudents.get(4567));
    }


}
