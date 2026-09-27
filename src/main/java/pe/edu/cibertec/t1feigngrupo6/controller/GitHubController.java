package pe.edu.cibertec.t1feigngrupo6.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo6.restclient.github.model.GitHubUserDto;
import pe.edu.cibertec.t1feigngrupo6.service.GitHubService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/github-client")
@RestController
public class GitHubController {

    private final GitHubService gitHubService;

    // localhost:8080/api/v1/github-client
    @GetMapping
    public ResponseEntity<List<GitHubUserDto>> getUsers() {
        return ResponseEntity.ok(
                gitHubService.getUsersWithShortLoginAndNotSiteAdmin());
    }
}
