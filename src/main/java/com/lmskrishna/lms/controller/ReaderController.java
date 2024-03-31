package com.lmskrishna.lms.controller;

import org.springframework.web.bind.annotation.RestController;

import com.lmskrishna.lms.Model.Reader;
import com.lmskrishna.lms.repository.PhoneNumberRepository;
import com.lmskrishna.lms.repository.ReaderRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ReaderController {
    @Autowired
    private ReaderRepository readerRepository;

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;
    //getting all reader.
    @GetMapping("/lms/getReaders")
    public List<Reader> getMethodName() {
        return readerRepository.findAll();
    }
    //Getting the phone number with the help of userid;
    /* 
    @GetMapping("/lms/getReader/{userId}/phoneNumbers")
    public List<Reader> getPhoneNumbers(@PathVariable Long userId) {
          Optional<Reader> readerOptional = readerRepository.findById(userId);
    if (readerOptional.isPresent()) {
        Reader reader = readerOptional.get();
        return reader.getPhoneNumbers();
    } else {
        throw new EntityNotFoundException("Reader not found with id: " + userId);
    }
}
*/
    
    
    
}
