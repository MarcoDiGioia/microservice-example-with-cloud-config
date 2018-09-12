package it.marco.microservicesboot.controllers;

import it.marco.microservicesboot.models.Team;
import it.marco.microservicesboot.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamRepository repository;

    @RequestMapping("/teams/")
    @ResponseBody
    public List<Team> findAll(){
        return repository.findAll();
    }

    @RequestMapping("/teams/{id}")
    @ResponseBody
    public Team getById(@PathVariable Long id){
        return repository.findTeamById(id);
    }

}
