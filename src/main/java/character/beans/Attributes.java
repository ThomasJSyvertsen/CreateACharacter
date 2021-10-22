package character.beans;

import javax.persistence.Embeddable;

/**
 * @author Thomas Syvertsen - tjsyvertsen
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */

@Embeddable
public class Attributes {
	private int strength;
	private int intelligence;
	private int wisdom;
	private int dexterity;
	private int constitution;
	private int charisma;
	
	/**
	 * 
	 */
	public Attributes() {
		super();
	}

	/**
	 * @param strength
	 * @param intelligence
	 * @param wisdom
	 * @param dexterity
	 * @param constitution
	 * @param charisma
	 */
	public Attributes(int strength, int intelligence, int wisdom, int dexterity, int constitution, int charisma) {
		super();
		this.strength = strength;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.charisma = charisma;
	}

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @return the wisdom
	 */
	public int getWisdom() {
		return wisdom;
	}

	/**
	 * @param wisdom the wisdom to set
	 */
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	/**
	 * @return the dexterity
	 */
	public int getDexterity() {
		return dexterity;
	}

	/**
	 * @param dexterity the dexterity to set
	 */
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	/**
	 * @return the constitution
	 */
	public int getConstitution() {
		return constitution;
	}

	/**
	 * @param constitution the constitution to set
	 */
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	/**
	 * @return the charisma
	 */
	public int getCharisma() {
		return charisma;
	}

	/**
	 * @param charisma the charisma to set
	 */
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	
	@Override
	public String toString() {
		return ("[strength=" + strength + ", intelligence=" + intelligence 
				+ ", wisdom=" + wisdom + ", dexterity=" + dexterity 
				+ "constitution=" + constitution + ", charisma=" + charisma
				+ "]");
	}
	
}