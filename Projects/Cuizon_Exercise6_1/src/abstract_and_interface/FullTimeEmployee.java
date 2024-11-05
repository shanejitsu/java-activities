package abstract_and_interface;

public class FullTimeEmployee extends Employee {
	private double monthlySalary;// Monthly salary for full-time employee

	/**
	 * This the constructor of a FullTimeEmployee object
	 * 
	 * This constructor calls the superclass (Employee) constructor to initialize
	 * the name and employee ID, monthly salary, and hourly rate hourly rate is set
	 * to 0 because it is not applicable for a full-time employee.
	 * 
	 * @param name          The name of the full-time employee.
	 * @param employeeId    The unique ID assigned to the full-time employee.
	 * @param monthlySalary The monthly salary of the full-time employee.
	 * @return void 		This constructor does not return anything.
	 */
	public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
		super(name, employeeId, 0);
		this.monthlySalary = monthlySalary;
	}

	/**
	 * Calculates the pay for a full-time employee.
	 * 
	 * A full-time employee's pay is based on their fixed monthly salary.
	 * That's why this method returns the value of the monthly salary.
	 * 
	 * @return double The monthly salary of the full-time employee.
	 */
	@Override
	public double calculatePay() {
		return monthlySalary;
	}

}
