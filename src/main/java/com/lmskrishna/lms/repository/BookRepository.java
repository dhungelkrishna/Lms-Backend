package com.lmskrishna.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lmskrishna.lms.Model.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
    
}
