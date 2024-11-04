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
	/*
	 * Restores the health of the character by parameter restore value.
	 * 
	 * @param restore
	 * @return Returns nothing. 
	 */
	@Override
	public void restoreHealth(int restore) {
		super.health += restore;
		System.out.println(super.characterName + " restored health: " + super.health);
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
		System.out.println(super.characterName + "buffed damage: " + super.damage);

	}
}
