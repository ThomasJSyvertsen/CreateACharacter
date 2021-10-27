package character;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import character.beans.Attributes;
import character.beans.Items;
import character.beans.Player;
import character.controller.BeanConfiguration;
import character.repository.CharacterRepository;

@SpringBootApplication
public class CreateACharacterApplication implements
CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(CreateACharacterApplication.class, args);
	}

	@Autowired
	CharacterRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		// Using an existing bean
		Player c1 = appContext.getBean("player", Player.class);
		
		repo.save(c1);

		// Creating a bean to use – not managed by Spring
		Attributes att2 = new Attributes(11, 11, 11, 11, 11, 11);
		Items items2 = new Items("Immovable Rod",
				"This is a rod. It does not " + "move.(unless you want it to... then it might)",
				"It is indestructible");
		Player c2 = new Player("Cal", "Boi", 25, 25, 5, att2, items2);

		repo.save(c2);

		List<Player> allMyCharacters = repo.findAll();

		for (Player eachChar : allMyCharacters) {
			System.out.println(eachChar.toString());
		}

		((AbstractApplicationContext) appContext).close();
	}

}
