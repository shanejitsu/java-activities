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

	@Override
	public void restoreHealth(int restore) {
		super.health += restore;
		System.out.println("\nRestore Health -> " + super.characterName + " health: " + super.health);
	}

	@Override
	public void buffAbility(int buff) {
		super.damage += buff;
		System.out.println("\nBuff effect -> " + super.characterName + " damage: " + super.damage);

	}
}
