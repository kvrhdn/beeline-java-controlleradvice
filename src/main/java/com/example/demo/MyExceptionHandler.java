package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler({ExceptionWithHandler.class})
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity
                .status(INTERNAL_SERVER_ERROR)
                .body("Something bad happened");
    }
}
