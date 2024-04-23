package com.example.springmongodb.services.exception;

import com.example.springmongodb.domain.User;

public class ObjectNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
