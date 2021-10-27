package character.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import character.beans.Attributes;
import character.beans.Items;
import character.beans.Player;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Player player() {
		Player bean = new Player("Thomas", "Almi", 20, 20, 10);
		return bean;
	}

	@Bean
	public Attributes attributes() {
		Attributes bean = new Attributes(15, 15, 15, 15, 15, 15);
		return bean;
	}
	
	@Bean
	public Items items() {
		Items bean = new Items("Unending Flask", "Always have a drink to drink!", "Rusty, do not fret though. It adds spice.");
		return bean;
	}
}
