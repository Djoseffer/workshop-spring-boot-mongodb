package com.aula.workshopmongo.services.exception;

public class ObjectNotFounException extends RuntimeException{
    public ObjectNotFounException(String msg){
        super(msg);
    }

}
