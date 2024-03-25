package com.lmskrishna.lms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.lmskrishna.lms.Model.Book;
import com.lmskrishna.lms.exception.BookNotFoundException;
import com.lmskrishna.lms.repository.BookRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class BookController {
    	@Autowired
	BookRepository bookRepository;
@GetMapping("/lms/getbooks")
public List<Book> getAllBooks() {
	return bookRepository.findAll();
}
@GetMapping("/lms/getbook/{isbn}")
public Book getBook(@PathVariable Long isbn) {
    return bookRepository.findById(isbn)
	.orElseThrow(()->new BookNotFoundException(isbn));
}


@PostMapping("/lms/addbook")
public Book addBook(@RequestBody Book book) {
    return bookRepository.save(book);
}

//Add the books with the json insertion
List<Book> bookList = new ArrayList<Book>();
@PostMapping("/lms/addbooks")
public List<Book> addBooksList(@RequestBody ArrayList<Book> bookList) {
    
    return bookRepository.saveAll(bookList);
}
//update the details of existing books
@PutMapping("lms/changebook/{isbn}")
public Book changeBook(@PathVariable Long isbn, @RequestBody Book updateBook) {
        return bookRepository.findById(isbn)
		.map(bookMap -> {
            bookMap.setAuthno(updateBook.getAuthno());
            bookMap.setTitle(updateBook.getTitle());
            bookMap.setEdition(updateBook.getEdition());
            bookMap.setPrice(updateBook.getPrice());
            return bookRepository.save(bookMap);
        }).orElseThrow(()-> new BookNotFoundException(isbn));
    
}

@DeleteMapping("/lms/deletebook/{isbn}")
public String deleteBook(@PathVariable Long isbn) {
	if(!bookRepository.existsById(isbn)) {
		throw new BookNotFoundException(isbn);
	}
	bookRepository.deleteById(isbn);
	return "Book Deleted Successfully";
}


}
