package com.company.Exceptions;

public class JsonFileNotFoundException extends RuntimeException{

    public JsonFileNotFoundException() {
        super();
    }

    public JsonFileNotFoundException(String message) {
        super(message);
    }
}
