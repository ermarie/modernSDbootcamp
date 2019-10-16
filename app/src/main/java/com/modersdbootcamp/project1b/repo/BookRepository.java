package com.modersdbootcamp.project1b.repo;

import com.modersdbootcamp.project1b.model.Book;
import java.util.Map;
import org.springframework.data.redis.core.RedisTemplate;

public interface BookRepository {

    void save(Book book);
    Map<Long, Book> findAll();

}
