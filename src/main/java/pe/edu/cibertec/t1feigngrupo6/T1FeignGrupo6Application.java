package pe.edu.cibertec.t1feigngrupo6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class T1FeignGrupo6Application {

    public static void main(String[] args) {
        SpringApplication.run(T1FeignGrupo6Application.class, args);
    }
}
