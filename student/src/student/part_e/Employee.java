package student.part_e;

// Parent Class - abstract (to be used rather than make objects)
public abstract class Employee {
	// Data (Attributes)
	private String name;
	private int hours;
	
	// Constructor
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}//end constructor
	
	// Methods (Operations)
	// Derived Attribute - salary is $20 an hour
	public double calculateSalary() {
		return hours * 20;
	}//end calculateSalary()
	
	// Get Hours - return hours value
	public int getHours() {
		return hours;
	}//end getHours()
}//end Employee
