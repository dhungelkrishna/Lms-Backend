package com.lmskrishna.lms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class LmsApplication {


	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);
	}

@GetMapping("/lms/{message}")
public String welcomeUser(@PathVariable String message) {
	return "Welcome in Library management System! "+message;
}



}
