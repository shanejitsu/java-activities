package test;

public class Employee extends Person{
	private int idNumber;
	private String companyName;
	
	public Employee() {
	}
	public Employee(String name,int age) {
		super(name,age);
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	
	public String getCompanyName() {
		return companyName;
	}

	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [idNumber=" + idNumber + ", companyName=" + companyName + "]\n";
	}
	

}
