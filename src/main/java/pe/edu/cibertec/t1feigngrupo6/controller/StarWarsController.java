package pe.edu.cibertec.t1feigngrupo6.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo6.restclient.swapi.model.StarWarsCharacter;
import pe.edu.cibertec.t1feigngrupo6.service.StarWarsService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/swapi-client")
@RestController
public class StarWarsController {

    private final StarWarsService starWarsService;

    // localhost:8080/api/v1/swapi-client
    @GetMapping
    public ResponseEntity<List<StarWarsCharacter>> getCharacters() {
        return ResponseEntity.ok(
                starWarsService.getFemaleCharactersTallerThan160());
    }
}
