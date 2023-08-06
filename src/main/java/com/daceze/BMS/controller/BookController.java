package com.daceze.BMS.controller;

import com.daceze.BMS.model.Book;
import com.daceze.BMS.service.BookService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    private BookService bookService;

    public BookController(@Qualifier("DB") BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("get-all-book")
    List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("add-book")
    String addBook(@RequestBody Book b){
        return bookService.addBook(b);
    }

    @PostMapping
    String clearDB(){
        return bookService.clearDB();
    }
}
