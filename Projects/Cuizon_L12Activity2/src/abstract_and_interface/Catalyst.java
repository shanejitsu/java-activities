package abstract_and_interface;

public class Catalyst extends DnDCharacter {

	public Catalyst(String characterName) {
		super(characterName);
		super.health = 100;
		super.damage = 15;
	}

	/*
	 * Calls the receiveDamage function of the opponent
	 * 
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

	@Override
	public void restoreHealth(int restore) {
		super.health += restore;
		System.out.println("\nRestore Health -> " + super.characterName + " health: " + super.health);
	}

	@Override
	public void buffAbility(int buff) {
		super.health += buff;
		System.out.println("\nBuff effect -> " + super.characterName + " health: " + super.health);

	}

	public String toString() {
		return "Catalyst's Profile:\n" + super.toString();
	}
}
