package character.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import character.beans.Player;

@Repository 
public interface CharacterRepository extends JpaRepository<Player, Long> { 
	
}
