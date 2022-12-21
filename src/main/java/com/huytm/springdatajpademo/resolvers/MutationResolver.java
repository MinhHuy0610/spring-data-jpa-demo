package com.huytm.springdatajpademo.resolvers;

import com.huytm.springdatajpademo.entities.Author;
import com.huytm.springdatajpademo.entities.AuthorInput;
import com.huytm.springdatajpademo.repositories.AuthorRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class MutationResolver implements GraphQLMutationResolver {
    @Autowired
    AuthorRepository authorRepository;

    public Author updateAuthor(AuthorInput input){
        Author author = new Author();
        author.setId(input.getId());
        author.setFullname(input.getFullname());
        return authorRepository.saveAndFlush(author);
    }

    public boolean deleteAuthor(Long authorID){
        authorRepository.deleteById(authorID);
        return true;
    }
}
