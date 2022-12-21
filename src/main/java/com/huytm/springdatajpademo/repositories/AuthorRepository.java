package com.huytm.springdatajpademo.repositories;

import com.huytm.springdatajpademo.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Author,Long> {
}
