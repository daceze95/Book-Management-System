package com.daceze.BMS.repository;

import com.daceze.BMS.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookServiceImplInMemory{

    private final List<Book> bookRepository = new ArrayList<>();

    public List<Book> getAllBooks() {
        return bookRepository;
    }

    public String addBook(Book b) {
            bookRepository.add(b);
        return "Book added successfully!";
    }

    public Book updateBook(Book b) {
        return null;
    }

    public String deleteBook(String id) {
        return null;
    }

    public String giveReview() {
        return null;
    }

    public String clearDB() {
         bookRepository.clear();
        return "Database successfully cleared!";
    }
}
