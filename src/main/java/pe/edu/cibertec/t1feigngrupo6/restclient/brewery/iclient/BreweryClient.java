package pe.edu.cibertec.t1feigngrupo6.restclient.brewery.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo6.restclient.brewery.model.BreweryData;
import pe.edu.cibertec.t1feigngrupo6.restclient.config.FeignConfig;

import java.util.List;

@FeignClient(
        name = "breweryClient",
        url = "https://api.openbrewerydb.org",
        configuration = FeignConfig.class)
public interface BreweryClient {

    @GetMapping("/v1/breweries")
    List<BreweryData> getBreweries();
}
