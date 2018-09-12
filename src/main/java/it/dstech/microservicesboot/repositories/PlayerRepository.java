package it.dstech.microservicesboot.repositories;

import it.dstech.microservicesboot.models.Player;
import it.dstech.microservicesboot.models.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path = "players", rel = "players")
public interface PlayerRepository extends CrudRepository<Player, Long>{
}
