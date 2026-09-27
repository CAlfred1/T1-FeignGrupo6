package pe.edu.cibertec.t1feigngrupo6.restclient.errorhandler;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        HttpStatus status = HttpStatus.valueOf(response.status());

        return switch (status) {
            case NOT_FOUND -> new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "El recurso no fue encontrado");
            case BAD_REQUEST -> new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Solicitud incorrecta al API");
            default -> new ResponseStatusException(
                    HttpStatus.BAD_GATEWAY,
                    "Error al consumir API externa");
        };
    }
}
