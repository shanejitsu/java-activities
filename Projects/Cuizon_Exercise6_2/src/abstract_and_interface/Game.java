package abstract_and_interface;

public abstract class Game {
	private String name;
	
	public Game(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void start();

}
