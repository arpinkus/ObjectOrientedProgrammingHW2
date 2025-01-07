package student.part_d;

public class Dog {
	// Data (Attributes)
	private String breed;
	private String name;
	private Paw paws[]; // Composition - Dog is dependent on Paws
	
	// Constructor
	public Dog() {
		breed = "";
		name = "";
		for (int i = 0; i <= 3; i++) {
			paws[i] = new Paw(i); // 4 paws in Dog
		}//end for-loop
	}//end constructor
}//end Dog
