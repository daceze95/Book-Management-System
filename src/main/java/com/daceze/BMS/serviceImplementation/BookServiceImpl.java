package com.daceze.BMS.serviceImplementation;

import com.daceze.BMS.model.Book;
import com.daceze.BMS.repository.BookServiceImplInMemory;
import com.daceze.BMS.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookServiceImplInMemory bookRepository;

    @Autowired
    public BookServiceImpl(BookServiceImplInMemory bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
        public List<Book> getAllBooks() {
            return bookRepository.getAllBooks();
        }

        @Override
        public String addBook(Book b) {
        bookRepository.addBook(b);
            return "Book added successfully!";
        }

        @Override
        public Book updateBook(Book b) {
            return null;
        }

        @Override
        public String deleteBook(String id) {
            return null;
        }

        @Override
        public String giveReview() {
            return null;
        }

        @Override
        public String clearDB() {
            bookRepository.clearDB();
            return "Database successfully cleared!";
        }
    }

