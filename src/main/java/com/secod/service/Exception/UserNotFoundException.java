package com.secod.service.Exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String exception) {
        super(exception);
    }

}
