package com.huytm.springdatajpademo.resolvers;

import com.huytm.springdatajpademo.entities.Author;
import com.huytm.springdatajpademo.entities.Book;
import com.huytm.springdatajpademo.repositories.AuthorRepository;
import com.huytm.springdatajpademo.repositories.BookRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class QueryResolver implements GraphQLQueryResolver {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }
    public Author getAuthor(Long authorID){
        return authorRepository.findById(authorID).get();
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public List<Book> getBooksByAuthor(Long authorID){
        return bookRepository.findAllByAuthor_Id(authorID);
    }
    public Book getBookByIsbn(String isbn){
        return bookRepository.findById(isbn).get();
    }
}
