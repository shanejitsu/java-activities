package abstract_and_interface;

public abstract class DnDCharacter {
	public String characterName;
	public int health;
	public int damage;

	public abstract void attack(DnDCharacter opponent);

	public abstract void receiveDamage(int damage);

	public DnDCharacter(String characterName) {
		this.characterName = characterName;
	}

	/*
	 * Checks of the Character is alive;
	 * 
	 * @return Returns true if the character's health is greater than 0.
	 */
	public boolean isAlive() {
		return health > 0;
	}

	/*
	 * 
	 * @return Returns a String format of the Character's name, health and damage.
	 */
	public String toString() {
		return "Character name: " + characterName + "\tHealth: " + health + "\tDamage: " + damage + "\n";
	}
}
