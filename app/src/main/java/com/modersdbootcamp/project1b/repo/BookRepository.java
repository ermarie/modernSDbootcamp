package com.modersdbootcamp.project1b.repo;

import com.modersdbootcamp.project1b.model.Book;
import java.util.Map;

public interface BookRepository {

    void save(Book book);
    Map<Long, Book> findAll();

}
