package pe.edu.cibertec.t1feigngrupo6.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo6.restclient.brewery.model.BreweryData;
import pe.edu.cibertec.t1feigngrupo6.service.BreweryService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/brewery-client")
@RestController
public class BreweryController {

    private final BreweryService breweryService;

    // localhost:8080/api/v1/brewery-client
    @GetMapping
    public ResponseEntity<List<BreweryData>> getBreweries() {
        return ResponseEntity.ok(
                breweryService.getMicroBreweriesFromCalifornia());
    }
}
