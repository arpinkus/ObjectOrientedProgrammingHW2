package student.part_c;
import java.util.List;
import java.util.ArrayList;


public class Team {
	// Data (Attributes)
	private int code;
	private List<Player> players; // Aggregation - Players 
	
	// Constructor
	public Team() {
		code = 0;
		players = new ArrayList<Player>(); // many possible players
		// Team does not exist without a Player
		addPlayer(new Player("John Doe", false, this)); // at least one player
	}//end constructor
	
	// Methods (Operations)
	// Add a Player to Team - use the add method for the List
	public void addPlayer(Player player) {
		players.add(player);
	}//end addPlayer(player)
}//end Team
