package test;

public enum Size{
	SMALL(45.7),
	MEDIUM(63.5),
	LARGE(76.2),
	EXTRALARGE(91.1);
	
	public double measurement;
	Size(double measurement){
		this.measurement = measurement;
	}
	
	public static void say() {
		System.out.println("Wow");
	}
	
	public static void main(String[] args) {
		
	}
}
