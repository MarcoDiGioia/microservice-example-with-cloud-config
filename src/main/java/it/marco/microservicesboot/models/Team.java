package it.marco.microservicesboot.models;

import javax.persistence.*;

import java.util.Set;

@Entity
public class Team {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String location;
    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="teamId")
    Set<Player> players;

    public Team() {
        super();
     }

    public Team(String name, String location, Set<Player> players) {
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
