package com.daceze.BMS.controller;

import com.daceze.BMS.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping("get-all-book")
    List<Book> getAllBooks(){
        return List.of(
                new Book(
                        "RN178953",
                        "Java Mastery",
                        "Engineer Arinze",
                        LocalDate.now().toString(),
                        "Guide to becoming a senior Java engineer...",
                        1050L
                )

        );
    }
}
