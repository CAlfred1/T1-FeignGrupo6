package pe.edu.cibertec.t1feigngrupo6.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo6.restclient.github.iclient.GitHubClient;
import pe.edu.cibertec.t1feigngrupo6.restclient.github.model.GitHubUserDto;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GitHubService {

    private final GitHubClient gitHubClient;

    public List<GitHubUserDto> getUsersWithShortLoginAndNotSiteAdmin() {
        return gitHubClient.getUsers()
                .stream()
                .filter(user -> user.getLogin() != null && user.getLogin().length() <= 5)
                .filter(user -> !user.isSite_admin())
                .toList();
    }
}
