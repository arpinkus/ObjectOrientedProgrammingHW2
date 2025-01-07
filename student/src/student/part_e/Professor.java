package student.part_e;

public class Professor extends Employee {
	// Data (Attributes)
	private String field; // Inheritance - "adds field to Employee"
	
	// Constructor
	public Professor(String name, int hours, String field) {
		super(name, hours);
		this.field = field;
	}//end constructor
	
	// Methods (Operations)
	// Derived Attribute - salary for Professor is $30 an hour
	@Override
	public double calculateSalary() {
		return getHours() * 30; // change the salary for Professor
	}//end calculateSalary()
}//end Professor
