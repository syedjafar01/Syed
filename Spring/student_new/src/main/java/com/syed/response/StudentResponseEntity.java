package com.syed.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by syedjafar on 19/12/16.
 */
public class StudentResponseEntity<T> extends ResponseEntity<T> {


    public StudentResponseEntity(HttpStatus statusCode) {
        super(statusCode);
    }
}
