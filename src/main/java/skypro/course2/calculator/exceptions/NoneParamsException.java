package skypro.course2.calculator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoneParamsException extends RuntimeException{
    public NoneParamsException(String message) {
        super(message);
    }
}
