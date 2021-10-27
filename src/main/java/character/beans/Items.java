package character.beans;

import javax.persistence.Embeddable;

/**
 * @author Thomas Syvertsen - tjsyvertsen CIS175 - Fall 2021 Oct 21, 2021
 */

@Embeddable
public class Items {
	String name;
	String description;
	String damage;
	
	public Items() {
		super();
	}

	public Items(String name, String description, String damage) {
		super();
		this.name = name;
		this.description = description;
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDamage() {
		return damage;
	}

	public void setDamage(String damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", description=" + description + ", damage=" + damage + "]";
	}	
}
