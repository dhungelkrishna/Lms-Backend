package com.lmskrishna.lms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lmskrishna.lms.Model.Publisher;
import com.lmskrishna.lms.exception.PublisherNotFoundException;
import com.lmskrishna.lms.repository.PublisherRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping("/lms")
public class PublisherController {
    @Autowired
    PublisherRepository publisherRepository;

    @GetMapping("/publishers")
    public List<Publisher> getPublishers() {
        return publisherRepository.findAll();
    }

    //Searching the specific Publisher Oonly.
    @GetMapping("/publisher/{id}")
    public Publisher getPublisherById(@PathVariable Long id) {
        return publisherRepository.findById(id)
        .orElseThrow(()-> new PublisherNotFoundException(id));
    }

    //inserting teh Publisher details.
    @PostMapping("/publisher")
    public String addPublisherDetails(@RequestBody Publisher publisher) {
       publisherRepository.save(publisher);
        return "Publisher details inserted. " + publisher;
    }
    List<Publisher> publisherList = new ArrayList<Publisher> ();
    //inserting the publisher list at bunch.
    @PostMapping("/publishers")
    public List<Publisher> addPublishers(@RequestBody ArrayList<Publisher> publisherList) {
        return publisherRepository.saveAll(publisherList);
    }
    //Delete the publisher.
    @DeleteMapping("publisher/{publisherId}")
    public String deletePublisher(@PathVariable Long publisherId) {
        if(!publisherRepository.existsById(publisherId)) {
            throw new PublisherNotFoundException(publisherId);
        }
    publisherRepository.deleteById(publisherId);
    return "User Deleted Successfully with Publisher ID. " + publisherId;
    }



    //update the publisehr details after time
    @PutMapping("/publisher/{id}")
    public Publisher putPublisher(@PathVariable Long id, @RequestBody Publisher updatePublisher) {
        return publisherRepository.findById(id)
        .map(publisherMap ->{
            publisherMap.setPublisherName(updatePublisher.getPublisherName());
            publisherMap.setYop(updatePublisher.getYop());
            return publisherRepository.save(publisherMap);
        }).orElseThrow(() -> new PublisherNotFoundException(id));
    }
    
    
}
