package com.modersdbootcamp.project1b.repo;

import com.modersdbootcamp.project1b.model.Book;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.data.redis.core.RedisTemplate;

public class BookRepositoryImpl {

    public BookRepositoryImpl(RedisTemplate<String, Object> redisTemplate) {

    }

    private void init() {
        Map<Long, Book> repository;
    }


    public void save(Book book) {
        init();
        repository.put(book);
    }

    public Map<Long, Book> findAll() {
        this.repository = new HashMap<>();
    }

}
