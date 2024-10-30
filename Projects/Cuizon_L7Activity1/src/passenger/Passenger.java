package passenger;

import java.util.Arrays;
//L7 ACTIVITY 1
public class Passenger {
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public String[] passport = new String[3];
	
	public Passenger() {}
	
	public Passenger(String name,char gender,String nationality,String dateOfBirth) {
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.passport[0] = this.name;
		this.passport[1] = this.nationality;
		this.passport[2] = this.dateOfBirth;
		//this.passport = new String[] {this.name, this.nationaility...}
	}

	public static void main(String[] args) {
		Passenger p = new Passenger("Viktor Magtatanggol",'M',"Canadian","June 12, 1898");
		System.out.println(p.name);
		System.out.println(p.gender);
		System.out.println(p.nationality);
		System.out.println(p.dateOfBirth);
		System.out.println(Arrays.toString(p.passport));

	}

}
