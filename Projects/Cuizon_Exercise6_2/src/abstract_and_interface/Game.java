package abstract_and_interface;

public abstract class Game {
	private String name; // The name of the game

	/**
	 * Constructor to initialize a Game object with a name.
	 * 
	 * @param name  The name of the game.
	 */
	public Game(String name) {
		this.name = name;
	}

	/**
	 * Getter method for the game's name.
	 * 
	 * @return String  The name of the game.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Abstract method to start the game.
	 * 
	 * This method must be implemented by subclasses to define how the game is started.
	 */
	public abstract void start();
}
