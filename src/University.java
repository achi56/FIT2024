
public class University {

	Unit unit1; 
	Unit unit2;
	Unit unit3;
	
	public void run() {
		System.out.println("Welcome to Java University");
		System.out.println();
		createUnits();
		displayUnits();
		System.out.println();
		System.out.println("Thanks you for using Java University");
	}
	
	public void createUnits() {
		
		unit1 = new Unit("FIT2024","Software Engineering Practice");
		unit2 = new Unit("FIT1010", "Introduction to Software Engineering");
		unit3 = new Unit("FIT2004", "Algorithms and Data Structures");
					
	}
	
	public void displayUnits() {
		System.out.println(unit1.getUnitDescription());
		System.out.println(unit2.getUnitDescription());
		System.out.println(unit3.getUnitDescription());
	}
    
}
