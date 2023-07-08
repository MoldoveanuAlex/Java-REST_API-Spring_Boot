package com.MA.REST.exception;

public class ComerciantNotFoundException extends RuntimeException{



    public ComerciantNotFoundException(String message) {
        super(message);
    }

    public ComerciantNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


}
