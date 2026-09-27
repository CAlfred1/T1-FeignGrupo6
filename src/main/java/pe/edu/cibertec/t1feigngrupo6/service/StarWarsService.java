package pe.edu.cibertec.t1feigngrupo6.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo6.restclient.swapi.iclient.SwapiClient;
import pe.edu.cibertec.t1feigngrupo6.restclient.swapi.model.StarWarsCharacter;
import pe.edu.cibertec.t1feigngrupo6.restclient.swapi.model.SwapiResponse;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StarWarsService {

    private final SwapiClient swapiClient;

    public List<StarWarsCharacter> getFemaleCharactersTallerThan160() {
        SwapiResponse response = swapiClient.getPeople();

        if (response == null || response.getResults() == null) {
            return List.of();
        }

        return response.getResults()
                .stream()
                .filter(character -> "female".equalsIgnoreCase(character.getGender()))
                .filter(character -> isHeightGreaterThan160(character.getHeight()))
                .toList();
    }

    private boolean isHeightGreaterThan160(String height) {
        if (height == null) {
            return false;
        }

        try {
            return Integer.parseInt(height) > 160;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
