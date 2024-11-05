package abstract_and_interface;

public abstract class Employee {
	private String name;
	private int employeeId;
	private double hourlyRate;
	
	public Employee(String name,int employeeId, double hourlyRate) {
		setName(name);
		setEmployeeId(employeeId);
		setHourlyRate(hourlyRate);
	}

	public abstract double calculatePay();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	
}
