package com.daceze.BMS.service;

import com.daceze.BMS.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    String addBook(Book b);
    Book updateBook(Book b);
    String deleteBook(String id);
    String giveReview();

    String clearDB();
}
