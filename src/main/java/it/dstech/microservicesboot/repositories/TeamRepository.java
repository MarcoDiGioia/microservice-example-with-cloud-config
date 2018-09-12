package it.dstech.microservicesboot.repositories;

import it.dstech.microservicesboot.models.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path = "teams", rel = "teams")
public interface TeamRepository extends CrudRepository<Team, Long>{

    List<Team> findAll();

    Team findTeamByName(String name);

    Team findTeamById(Long id);
}
