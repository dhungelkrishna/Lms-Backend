package com.lmskrishna.lms.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long isbn) {
        super("Book Not Found of Isbn --> " + isbn);
    }
    public BookNotFoundException(String message) {
        super(message);
    }
    
}
