package com.modersdbootcamp.project1b.repo;

import com.modersdbootcamp.project1b.model.Book;
import java.util.Map;

public class BookRepositoryImpl {

    public BookRepositoryImpl(RedisTemplate<String, Object> redisTemplate);
    private void init();
    public void save(Book book);
    public Map<Long, Book> findAll();

}
