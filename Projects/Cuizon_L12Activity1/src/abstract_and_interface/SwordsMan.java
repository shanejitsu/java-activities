package abstract_and_interface;

public class SwordsMan extends DnDCharacter {

	public SwordsMan(String characterName) {
		super(characterName);
		super.health = 100;
		super.damage = 25;
	}

	/*
	 * Calls the receiveDamage function of the opponent
	 * 
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
