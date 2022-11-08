package banquemisr.irrigation.exception;

import banquemisr.irrigation.DTO.response.HttpResponse;
import banquemisr.irrigation.exception.custom.LandNotFoundException;
import banquemisr.irrigation.exception.custom.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<HttpResponse> genericCaughtException(Exception exception) {
        return generateCustomExceptionResponse(INTERNAL_SERVER_ERROR, exception.getMessage());
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<HttpResponse> notFoundException(NotFoundException exception) {
        return generateCustomExceptionResponse(NOT_FOUND, exception.getMessage());
    }

    @ExceptionHandler(LandNotFoundException.class)
    public ResponseEntity<HttpResponse> landNotFoundException(LandNotFoundException exception) {
        return generateCustomExceptionResponse(NOT_FOUND, exception.getMessage());
    }

    private ResponseEntity<HttpResponse> generateCustomExceptionResponse(HttpStatus httpStatus, String message) {
        return new ResponseEntity<>(new HttpResponse(httpStatus.value(), httpStatus,
                httpStatus.getReasonPhrase().toUpperCase(), message), httpStatus);
    }
}
