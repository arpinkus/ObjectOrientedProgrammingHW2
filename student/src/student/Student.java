package student;

import java.util.Objects;

public class Student {
	// Data (Attributes)
	private String name;
	private String major;
	private double gpa;
	
	// Constructors
	public Student() {
		name = "";
		major = "";
		gpa = 0.0;
	}//end constructor
	
	public Student(String name, String major) {
		this.name = name;
		this.major = major;
		gpa = 0.0;
	}//end constructor(name, major)
	
	public Student(String name, String major, double gpa) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}//end constructor(name, major, gpa)
	
	// Getters and Setters
	// Get Name - return name value
	public String getName() {
		return name;
	}//end getName()
	
	// Set Name - change name value
	public void setName(String name) {
		this.name = name;
	}//end setName(name)
	
	// Get Major - return major value
	public String getMajor() {
		return major;
	}//end getMajor()
	
	// Set Major - change major value
	public void setMajor(String major) {
		this.major = major;
	}//end setMajor(major)
	
	// Get GPA - return gpa value
	public double getGpa() {
		return gpa;
	}//end getGpa()
	
	// Set GPA - change gpa value
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}//end setGpa(gpa)
	
	// Methods (Operations)
	// Override toString() - return the name, major, and gpa
	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", gpa=" + gpa + "]";
	}//end toString()
	
	// Override equals() - return true if the student name and major are the same
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}//end if
		if (obj == null) {
			return false;
		}//end if
		if (getClass() != obj.getClass()) {
			return false;
		}//end if
		Student other = (Student) obj;
		return Objects.equals(major, other.major) && Objects.equals(name, other.name);
	}//end equals(obj)
}//end Student
