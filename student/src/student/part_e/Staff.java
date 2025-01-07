package student.part_e;

public class Staff extends Employee {
	// Data (Attributes)
	private int role; // Inheritance - "adds role to Employee"
	
	// Constructor
	public Staff(String name, int hours, int role) {
		super(name, hours);
		this.role = role;
	}//end constructor
}//end Staff
