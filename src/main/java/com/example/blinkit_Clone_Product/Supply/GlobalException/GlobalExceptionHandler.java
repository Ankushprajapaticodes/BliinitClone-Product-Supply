package com.example.blinkit_Clone_Product.Supply.GlobalException;

import com.example.blinkit_Clone_Product.Supply.Exceptions.InvalidEnumValueException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice  // ye annotation batata h ki ye global exception handel karta h
public class GlobalExceptionHandler {

    public ResponseEntity<String> hanleInvalidEnumValueException(InvalidEnumValueException ex){
        return  new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
