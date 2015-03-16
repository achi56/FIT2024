
public class Unit {
	private String unitCode;
	private String unitName;
	
	public Unit(String initCode, String initName) {
		unitName = initName;
		unitCode = initCode;
	}
	
	public String getUnitDescription() {
		return (unitCode + " " + unitName);
	}
}
