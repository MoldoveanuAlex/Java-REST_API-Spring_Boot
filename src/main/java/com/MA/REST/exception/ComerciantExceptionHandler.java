package com.MA.REST.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ComerciantExceptionHandler {

    @ExceptionHandler(value = {ComerciantNotFoundException.class})
    public ResponseEntity<Object> handleComerciantNotFoundException
            (ComerciantNotFoundException comerciantNotFoundException){
        ComerciantException comerciantException = new ComerciantException(
                comerciantNotFoundException.getMessage(),
                comerciantNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(comerciantException, HttpStatus.NOT_FOUND);
    }
}
