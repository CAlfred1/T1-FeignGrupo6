package pe.edu.cibertec.t1feigngrupo6.restclient.swapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SwapiResponse {
    private List<StarWarsCharacter> results;
}
