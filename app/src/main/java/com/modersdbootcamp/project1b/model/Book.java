package com.modersdbootcamp.project1b.model;

public class Book {

    private String title;
    private long isbn;
    private String author;
    private double price;
    private int numInStock;

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }

    public Book(String title, long isbn, String author, double price, int numInStock) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.price = price;
        this.numInStock = numInStock;
    }

    public String getTitle() {
        return title;
    }

    public int getNumInStock() {
        return numInStock;
    }

    @java.lang.Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                ", numInStock=" + numInStock +
                '}';
    }


}

