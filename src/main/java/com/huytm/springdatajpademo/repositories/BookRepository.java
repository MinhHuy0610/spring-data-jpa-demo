package com.huytm.springdatajpademo.repositories;

import com.huytm.springdatajpademo.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, String>{
    List<Book> findAllByAuthor_Id(Long authorID);
}
