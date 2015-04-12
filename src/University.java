
import java.util.*;
import java.util.Scanner;
//hong-li.song@monash.edu

public class University {


    ArrayList<Unit> units = new ArrayList<Unit>();


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

		units.add(new Unit("FIT2024","Software Engineering Practice", "George Stevens"));
        units.add(new Unit("FIT1010", "Introduction to Software Engineering", "Fredrick Lucas"));
        units.add(new Unit("FIT2004", "Algorithms and Data Structures", "Lucas McLovin"));


        units.get(0).addStaff(785495, new StaffMember(785495, "Nexgen 360", 40, 98765803));
        units.get(1).addStaff(56789, new StaffMember(56789, "A StaffMember", 41, 12387));
        units.get(2).addStaff(67890, new StaffMember(67890, "Another StaffMember", 42, 9832345));
        units.get(0).addExam(new Exam(40,60));
        units.get(0).addAssignment(new Assignment("Test", 30));


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
        System.out.println("");
        for (int i = 0; i < units.size(); i++) {
            System.out.println(units.get(i).description());
            System.out.println("Enrolled Students:");
            for (Integer key:units.get(i).enrolledStudents.keySet()) {
                System.out.println(units.get(i).enrolledStudents.get(key).description());
            }
            System.out.println("");
            System.out.println("Unit Staff:");
            for (Integer key2:units.get(i).unitStaff.keySet()) {
                System.out.println(units.get(i).unitStaff.get(key2).description());
            }
            System.out.println("");
            System.out.println("Assessments:");
            for (int j = 0; i< units.get(i).getScheme().assessment.size();i++) {
                System.out.println(units.get(i).getScheme().assessment.get(j).description());
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
