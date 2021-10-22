package character.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import character.beans.Character;
import character.beans.Attributes;
import character.beans.Items;

@Configuration
public class BeanConfiguration {
	@Bean
	public Character character() {
		Character character = new Character();
		return character;
	}

	@Bean
	public Attributes attributes() {
		Attributes attributes = new Attributes();
		return attributes;
	}
	
	@Bean
	public Items items() {
		Items items = new Items();
		return items;
	}
}
