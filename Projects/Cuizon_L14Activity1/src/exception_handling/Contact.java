package exception_handling;

public class Contact {
	private String name;
	private int phoneNumber;
	
	public Contact(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}


}
