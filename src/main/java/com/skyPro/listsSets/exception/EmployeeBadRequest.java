package com.skyPro.listsSets.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.BAD_REQUEST, reason = "123")
public class EmployeeBadRequest extends RuntimeException{
    public EmployeeBadRequest(String message) { super(message);
    }
}
