package com.modersdbootcamp.project1b.model;

import com.modersdbootcamp.project1b.model.Book;

import java.util.ArrayList;

public class BookCatalog {

    public ArrayList<Book> bookArr = new ArrayList<Book>() {
    };

    public BookCatalog() {
        bookArr.add(new Book("Lord of the Rings", 2398, "J.R.R. Tolkien", 4, 15));
        bookArr.add(new Book("The Hobbit", 2399, "J.R.R. Tolkien", 3, 12));
        bookArr.add(new Book("HPPOA", 2400, "J.K. Rowling", 8, 20));
    }

    public ArrayList<Book> getBookArr() {
        return bookArr;
    }

    public void addBook(Book book){
        bookArr.add(book);
    }

    public Book purchaseBook(Book book){
        int numInStock = book.getNumInStock();
        numInStock -= 1;
        book.setNumInStock(numInStock);
        return book;
    }

    public Book findBook(
            String title) {
        for (int i = 0; i < this.bookArr.size(); i++)
            if (this.bookArr.get(i).getTitle().equals(title)) return this.bookArr.get(i);
        return null;
    }

}
