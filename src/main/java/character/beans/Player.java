package character.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Player {
	@Id
	@GeneratedValue
	private Long id;
	private String playerName;
	private String characterName;
	private int totalHitPoints;
	private int currentHitPoints;
	private int hitDamage;
	@Autowired
	private Attributes attributes;
	@Autowired
	private Items items;
	
	
	public Player() {
		super();
	}

	public Player(String playerName, String characterName, int totalHitPoints, int currentHitPoints,
			int hitDamage) {
		super();
		this.playerName = playerName;
		this.characterName = characterName;
		this.totalHitPoints = totalHitPoints;
		this.currentHitPoints = currentHitPoints;
		this.hitDamage = hitDamage;
	}

	public Player(String playerName, String characterName, int totalHitPoints, int currentHitPoints,
			int hitDamage, Attributes attributes, Items items) {
		super();
		this.playerName = playerName;
		this.characterName = characterName;
		this.totalHitPoints = totalHitPoints;
		this.currentHitPoints = currentHitPoints;
		this.hitDamage = hitDamage;
		this.attributes = attributes;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public int getTotalHitPoints() {
		return totalHitPoints;
	}

	public void setTotalHitPoints(int totalHitPoints) {
		this.totalHitPoints = totalHitPoints;
	}

	public int getCurrentHitPoints() {
		return currentHitPoints;
	}

	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

	public int getHitDamage() {
		return hitDamage;
	}

	public void setHitDamage(int hitDamage) {
		this.hitDamage = hitDamage;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", characterName=" + characterName
				+ ", totalHitPoints=" + totalHitPoints + ", currentHitPoints=" + currentHitPoints + ", hitDamage="
				+ hitDamage + ", attributes=" + attributes + ", items=" + items + "]";
	}	
}
