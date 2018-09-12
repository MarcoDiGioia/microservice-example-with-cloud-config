package it.marco.microservicesboot.repositories;

import it.marco.microservicesboot.models.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "players", rel = "players")
public interface PlayerRepository extends CrudRepository<Player, Long>{
}
