package test;

public class Person {
	private String name;
	private String status;
	private int age;
	
//	public Person() {
//		
//	}
//	public Person(String name,int age) {
//		setName(name);
//		setAge(age);
//	}
//	public Person(String name,int age,String status) {
//		setName(name);
//		setAge(age);
//		setStatus(status);
//	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", status=" + status + ", age=" + age + "]\n";
	}
	
	public void displayScream(Employee e) {
		System.out.println("Employee says " + e.scream());
	}

}
