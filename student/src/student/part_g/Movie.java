package student.part_g;
import java.util.List;

public class Movie {
	// Data (Attributes)
	private String name; 
	private String genre;
	private List<Watch> watchedList; // Association Class
	
	// Constructor
	public Movie(String name, String genre, List<Watch> watchedList) {
		this.name = name;
		this.genre = genre;
		this.watchedList = watchedList; // one watch list
	}//end constructor
}//end Movie
