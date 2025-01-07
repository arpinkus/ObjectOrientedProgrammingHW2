package student.part_c;

public class Player {
	// Data (Attributes)
	private String name;
	private boolean expert;
	private Team team; // Association - a Player knows which Team they are on
	
	// Constructor
	public Player(String name, boolean expert, Team team) {
		this.name = name;
		this.expert = expert;
		this.team = team;
	}//end constructor
}//end Player
