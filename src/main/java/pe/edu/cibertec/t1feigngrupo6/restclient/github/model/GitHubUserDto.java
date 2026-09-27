package pe.edu.cibertec.t1feigngrupo6.restclient.github.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GitHubUserDto {
    private Long id;
    private String login;
    private boolean site_admin;
    private String avatar_url;
}
