package com.aula.workshopmongo.resource.exception;

import com.aula.workshopmongo.services.exception.ObjectNotFounException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

@ExceptionHandler(ObjectNotFounException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFounException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Object not found", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}

