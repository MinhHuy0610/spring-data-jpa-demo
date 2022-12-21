package com.huytm.springdatajpademo.controller;

import com.huytm.springdatajpademo.entities.Author;
import com.huytm.springdatajpademo.entities.Book;
import com.huytm.springdatajpademo.repositories.AuthorRepository;
import com.huytm.springdatajpademo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAll(){
        return bookRepository.findAll();
    }
}
