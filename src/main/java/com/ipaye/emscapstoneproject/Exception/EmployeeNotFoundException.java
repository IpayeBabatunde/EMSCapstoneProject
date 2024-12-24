package com.ipaye.emscapstoneproject.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(value= HttpStatus.NOT_FOUND) // 404 status code
public class EmployeeNotFoundException extends RuntimeException {

    @Serial
    private static final Long serialVersionUID = 5888656726691794786L;

    public EmployeeNotFoundException (String  message){
        super(message);
    }
}
