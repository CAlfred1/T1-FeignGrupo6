package pe.edu.cibertec.t1feigngrupo6.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo6.restclient.brewery.iclient.BreweryClient;
import pe.edu.cibertec.t1feigngrupo6.restclient.brewery.model.BreweryData;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BreweryService {

    private final BreweryClient breweryClient;

    public List<BreweryData> getMicroBreweriesFromCalifornia() {
        return breweryClient.getBreweries()
                .stream()
                .filter(brewery -> "micro".equalsIgnoreCase(brewery.getBrewery_type()))
                .filter(brewery -> "California".equalsIgnoreCase(brewery.getState()))
                .toList();
    }
}
