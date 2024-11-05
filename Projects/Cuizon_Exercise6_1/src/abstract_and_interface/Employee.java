package abstract_and_interface;

public abstract class Employee {
	private String name;
	private int employeeId;
	private double hourlyRate;

	/**
	 * This the constructor of an Employee object.
	 * 
	 * This constructor sets the name, employee ID, and hourly rate for the
	 * employee.
	 * 
	 * @param name       The name of the employee.
	 * @param employeeId The unique ID assigned to the employee.
	 * @param hourlyRate The hourly rate of the employee.
	 * @return void This constructor does not return anything.
	 */
	public Employee(String name, int employeeId, double hourlyRate) {
		setName(name);
		setEmployeeId(employeeId);
		setHourlyRate(hourlyRate);
	}

	/**
	 * Abstract method to calculate the pay for the employee.
	 * 
	 * @return double The calculated pay for the employee.
	 */
	public abstract double calculatePay();

	/**
	 * Getter method for the employee's name.
	 * 
	 * @return String The name of the employee.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for the employee's name.
	 * 
	 * @param name The name to set for the employee.
	 * @return void This does not return anything.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for the employee's unique ID.
	 * 
	 * @return int The unique ID of the employee.
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * Setter method for the employee's unique ID.
	 * 
	 * @param employeeId The ID to set for the employee.
	 * @return void This does not return anything.
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * Getter method for the employee's hourly rate.
	 * 
	 * @return double The hourly rate of the employee.
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * Setter method for the employee's hourly rate.
	 * 
	 * @param hourlyRate The hourly rate to set for the employee.
	 * @return void This does not return anything.
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
}
