package it.dstech.microservicesboot;

import it.dstech.microservicesboot.repositories.TeamRepository;
import it.dstech.microservicesboot.models.Player;
import it.dstech.microservicesboot.models.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MicroservicesbootApplication {

	@Autowired
	TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesbootApplication.class, args);
	}

	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<>();
		players.add(new Player("Snoopy", "GK"));
		players.add(new Player("Pippo", "ATT"));
		Team team = new Team("FACC", "TTH", players);
		teamRepository.save(team);
	}

}
