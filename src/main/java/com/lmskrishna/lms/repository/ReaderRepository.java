package com.lmskrishna.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lmskrishna.lms.Model.Reader;

public interface ReaderRepository extends JpaRepository<Reader,Long> {
    
}
