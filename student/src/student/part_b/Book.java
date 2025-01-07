package student.part_b;


public class Book {
	// Data (Attributes)
	private String name;
	private String author;
	private Course course; // Association
	
	// Constructor
	public Book() {
		name = "";
		author = "";
		course = null; // can be null or equal to one Course
	}//end constructor
}//end Book
