package student.part_g;

public class Watch { // association class - can't exist without relationship
	// Data (Attributes)  
	private int rating;
	private Person person; // needs Person
	private Movie movie; // needs Movie
	// Watch is called to hold the Person and Movie
	// and the Person can watch a Movie multiple times.
	// But only one watchedList exists.
	// People and Movie hold the same watchedList while adding to it.
	// Watch has a dependency on the Many to many relationship of
	// Person and Movie.
	
	// Constructor
	public Watch(int rating, Person person, Movie movie) {
		this.rating = rating;
		this.person = person;
		this.movie = movie;
	}//end constructor
}//end Watch
