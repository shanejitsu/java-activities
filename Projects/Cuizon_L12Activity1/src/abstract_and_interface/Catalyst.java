package abstract_and_interface;

public class Catalyst extends DnDCharacter {
	/*
	 * This is the Catalyst class constructor.
	 * Initializes the character name with the parameter value.
	 * 
	 * @param characterName 
	 * @return Returns nothing.
	 */
	public Catalyst(String characterName) {
		super(characterName,100,15);
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
		System.out.println(super.characterName + " tightly binded " + opponent.characterName);
	}

	/*
	 * Decreases the health of the character by the parameter damage.
	 * 
	 * @return Returns nothing.
	 */
	@Override
	public void receiveDamage(int damage) {
		super.health -= damage;

	}

	public String toString() {
		return "Catalyst's Profile:\n" + super.toString();
	}
}
