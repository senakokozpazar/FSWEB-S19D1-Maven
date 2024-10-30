package com.workintech.s18d2.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Getter
@Service
@AllArgsConstructor
public class PlantException extends RuntimeException{
    private HttpStatus httpStatus;

    public PlantException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
