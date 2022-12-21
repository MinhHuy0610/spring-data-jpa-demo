package com.huytm.springdatajpademo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Book implements Serializable {
    @Id
    @lombok.NonNull
    private String isbn;
    private String title;
    private Integer edition;
    private Integer publishedYear;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "authorId", insertable = false, updatable = false)
    private Author author;
}