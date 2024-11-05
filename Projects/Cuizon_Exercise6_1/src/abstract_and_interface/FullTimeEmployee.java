package abstract_and_interface;

public class FullTimeEmployee extends Employee{
	private double monthlySalary;
	
	public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
		super(name,employeeId,0);
		this.monthlySalary = monthlySalary;
	}
	@Override
	public double calculatePay() {
		return monthlySalary;
	}

}
