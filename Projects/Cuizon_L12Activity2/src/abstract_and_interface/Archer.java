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

	/*
	 * Restores the health of the character by parameter restore value.
	 * 
	 * @param restore
	 * @return Returns nothing.
	 */
	@Override
	public void restoreHealth(int restore) {
		super.health += restore;
		System.out.println("\nRestore Health -> " + super.characterName + " health: " + super.health);
	}
	
	/*
	 * Buffs the character's damage by the parameter buff value.
	 * 
	 * @param buff
	 * @return Returns nothing. 
	 */
	@Override
	public void buffAbility(int buff) {
		super.damage += buff;
		System.out.println("\nBuff effect -> " + super.characterName + " damage: " + super.damage);

	}
	
	public String toString() {
		return "Acher's Profile:\n" + super.toString();
	}
}
