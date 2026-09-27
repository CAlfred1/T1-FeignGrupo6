package pe.edu.cibertec.t1feigngrupo6.restclient.github.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo6.restclient.config.FeignConfig;
import pe.edu.cibertec.t1feigngrupo6.restclient.github.model.GitHubUserDto;

import java.util.List;

@FeignClient(
        name = "githubClient",
        url = "https://api.github.com",
        configuration = FeignConfig.class)
public interface GitHubClient {

    @GetMapping("/users")
    List<GitHubUserDto> getUsers();
}
