package abstract_and_interface;

public class Archer extends DnDCharacter {
	/*
	 * This is the Archer class constructor. 
	 * Initializes the character name with the parameter value.
	 * 
	 * @param characterName
	 * @return Returns nothing.
	 */
	public Archer(String characterName) {
		super(characterName,100,20);
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
		System.out.println(super.characterName + " sharply shoots " + opponent.characterName);
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
		return "Acher's Profile:\n" + super.toString();
	}
}
