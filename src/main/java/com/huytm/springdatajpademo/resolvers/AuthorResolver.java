package com.huytm.springdatajpademo.resolvers;

import com.huytm.springdatajpademo.entities.Author;
import com.huytm.springdatajpademo.entities.Book;
import com.huytm.springdatajpademo.repositories.BookRepository;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorResolver implements GraphQLResolver<Author> {
    @Autowired
    BookRepository bookRepository;

    public List<Book> books(Author author){
        return bookRepository.findAllByAuthor_Id(author.getId());
    }
}
