package it.marco.microservicesboot;

import it.marco.microservicesboot.repositories.TeamRepository;
import it.marco.microservicesboot.models.Player;
import it.marco.microservicesboot.models.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableEurekaClient
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
