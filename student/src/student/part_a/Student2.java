package student.part_a;

public class Student2 {
	// Data (Attributes)
	private String name;
	private Transcript transcript; // Association
	
	// Constructor
	public Student2(String name, Transcript transcript) {
		this.name = name;
		this.transcript = transcript; // one-to-one
	}//end constructor
}//end Student2
