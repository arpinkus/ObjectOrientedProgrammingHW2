package student.part_b;
import java.util.List; // = ArrayList

public class Course {
	// Data (Attributes)
	private int code;
	private List<Book> books; // Association
	
	// Constructor
	public Course(int code, List<Book> books) {
		this.code = code;
		this.books = books; // Can have zero books.
	}//end constructor
}//end Course
