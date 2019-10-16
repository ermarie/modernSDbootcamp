package com.modersdbootcamp.project1b.controller;

import java.util.ArrayList;

import com.modersdbootcamp.project1b.model.Book;
import com.modersdbootcamp.project1b.model.BookCatalog;
import com.modersdbootcamp.project1b.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping
public class BookCatalogController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/save")
    public String save() {
        bookRepository.save(new Book("To Kill a Mockingbird", 9781455559510L, "Harper Lee", 9.32, 1));
        return "Added Sample Book!";
    }

    @RequestMapping("/findAll")
    public String findAll() {
        String result = "";
        Map<Long, Book> books = bookRepository.findAll();
        for (Book book : books.values()) {
            result += book.toString() + "<br>";
        }

        return result + " Returned 1 Book!";
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    @GetMapping(path="/catalog")
    public @ResponseBody ResponseEntity<ArrayList> getBookArr() {
        BookCatalog bookArr = new BookCatalog();
        return new ResponseEntity<>(bookArr.getBookArr(), HttpStatus.OK);
    }

    @PostMapping(path="/catalog")
    public @ResponseBody ResponseEntity<?> addToBookArr(@RequestBody Book book){
        BookCatalog bookArr = new BookCatalog();
        bookArr.addBook(book);
        return new ResponseEntity<>(bookArr.getBookArr(), HttpStatus.OK);
    }

    @PutMapping(path="/catalog/{title}")
    public ResponseEntity<?> updateBook(@PathVariable String title){
        BookCatalog bookArr = new BookCatalog();
        Book bookToUpdate = bookArr.findBook(title);
        Book updatedBook = bookArr.purchaseBook(bookToUpdate);
        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }

}