package com.example.Exceptionhandling.exceptionhandler;

import com.example.Exceptionhandling.exception.NoEmployeesException;
import com.example.Exceptionhandling.exception.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class EmpExceptionHandler {

    @ExceptionHandler(NoEmployeesException.class)
    public ResponseEntity<Object> handleNonExistingEmp(NoEmployeesException exception) {
        return new ResponseEntity<>("Employees not found", HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<Object> handleRecordNotFound(RecordNotFoundException exception) {
        return new ResponseEntity<>("Record not found is database", HttpStatus.NOT_FOUND);
    }
}

