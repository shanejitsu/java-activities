package abstract_and_interface;

public abstract class DnDCharacter {
	public String characterName;
	public int health;
	public int damage;

	public abstract void attack(DnDCharacter opponent);

	public abstract void receiveDamage(int damage);
	
	/*
	 * This is the DnDCharacter constructor.
	 * Initializes the DnDCharacter's characterName, health, and damage.
	 * 
	 * @param characterName, health, damage
	 * @return Returns true if the character's health is greater than 0.
	 */
	public DnDCharacter(String characterName, int health, int damage) {
		this.characterName = characterName;
		this.health = health;
		this.damage = damage;
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
