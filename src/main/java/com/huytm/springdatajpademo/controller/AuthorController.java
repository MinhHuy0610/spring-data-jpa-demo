package com.huytm.springdatajpademo.controller;

import com.huytm.springdatajpademo.entities.Author;
import com.huytm.springdatajpademo.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public List<Author> getAll(){
        return authorRepository.findAll();
    }
    @GetMapping("/{authorId}")
    public Author getAuthorById(@PathVariable("authorId") Long id){
        return authorRepository.findById(id).get();
    }

    //@PostMapping
}
