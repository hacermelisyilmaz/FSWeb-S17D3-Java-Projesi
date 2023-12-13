package com.workintech.zoo.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class AnimalException extends RuntimeException {
    private HttpStatus status;

    public AnimalException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
