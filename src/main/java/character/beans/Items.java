package character.beans;

import javax.persistence.Embeddable;

/**
 * @author Thomas Syvertsen - tjsyvertsen CIS175 - Fall 2021 Oct 21, 2021
 */

@Embeddable
public class Items {
	String name;
	String description;
	String condition;

	/**
	 * 
	 */
	public Items() {
		super();
	}

	/**
	 * @param name
	 * @param description
	 * @param condition
	 */
	public Items(String name, String description, String condition) {
		super();
		this.name = name;
		this.description = description;
		this.condition = condition;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * @param condition the condition to set
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return ("[name=" + name + ", description=" + description + ", condition=" + condition + "]");
	}
}
