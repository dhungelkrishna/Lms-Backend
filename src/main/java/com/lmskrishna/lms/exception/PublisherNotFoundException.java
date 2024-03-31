package com.lmskrishna.lms.exception;

import com.lmskrishna.lms.Model.Publisher;

public class PublisherNotFoundException extends RuntimeException{
    public PublisherNotFoundException(Long publisherId) {
        super("Publisher of id " + publisherId + " was not found.");
    }
    
}
