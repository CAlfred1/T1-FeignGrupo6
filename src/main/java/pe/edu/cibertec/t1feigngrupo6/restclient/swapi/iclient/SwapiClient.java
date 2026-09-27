package pe.edu.cibertec.t1feigngrupo6.restclient.swapi.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo6.restclient.config.FeignConfig;
import pe.edu.cibertec.t1feigngrupo6.restclient.swapi.model.SwapiResponse;

@FeignClient(
        name = "swapiClient",
        url = "https://swapi.dev",
        configuration = FeignConfig.class)
public interface SwapiClient {

    @GetMapping("/api/people/")
    SwapiResponse getPeople();
}
