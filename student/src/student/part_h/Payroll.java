package student.part_h;

public class Payroll {
	// Constructor
	public Payroll() {
		//empty constructor - (Worker class is used, not Data)
	}//end constructor
	
	// Methods (Operations)
	// processPayments() - example of Dependency
	public void processPayments(Worker worker) {
		System.out.println("Payment processed for worker " + worker.getName());
	}//end processPayments(worker)
}//end Payroll
