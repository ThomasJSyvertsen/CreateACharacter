package character.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Thomas Syvertsen - tjsyvertsen CIS175 - Fall 2021 Oct 21, 2021
 */

@Entity
public class Character {
	@Id
	@GeneratedValue
	private int id;
	private String playerName;
	private String characterName;
	@Autowired
	private Attributes attributes;
	private int totalHitPoints;
	private int currentHitPoints;
	private int hitDamage;
	@Autowired
	private Items items;

	/**
	 * 
	 */
	public Character() {
		super();
	}

	/**
	 * @param playerName
	 * @param characterName
	 */
	public Character(String playerName, String characterName) {
		super();
		this.playerName = playerName;
		this.characterName = characterName;
	}

	/**
	 * @param playerName
	 * @param characterName
	 * @param totalHitPoints
	 * @param currentHitPoints
	 * @param hitDamage
	 */
	public Character(String playerName, String characterName, int totalHitPoints, int currentHitPoints, int hitDamage) {
		super();
		this.playerName = playerName;
		this.characterName = characterName;
		this.totalHitPoints = totalHitPoints;
		this.currentHitPoints = currentHitPoints;
		this.hitDamage = hitDamage;
	}

	/**
	 * @param playerName
	 * @param characterName
	 * @param attributes
	 * @param totalHitPoints
	 * @param currentHitPoints
	 * @param hitDamage
	 * @param items
	 */
	public Character(String playerName, String characterName, Attributes attributes, int totalHitPoints,
			int currentHitPoints, int hitDamage, Items items) {
		super();
		this.playerName = playerName;
		this.characterName = characterName;
		this.attributes = attributes;
		this.totalHitPoints = totalHitPoints;
		this.currentHitPoints = currentHitPoints;
		this.hitDamage = hitDamage;
		this.items = items;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return the characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * @param characterName the characterName to set
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	/**
	 * @return the attributes
	 */
	public Attributes getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return the totalHitPoints
	 */
	public int getTotalHitPoints() {
		return totalHitPoints;
	}

	/**
	 * @param totalHitPoints the totalHitPoints to set
	 */
	public void setTotalHitPoints(int totalHitPoints) {
		this.totalHitPoints = totalHitPoints;
	}

	/**
	 * @return the currentHitPoints
	 */
	public int getCurrentHitPoints() {
		return currentHitPoints;
	}

	/**
	 * @param currentHitPoints the currentHitPoints to set
	 */
	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

	/**
	 * @return the hitDamage
	 */
	public int getHitDamage() {
		return hitDamage;
	}

	/**
	 * @param hitDamage the hitDamage to set
	 */
	public void setHitDamage(int hitDamage) {
		this.hitDamage = hitDamage;
	}

	/**
	 * @return the items
	 */
	public Items getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Items items) {
		this.items = items;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return ("[id=" + id + ", playerName=" + playerName + ", characterName=" + characterName + ", attributes="
				+ attributes.toString() + ", totalHitPoints=" + totalHitPoints + ", currentHitPoints" + currentHitPoints
				+ ", hitDamage" + hitDamage + ", items=" + items.toString() + "]");
	}
}