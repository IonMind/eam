package com.optum.eam.eam.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * GlobalExceptionHandler
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(Exception exception) {

        // return new ResponseEntity<String>("error some ", HttpStatus.BAD_REQUEST);
        // ErrorResponse er = new

        return new ResponseEntity<ErrorResponse>(
                new ErrorResponse("Error -> " + exception.getLocalizedMessage()),
                HttpStatus.BAD_REQUEST);
    }
}