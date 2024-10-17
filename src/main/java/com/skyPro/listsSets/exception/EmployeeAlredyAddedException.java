package com.skyPro.listsSets.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class EmployeeAlredyAddedException extends RuntimeException{
    public EmployeeAlredyAddedException() {
    }

    public EmployeeAlredyAddedException(String message) {
        super(message);
    }

    public EmployeeAlredyAddedException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeAlredyAddedException(Throwable cause) {
        super(cause);
    }

    public EmployeeAlredyAddedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
