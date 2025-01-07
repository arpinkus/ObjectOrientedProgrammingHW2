package student.part_g;
import java.util.List;

public class Person {
	// Data (Attributes)
	private String name; 
	private List<Watch> watchedList; // Association Class
	
	// Constructor
	public Person(String name, List<Watch> watchedList) {
		this.name = name;
		this.watchedList = watchedList; // one watch list
	}//end constructor
}//end Person
