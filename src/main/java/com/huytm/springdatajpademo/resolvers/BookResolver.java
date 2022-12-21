package com.huytm.springdatajpademo.resolvers;

import com.huytm.springdatajpademo.entities.Author;
import com.huytm.springdatajpademo.entities.Book;
import graphql.kickstart.tools.GraphQLResolver;

public class BookResolver implements GraphQLResolver<Book> {
    Author author(Book book){
        return book.getAuthor();
    }
}
