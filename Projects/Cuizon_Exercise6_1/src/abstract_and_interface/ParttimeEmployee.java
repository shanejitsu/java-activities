package abstract_and_interface;

public class ParttimeEmployee extends Employee {
	private int hoursWorked;// The number of hours worked by the part-time employee

	/**
	 * This the constructor of an ParttimeEmployee object.
	 * 
	 * This constructor calls the superclass (Employee) constructor to initialize
	 * the name, employee ID, and hourly rate. It also initializes the number of
	 * hours worked for the part-time employee.
	 * 
	 * @param name        The name of the part-time employee.
	 * @param employeeId  The unique ID assigned to the part-time employee.
	 * @param hourlyRate  The hourly rate of the part-time employee.
	 * @param hoursWorked The total number of hours worked by the part-time
	 *                    employee.
	 */
	public ParttimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
		super(name, employeeId, hourlyRate);
		this.hoursWorked = hoursWorked;
	}

	/**
	 * This function calculates the pay of a part-time employee. It is calculated by
	 * multiplying the employee's hourly rate and the number of hours worked.
	 * 
	 * @return double The calculated pay of the part-time employee.
	 */
	@Override
	public double calculatePay() {
		return getHourlyRate() * hoursWorked;
	}
}
