package abstract_and_interface;

public class Archer extends DnDCharacter {

	public Archer(String characterName) {
		super(characterName);
		super.health = 100;
		super.damage = 20;
	}

	/*
	 * Calls the receiveDamage function of the opponent
	 * 
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
