package com.lmskrishna.lms.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class PublisherNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(PublisherNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> exceptionHandler(PublisherNotFoundException px) {
        Map<String,String> errorMap = new HashMap<>();
        errorMap.put("Errormessage Printing.", px.getMessage());
        return errorMap;
    }
    
}
