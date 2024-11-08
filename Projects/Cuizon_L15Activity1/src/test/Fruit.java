package test;

public class Fruit {
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addFruit(Fruit f) {
		this.name = f.name;
	}
	
}
