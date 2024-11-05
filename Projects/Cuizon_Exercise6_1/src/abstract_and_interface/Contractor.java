package abstract_and_interface;

public class Contractor extends Employee{
	private int hoursWorked;
	public Contractor(String name,int employeeId, double hourlyRate, int hoursWorked) {
		super(name,employeeId,hourlyRate);
		this.hoursWorked = hoursWorked;
	}
	@Override
	public double calculatePay() {
		return super.getHourlyRate()*hoursWorked;
	}

}
