package passenger;

//L7ACTIVITY2
public class Passenger {
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public String[] passport = new String[3];
	public long pwdIDNumber=0;
	
	public Passenger() {}
	
	public Passenger(String name,char gender,String nationality,String dateOfBirth) {
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.passport[0] = this.name;
		this.passport[1] = this.nationality;
		this.passport[2] = this.dateOfBirth;
	}
	public Passenger(String name,char gender,String nationality,String dateOfBirth, long pwdIDNumber) {
		this(name, gender, nationality, dateOfBirth);
		this.pwdIDNumber = pwdIDNumber;
	}


	@Override
	public String toString() {
		return "Name: " + name + 
				"\nGender: " + gender +
				"\nNationality: " + nationality +
				"\nDate of Birth: " + dateOfBirth +
				(pwdIDNumber==0? "":("\nPWD ID No.: "+pwdIDNumber))+"\n";
	}

	public static void main(String[] args) {
		Passenger p = new Passenger("Viktor Magtatanggol",'M',"Canadian","June 12, 1898");
		Passenger p1 = new Passenger("Vicky Manananggal",'F',"Canadian","June 12, 1898",123457890);
		System.out.println(p.toString());
		System.out.println(p1.toString());
	}

}
