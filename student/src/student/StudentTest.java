package student;

public class StudentTest {
	// Use the Student Class
	public static void main(String[] args) {
		// Create two students
		Student studentOne = new Student("John", "CS", 3.5);
		Student studentTwo = new Student();
		studentTwo.setName("Mary Ann");
		studentTwo.setMajor("CE");
		studentTwo.setGpa(3.3);
		
		// Print the Students
		printStudent(studentOne);
		printStudent(studentTwo);
	}//end main()
	
	// Print the Student - use toString()
	public static void printStudent(Student student) {
		System.out.println(student.toString());
	}//end printStudent()
}//StudentTest
