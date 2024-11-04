package abstract_and_interface;

public class SwordsMan extends DnDCharacter {
	/*
	 * This is the SwordsMan class constructor. 
	 * Initializes the character name with the parameter value.
	 * 
	 * @param characterName 
	 * @return Returns nothing.
	 */
	public SwordsMan(String characterName) {
		super(characterName, 100, 25);
	}

	/*
	 * Calls the receiveDamage function of the opponent
	 * 
	 * @param opponent
	 * @return Returns nothing.
	 */
	@Override
	public void attack(DnDCharacter opponent) {
		opponent.receiveDamage(super.damage);
		System.out.println(super.characterName + " pierces " + opponent.characterName + " with his blade!");
	}

	/*
	 * Decreases the health of the character by the parameter damage.
	 * 
	 * @param damage
	 * @return Returns nothing.
	 */
	@Override
	public void receiveDamage(int damage) {
		super.health -= damage;
	}

	public String toString() {
		return "Swordsman's Profile:\n" + super.toString();
	}
}
