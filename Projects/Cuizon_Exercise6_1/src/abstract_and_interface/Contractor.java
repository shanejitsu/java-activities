package abstract_and_interface;

public class Contractor extends Employee{
	private int hoursWorked;// The number of hours worked by the contractor
	
	/**
	 * This the constructor of an Contractor object.
	 * 
	 * This constructor calls the superclass (Employee) constructor to initialize
	 * the name, employee ID, and hourly rate.
	 * It also initializes the number of hours worked for the contractor.
	 * */
	public Contractor(String name,int employeeId, double hourlyRate, int hoursWorked) {
		super(name,employeeId,hourlyRate);
		this.hoursWorked = hoursWorked;
	}
	
	/**
	 * This function calculates the pay of a contractor. It is calculated by
	 * multiplying the contractor's hourly rate and the number of hours worked.
	 * 
	 * @return double The calculated pay of a contractor.
	 */
	@Override
	public double calculatePay() {
		return getHourlyRate()*hoursWorked;
	}

}
